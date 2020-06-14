package JC1.Homework.Homework6.Task3.app;

import JC1.Homework.Homework6.Task3.printers.ListOfDevices;

public class PrintText {

    private static final String MENU_CORRECTION_TEXT = "Введите корректное значение";
    private static final String MENU_CHOISE_DEVICE_TEXT = "Выберите устройство для печати из доступных:";
    private static final String MENU_ENTER_NOTE_TEXT = "Введите ваше сообщение для печати:";    
    private static final String MENU_AFTER_PRINT_TEXT = "1 - Напечатать новое сообщение на текущем устройстве\n2 - Выбрать новое устройство\n0 - Выход";
    

    public static void printCorrectionMenu() {
        System.out.println(MENU_CORRECTION_TEXT);
    }

    public static void printChoiseDeviceMenu(ListOfDevices ourRealPrintDevices) {
        System.out.println(MENU_CHOISE_DEVICE_TEXT);
        System.out.print(ourRealPrintDevices.getAllDevices());
    }

    public static void printEnterNoteMenu() {
        System.out.println(MENU_ENTER_NOTE_TEXT);
    }
    
    public static void printAfterPrintMenu() {
        System.out.println(MENU_AFTER_PRINT_TEXT);
    }

}
