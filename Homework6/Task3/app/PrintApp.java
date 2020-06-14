package JC1.Homework.Homework6.Task3.app;

import JC1.Homework.Homework6.Task3.printers.ListOfDevices;
import JC1.Homework.Homework6.Task3.printers.Printable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PrintApp {

    private final Scanner scanner;
    private final ListOfDevices ourRealPrintDevices;
    private Printable device;
    private int userChoiseDevice;
    private int userChoiseAfterPrint;
    private String userNoteForPrint;

    public PrintApp(ListOfDevices ourRealPrintDevices) {
        this.scanner = new Scanner(System.in);
        this.ourRealPrintDevices = ourRealPrintDevices;
    }

    public void appGo() {
        while (true) {
            PrintText.printChoiseDeviceMenu(ourRealPrintDevices); // печатаем доступные устройства
            setUserChoiseDevice(); // выбор устройства
            device = ourRealPrintDevices.getDevice(userChoiseDevice); // принимаем устройство печати
            while (true) {
                PrintText.printEnterNoteMenu();
                setUserNoteForPrint(); // ввод сообщения для печати
                device.toPrint(userNoteForPrint); // печать сообщения на выбранном устройстве
                PrintText.printAfterPrintMenu(); // программа спрашивает напечатать новое сообщение на текущем устройстве или выбрать другое устройство или выход
                setUserChoiseAfterPrint(); // устанавливаем выбор 1-3
                doAccordingUserChoise(userChoiseAfterPrint); //выход, новое сообщение или новое устройство
            }
        }
    }

    private void setUserChoiseDevice() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("([1-9]{1})|([1-9]{1}\\d+)", str)) {
            this.userChoiseDevice = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setUserChoiseDevice();
        }
    }

    private void setUserNoteForPrint() {
        this.userNoteForPrint = scanner.nextLine();
    }

    private void setUserChoiseAfterPrint() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[0-3]{1}", str)) {
            this.userChoiseAfterPrint = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setUserChoiseAfterPrint();
        }
    }

    private void doAccordingUserChoise(int userChoiseAfterPrint) {
        switch (userChoiseAfterPrint) {
            case 0:
                exit();
                break;
            /**
             * NOTE! А нужно ли тут проверять значение на 1, елси ты не делаешь
             * никаких действий?
             */
            // не нужно, понял, поправляю. Если значение 1 - то отработает default
            case 2:
                appGo();
                break;
            default:
                break;
        }
    }

    private void exit() {
        scanner.close();
        Runtime.getRuntime().exit(0);
    }

}
