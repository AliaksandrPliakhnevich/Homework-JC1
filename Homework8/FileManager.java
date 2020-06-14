package JC1.Homework.Homework8;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

class FileManager {

    private final File rootDirectory;
    private final File backUpDirectory;

    FileManager(String rootDirPath, String backUpPath) {
        this.rootDirectory = new File(rootDirPath);
        this.backUpDirectory = new File(backUpPath);
    }

    private static int compare(File file1, File file2) {
        return file1.getName().compareTo(file2.getName());
    }

    List<File> getFileListFromRootDir() {
        File[] fileArray = rootDirectory.listFiles();
        if (fileArray != null) {
            Arrays.sort(fileArray, FileManager::compare);
        }
        return fileArray != null ? asList(fileArray) : emptyList();
    }

    List<File> getFileListFromBackUpDir() {
        File[] fileArray = backUpDirectory.listFiles();
        if (fileArray != null) {
            Arrays.sort(fileArray, FileManager::compare);
        }
        return fileArray != null ? asList(fileArray) : emptyList();
    }

    String readFile(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    void writeFile(String fileName, String fileText) throws IOException {
        File file = new File(rootDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(fileText);
        }
    }

    //метод добавления текста, в конструкторе fw добавил true, чтобы bw текст добавлял, а не переписывал
    void addTextToFile(File file, String addedText) throws IOException {
        try (FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(addedText);
        }
    }

    File createNewBackUpFile(String backUpFileName) {
        File zipFile = new File(backUpDirectory, backUpFileName);
        if (!zipFile.exists()) {
            try {
                zipFile.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return zipFile;
        }
        return null;
    }

    public File getRootDirectory() {
        return rootDirectory;
    }

}
