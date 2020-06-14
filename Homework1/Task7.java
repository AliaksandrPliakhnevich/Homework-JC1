package JC1.Homework.Homework1_Correction;

/**
 * Задание № 7
 *
 * 1) Написать функцию определения количества дней месяца месяца по его номеру.
 * То есть, в функцию будет подано число. Если это число находится
 * в диапазоне 1 - 12, то нам нужно соответствующее количество дне для месяца и
 * его название.
 * Если же было введено число, которое не попадает в заданный диапазон,
 * то нужно вывести сообщение с ошибкой ("Число не в диапазоне").
 *
 * Решение должно быть представлено в двух вариантах в отдельных функциях:
 * - с использованием if-else.
 * Подсказка: можно несколько раз использовать логическое "ИЛИ"(||)
 * - с использованием switch-case
 *
 * 2) Произвести вызов функций в main
 *
 *  Пример вызова:
 *  printMonthWithIfElse(12)
 *  printMonthWithIfElse(44)
 */

public class Task7 {

    public static void printDaysInMonthWithIfElse(int monthNumber) {
        new Task6().printMonthWithIfElse(monthNumber);
        
        if (monthNumber >= 1 && monthNumber <= 12) {
            int dayInMonth = 31;
            if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
                dayInMonth = 30;
            }
            if (monthNumber == 2) {
                dayInMonth = 28;
            }
            System.out.println("Число дней в месяце: " + dayInMonth);
        }        
    }

    public static void printDaysInMonthWithSwithCase(int monthNumber) {
        new Task6().printMonthWithSwithCase(monthNumber);

        /** NOTE!
         * Можно было еще так:
         *
         * switch(monthNumber) {
         *     case 1:
         *     case 3:
         *     case 5:
         *     case 7:
         *     case 8:
         *     case 10:
         *     case 12:
         *      System.out.println("Число дней в месяце: " + 31);
         *      break;
         *     case 2:
         *      System.out.println("Число дней в месяце: " + 28);
         *      break;
         *
         *      и т.д.
         * }
         **/

        switch (monthNumber){
            case 1: 
            case 3:             
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                System.out.println("Число дней в месяце: " + 31);
                break;            
            case 2: 
                System.out.println("Число дней в месяце: " + 28);
                break;
            case 4:            
            case 6:        
            case 9:            
            case 11: 
                System.out.println("Число дней в месяце: " + 30);
                break;
        }
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        printDaysInMonthWithIfElse(19);
        printDaysInMonthWithSwithCase(3);
    }
}
