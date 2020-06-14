package JC1.Homework.Homework7.Task1;

public class PrintText {

    private static final String MENU_START_TEXT = "Введите число";
    private static final String MENU_RESULT_TEXT = "Выводим числа от 0 до ";
    private static final String MENU_CORRECTION_TEXT = "Введите корректное число";

    public static void printStartMenu() {
        System.out.println(MENU_START_TEXT);
    }

    public static void printResult(int n) {
        System.out.print(MENU_RESULT_TEXT + n + " : " + getNumbersRow(n) + "\n");
    }

    private static String getNumbersRow(int n) { // с трудом дошёл до понимания работы этого рекурсивного метода))
        if (n == 0) {
            return "0";
        }
        return getNumbersRow(n-1) + ", " + n;
    }
    
    public static void printCorrectionMenu() {
        System.out.println(MENU_CORRECTION_TEXT);
    }

}
