package JC1.Homework.Homework1_Correction;

/**
 * Задание № 2
 *
 * 1) Написать алгоритм проверки числа на четность.
 * в методе main вывести сообщение:
 * - System.out.println("Четное"), если введенное число было четным,
 * то есть функция вернула true
 * - System.out.println("Нечетное"), если введенное число было нечетным,
 * то есть функция вернула false
 *
 * 2) Написать фукнцию расчета среднего числа между 4-мя значениями.
 * Результат вывести в консоль в main
 *
 * 3) переделайте код метода clearOperator1() так,
 * чтобы использовались операции +=, -=, *=, /=.
 * Количество строк кода при этом не должно измениться.
 *
 * 4) Переделайте этот код метода clearOperator2(),
 * чтобы в нем использовались операции ++ и --.
 * Количество строк кода при этом не должно измениться.
 *
 * 5) Вычислить выражения (записать в пригодной для java форме):
 * знак "/" - дробь. Вычисления можно сделать либо отдельной функцией,
 * либо в методе main.
 *
 * a) (1/4 + 5/8 - 1) * 9 - 3
 * b) 9 + 3.6 + (33/(48*5/3))
 * c) 10 * 1/2 + (48*5/3)
 *
 */

public class Task2 {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0; // TODO написать проверку на четность входного числа
    }

    public static double getAvgNumber(int x, int y, int z, int l) {
        // среднего числа - это среднего арифметического?
        return (x + y + z + l) / 4.0; // TODO написать расчет среднего значения для входных параметров
    }

    public static void clearOperator1() {
        int num = 47;
        num += 7;
        num -= 18;
        num *= 10;
        num /= 15;
        System.out.println("clearOperator1 " + num);
    }

    public static void clearOperator2() {
        int num = 47;
        num ++;
        num --;
        num ++;
        num --;
        System.out.println("clearOperator1 " + num);
    }

    public static void main(String[] args) {
        
        if (isEvenNumber(5)) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
        
        System.out.println("Среднее число между четырмя значениями: " + getAvgNumber(5, 4, 0, 10));
        
        clearOperator1();
        
        double res1 = (1/4.0 + 5/8.0 - 1) * 9 - 3;
        double res2 = 9 + 3.6 + ((double) 33 / (48 * 5 / 3.0));
        double res3 = 10 * 1 / 2.0 + (48 * 5 / 3.0);

        System.out.println("a) (1/4 + 5/8 - 1) * 9 - 3 = " + res1);
        System.out.println("b) 9 + 3.6 + (33/(48*5/3)) = " + res2);
        System.out.println("c) 10 * 1/2 + (48*5/3) = " + res3);
    }
}
