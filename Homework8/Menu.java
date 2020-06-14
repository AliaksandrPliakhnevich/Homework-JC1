package JC1.Homework.Homework8;

import static JC1.Homework.Homework8.logs.LoggerTextConsts.*;
import JC1.Homework.Homework8.exception.MenuActionException;
import JC1.Homework.Homework8.logs.MyLogger;
import JC1.Homework.Homework8.menu.item.MainMenuAction;
import JC1.Homework.Homework8.menu.item.MenuItem;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static JC1.Homework.Homework8.menu.MenuTextConst.*;
import static JC1.Homework.Homework8.menu.MenuFactory.getMainMenu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

class Menu {

    private final FileManager fileManager;
    private final Scanner scanner;
    private final MyLogger logger;

    Menu(String rootDirPath, String backUpPath, String logFilePath) {
        this.fileManager = new FileManager(rootDirPath, backUpPath);
        this.scanner = new Scanner(System.in);
        this.logger = new MyLogger(logFilePath);
    }

    void start() {
        logger.writeLog(LOGGER_TEXT_START_OF_PROGRAM);
        while (true) {
            printMenuItems(getMainMenu(MainMenuAction.values()));
            try {
                int menuNumber = readIntFromConsole();
                MainMenuAction mainMenuAction = MainMenuAction.getMainMenuAction(menuNumber);
                mainMenuAction(mainMenuAction);
            } catch (MenuActionException e) {
                e.printStackTrace();
                printText(ACTION_ITEM_ERROR_MESSAGE);
            }
        }
    }

    private void mainMenuAction(MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case READ_FILE:
                workWithFiles();
                break;
            case ADD_FILE:
                addNewFileAction();
                break;
            case DELETE_FILE:
                deleteFileAction();
                break;
            case ADD_TEXT_TO_FILE:
                addTextAction();
                break;
            case ZIP_FILES:
                zipFiles();
                break;
            case UNZIP_FILES:
                unzipFiles();
                break;
            case EXIT:
                logger.writeLog(LOGGER_TEXT_END_OF_PROGRAM);
                System.exit(0);
        }

    }

    private void addNewFileAction() {
        printText(ADD_FILE_NAME_MESSAGE);
        String fileName = readStringFromConsole();
        printText(ADD_FILE_TEXT_MESSAGE);
        String fileText = readStringLines();

        try {
            fileManager.writeFile(fileName, fileText);
            logger.writeLog(LOGGER_TEXT_CREATE_NEW_FILE_WITH_NAME, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            printText(WRITE_FILE_ERROR_MESSAGE);
        }
    }

    private void workWithFiles() {
        List<File> files = fileManager.getFileListFromRootDir();
        logger.writeLog(LOGGER_TEXT_READ_FILES);
        String text;
        try {
            if (!files.isEmpty()) {
                printFiles(files);
                printText(CHOISE_FILE_MESSAGE);
                File file = files.get(readIntFromConsole());
                text = fileManager.readFile(file);
                logger.writeLog(LOGGER_TEXT_READ_FILE_BY_NAME, file.getName());
            } else {
                text = READ_DIR_ERROR_MESSAGE;
            }
        } catch (IOException e) {
            e.printStackTrace();
            text = READ_FILE_ERROR_MESSAGE;
        }
        printText(text);
    }

    private void printMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            printText(menuItem);
        }
    }

    private int readIntFromConsole() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private String readStringFromConsole() {
        return scanner.nextLine();
    }

    private String readStringLines() {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = readStringFromConsole()) != null && !line.equals("*exit")) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }

    private void deleteFileAction() {
        List<File> files = fileManager.getFileListFromRootDir();
        logger.writeLog(LOGGER_TEXT_READ_FILES);
        String text;
        if (!files.isEmpty()) {
            printFiles(files);
            printText(CHOISE_FILE_MESSAGE);
            File file = files.get(readIntFromConsole());
            if (file.delete()) {
                logger.writeLog(LOGGER_TEXT_DELETE_FILE_WITH_NAME, file.getName());
                text = DELETE_FILE_MESSAGE;
            } else {
                text = DELETE_FILE_ERROR_MESSAGE;
            }
        } else {
            text = READ_DIR_ERROR_MESSAGE;
        }
        printText(text);
    }

    private void addTextAction() {
        List<File> files = fileManager.getFileListFromRootDir();
        logger.writeLog(LOGGER_TEXT_READ_FILES);
        if (!files.isEmpty()) {
            printFiles(files);
            printText(CHOISE_FILE_MESSAGE);
            File file = files.get(readIntFromConsole());
            try {
                printText(ADD_TEXT_TO_FILE_MESSAGE);
                fileManager.addTextToFile(file, readStringLines());
                logger.writeLog(LOGGER_TEXT_CHANGE_FILE_WITH_NAME, file.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            printText(READ_DIR_ERROR_MESSAGE);
        }

    }

    private void zipFiles() {
        printText(ADD_FILE_NAME_MESSAGE);
        String backUpFileName = readStringFromConsole();
        File backUpFile = fileManager.createNewBackUpFile(backUpFileName);

        try (FileOutputStream fos = new FileOutputStream(backUpFile);
                ZipOutputStream zipOut = new ZipOutputStream(fos)) {

            List<File> files = fileManager.getFileListFromRootDir();

            for (File file : files) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    ZipEntry zipEntry = new ZipEntry(file.getName());
                    zipOut.putNextEntry(zipEntry);

                    byte[] bytes = new byte[1024];
                    int length;
                    while ((length = fis.read(bytes)) >= 0) {
                        zipOut.write(bytes, 0, length);
                    }
                    fis.close();
                    zipOut.closeEntry();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            logger.writeLog(LOGGER_TEXT_ZIP_FILES);
            zipOut.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * NOTE! Не самое лучшее расположение для этого метода и unzipFiles. Этот
     * класс предназначен только для работы с меню. В нем ничего другого быть не должно.
     */
    private void unzipFiles() {
        File latestZipFile = getLatestFilefromBackUpDir();

        if (latestZipFile == null) {
            printText(READ_DIR_ERROR_MESSAGE);
            return;
        }

        List<File> filesFromRootDir = fileManager.getFileListFromRootDir();

        byte[] buffer = new byte[1024];

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(latestZipFile))) {
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                for (File fileFromRootDir : filesFromRootDir) {
                    if (zipEntry.getName().equals(fileFromRootDir.getName())) {
                        fileFromRootDir.delete();
                    }
                }
                File fileAfterBackUp = new File(fileManager.getRootDirectory(), zipEntry.getName());

                try (FileOutputStream fos = new FileOutputStream(fileAfterBackUp)) {
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                }
                printText(String.format(UNZIP_FILE_MESSAGE, zipEntry.getName()));
                zipEntry = zis.getNextEntry();
            }
            logger.writeLog(LOGGER_TEXT_UNZIP_FILES);
            zis.closeEntry();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private File getLatestFilefromBackUpDir() {
        List<File> files = fileManager.getFileListFromBackUpDir();
        if (files.isEmpty()) {
            return null;
        }
        File lastModifiedFile = files.get(0);
        for (int i = 1; i < files.size(); i++) {
            if (lastModifiedFile.lastModified() < files.get(i).lastModified()) {
                lastModifiedFile = files.get(i);
            }
        }
        return lastModifiedFile;
    }

    private <T> void printText(T text) {
        System.out.println(text.toString());
    }

    private void printFiles(List<File> files) {
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            printText(String.format(ITEM_WITH_NUMBER, i, file.getName()));
        }
    }

}
