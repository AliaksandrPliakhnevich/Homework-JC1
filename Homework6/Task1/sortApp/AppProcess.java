package JC1.Homework.Homework6.Task1.sortApp;

import JC1.Homework.Homework6.Task1.sorting.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AppProcess {

    private final Scanner scanner;
    private int userChoiseSortType;
    private int userChoiseSortDirection;
    private int userChoiseAfterSort;
    private double[] array;
    private Sorting sorting;

    public AppProcess() {
        this.scanner = new Scanner(System.in);
    }

    public void appProcess() {
        while (true) {
            PrintText.printStartMenu();
            setArray();

            PrintText.printChoiseSortTypeMenu();
            setUserChoiseSortType();
            exit(userChoiseSortType);

            PrintText.printSortDirectionMenu();
            setUserChoiseSortDirection();

            sorting = chooseSorting(userChoiseSortType);
            PrintText.printArray(getSortedArray(userChoiseSortDirection));

            PrintText.printAfterSortMenu();
            setUserChoiseAfterSort();
            exit(userChoiseAfterSort);
        }
    }

    private void setUserChoiseSortType() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[0-4]{1}", str)) {
            this.userChoiseSortType = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setUserChoiseSortType();
        }
    }

    private void setUserChoiseSortDirection() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[1-2]{1}", str)) {
            this.userChoiseSortDirection = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setUserChoiseSortDirection();
        }
    }

    private void setUserChoiseAfterSort() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[0-1]{1}", str)) {
            this.userChoiseAfterSort = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setUserChoiseAfterSort();
        }
    }

    private void setArray() {
        String str = scanner.nextLine();
        str = str.trim(); // обрезаем пробелы в начале и в конце строки
        str = str.replaceAll("\\s+", " "); // оставляем по одному пробелу между числами, если их вдруг несколько
        String[] strArray = str.split("\\s"); // получаем из строки массив, разделяя по пробелам
        boolean isStringCorrect = true; // считаем, что ввод был правильным
        for (int i = 0; isStringCorrect && i < strArray.length; i++) {
            if (!Pattern.matches("(-?\\d+(\\.?\\d+)?)+", strArray[i]) || strArray.length == 0) { // проверяем на соответствие шаблону вещественного или целого числа (-5.0 или -5)
                isStringCorrect = false; // значит ввод был неправильным, останавливаем цикл
            }
        }
        if (isStringCorrect) {
            this.array = new double[strArray.length]; // объявляем массив Double c длиной как у массива String
            for (int i = 0; i < this.array.length; i++) {
                this.array[i] = Double.parseDouble(strArray[i]);
            }
        } else {
            PrintText.printCorrectionMenu();
            PrintText.printStartMenu();
            setArray();
        }
    }

    private Sorting chooseSorting(int userChoiseSortType) {
        switch (userChoiseSortType) {
            case 1:
                return new BubbleSorting();
            case 2:
                return new ChoiseSorting();
            case 3:
                return new ShellSorting();
            default: 
                return null;
        }
        // мне кажется, все же в этом случае лучше оставить int,
        // чем заводить enum, про enum на практике понял,
        // в седьмой домашке буду делать выбор через enum
        /**
         * NOTE! Если ты не хочешь использовать default, то тебе нужно заводить
         * enum и проверять его. Только enum имеет конечное количество значений,
         * которое небольшое и чисто физически можно написать проверки для всех
         * его
         * значений
         */
    }

    private double[] getSortedArray(int userChoiseSortDirection) {
        switch (userChoiseSortDirection) {
            case 1:
                return sorting.sortArrayMinMax(array);
            case 2:
                return sorting.sortArrayMaxMin(array);
            default:
                return array;
        }
    }

    private void exit(int num) {
        if (num == 0) {
            scanner.close();
            Runtime.getRuntime().exit(0);
        }
    }
}

