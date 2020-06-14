package JC1.Homework.Homework6.Task1.sortApp;

public class PrintText {

    private static final String menuStartText = "Введите массив чисел через пробел";

    private static final String menuChoiseText1 = "1 – Сортировка пузырьком";
    private static final String menuChoiseText2 = "2 - Сортировка методом выбора";
    private static final String menuChoiseText3 = "3 – Сортировка методом Шелла";

    private static final String menuExitText = "0 – Выход";

    private static final String menuCorrectionText = "Введите корректное значение";

    private static final String menuSortText1 = "1 - сортировка по возрастанию";
    private static final String menuSortText2 = "2 - сортировка по убыванию";

    private static final String menuAfterSortText = "Хотите отсортировать ещё один массив?\n1 - Да";

    public static void printStartMenu() {
        System.out.println(menuStartText);
    }

    public static void printChoiseSortTypeMenu() {
        System.out.println(menuChoiseText1);
        System.out.println(menuChoiseText2);
        System.out.println(menuChoiseText3);
        System.out.println(menuExitText);
    }

    public static void printCorrectionMenu() {
        System.out.println(menuCorrectionText);
    }

    public static void printSortDirectionMenu() {
        System.out.println(menuSortText1);
        System.out.println(menuSortText2);
    }

    public static void printAfterSortMenu() {
        System.out.println(menuAfterSortText);
        System.out.println(menuExitText);
    }

    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
