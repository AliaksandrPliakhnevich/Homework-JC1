package JC1.Homework.Homework1_Correction;

/**
 * Задание № 6
 *
 * 1) Написать функцию определения месяца по его номеру.
 * То есть, в функцию будет подано число. Если это число находится
 * в диапазоне 1 - 12, то нам нужно вывести соответствующее имя месяца.
 * Если же было введено число, которое не попадает в заданный диапазон,
 * то нужно вывести сообщение с ошибкой ("Число не в диапазоне").
 *
 * Решение должно быть представлено в двух вариантах в отдельных функциях:
 * - с использованием if-else
 * - с использованием switch-case
 *
 * 2) Произвести вызов функций в main
 *
 * Пример вызова: printMonthWithIfElse(1)
 */

public class Task6 {

    /** NOTE! Ко всему кода в этом классе!
     *
     * Лучше не писать все в одну строку.
     * Понимаю что хочется чтобы было меньше строк,
     * но так лучше не делать. Сложнее читать код.
     * то есть дучше так:
     *
     * if() {
     *
     * } else if(){
     *
     * } else {
     *
     * }
     *
     * Если пишешь в IntellijIdea то нажки cltr + alt + L
     **/

    public static void printMonthWithIfElse(int monthNumber) {
        // исправил
        if (monthNumber == 1) {
            System.out.println("January");
        } else if (monthNumber == 2) {
            System.out.println("February");
        } else if (monthNumber == 3) {
            System.out.println("March");
        } else if (monthNumber == 4) {
            System.out.println("April");
        } else if (monthNumber == 5) {
            System.out.println("May");
        } else if (monthNumber == 6) {
            System.out.println("June");
        } else if (monthNumber == 7) {
            System.out.println("July");
        } else if (monthNumber == 8) {
            System.out.println("August");
        } else if (monthNumber == 9) {
            System.out.println("September");
        } else if (monthNumber == 10) {
            System.out.println("October");
        } else if (monthNumber == 11) {
            System.out.println("November");
        } else if (monthNumber == 12) {
            System.out.println("December");
        } else {
            System.out.println("Число не в диапазоне");
        }
    }

    public static void printMonthWithSwithCase(int monthNumber) {
        // исправил
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2: 
                System.out.println("February");
                break;
            case 3: 
                System.out.println("March");
                break;
            case 4: 
                System.out.println("April");
                break;
            case 5: 
                System.out.println("May"); 
                break;
            case 6: 
                System.out.println("June"); 
                break;
            case 7: 
                System.out.println("July");
                break;
            case 8: 
                System.out.println("August"); 
                break;
            case 9: 
                System.out.println("September"); 
                break;
            case 10: 
                System.out.println("October"); 
                break;
            case 11: 
                System.out.println("November"); 
                break;
            case 12: 
                System.out.println("December"); 
                break;
            default: 
                System.out.println("Число не в диапазоне");
        }

    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        printMonthWithIfElse(5);
        printMonthWithSwithCase(6);
    }
}
