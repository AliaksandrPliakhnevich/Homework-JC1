package JC1.Homework.Homework3.Homework3_Correction1;

import java.util.Scanner;

public class Task1_Homework3 {

    static int userChoiseMenu;
    static int ifDivide0;

    static void calculatorMenu() {
        // вывод меню и запуск метода scanMenu() с привоением значения полю userChoiseMenu
        System.out.println("Выберите функцию");
        System.out.println("1: Сложение");
        System.out.println("2: Разность");
        System.out.println("3: Умножение");
        System.out.println("4: Деление");
        System.out.println("0: Выход");
        userChoiseMenu = scanMenu();
    }

    static int scanMenu() {
    // главное меню, возвращает 0, 1, 2 ,3, 4
    // убрал блоки else и убрал цикл while, последний return запускает метод заново
    /** NOTE! Тут можно немного упростить код:
     * Убрать else блоки, а вывод сообщения деать в конце тела цикла.
     * Ты же все равно заканчиваешь этот цикл, только если число от 0 до 4
     * в любой другой ситуации ты выводишь сообщение об ошибке.*/
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int userChoiseMenu = scan.nextInt();
            if (userChoiseMenu >= 0 && userChoiseMenu <= 4) {
                return userChoiseMenu;
            }
        }    
        System.out.println("Введите корректное значение");
        return scanMenu();
    }

    static int scanMenuDivide0() {
        // меню при делении на 0, возвращает 1 или 2
        // убрал блоки else и убрал цикл while, последний return запускает метод заново
        Scanner scan = new Scanner(System.in);
        /** NOTE! Тут можно немного упростить код:
         * Убрать else блоки, а вывод сообщения деать в конце тела цикла.
         * Ты же все равно заканчиваешь этот цикл, только если число от 0 до 4
         * в любой другой ситуации ты выводишь сообщение об ошибке.*/
        if (scan.hasNextInt()) {
            int ifDivide0 = scan.nextInt();
            if (ifDivide0 >= 1 && ifDivide0 <= 2) {
                return ifDivide0;
            } 
        }
        System.out.println("Введите корректное значение");
        return scanMenuDivide0();    
    }

    static double getNumber(String s) {
        // ввод и возвращение числа с проверкой
        System.out.println(s);
        Scanner scan = new Scanner(System.in);
        // устранил
        /** NOTE! Тут можно немного упростить код:
         * Убрать else блоки, а вывод сообщения деать в конце тела цикла.
         * Ты же все равно заканчиваешь этот цикл, только если число от 0 до 4
         * в любой другой ситуации ты выводишь сообщение об ошибке.*/
        if (scan.hasNextDouble()) {
            /** NOTE! scan.nextDouble можно написать сразу рядом с ретурном.
             * Нет смысла заводить отдельную переменную.*/
            // устранил
            return scan.nextDouble();
        }
        System.out.println("Введите корректное значение");
        return getNumber(s);    
    }
    // делаю общий метод getNumber();
    /** NOTE! getFirstNumber и getSecondNumber по сути делают одно и то же.
     * По сути можно написать общую функцию, а в качестве парметра к этой функции
     * можно передавать отображаемые сообщения*/

    static void goCalc() {
        // создание нового объекта класса Calculator, проверка при делении на 0
        Calculator calc = new Calculator(getNumber("Введите первое число"), getNumber("Введите второе число"));
        if (userChoiseMenu == 4 && calc.secondNum == 0) {
            System.out.println("Делить на 0 нельзя");
            System.out.println("1: Ввести другое число");
            System.out.println("2: Выйти в меню");
            ifDivide0 = scanMenuDivide0();
            switch (ifDivide0) {
                case 1: 
                    // запрашиваем новое первое число
                    calc.firstNum = getNumber("Введите первое число");
                    // запрашиваем новое второе число, не равное 0
                    do {
                        calc.secondNum = getNumber("Введите второе число");
                    }
                    while (calc.secondNum == 0);
                    break;
                case 2:
                    return;
            }
        }
        System.out.println("Результат равен: " + calc.mathActions(userChoiseMenu) + "\n");    
    }

    public static void main(String[] args) {
        // зацикливаем выполнение калькулятора и останавливаем при вводе 0
        do {
            calculatorMenu();
            if (userChoiseMenu != 0) {
                goCalc();
            } else {
                break;
            }
        }
        while (true);
    }
}
