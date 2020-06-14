package JC1.Homework.Homework1_Correction;

/**
 * Задание № 5
 *
 * 1) Написать алгоритм округления числа до целого.
 * Например 2.5 -> 3, 2.6 -> 3, 2.4 -> 2
 *
 * Вызвать функцию в методе main, а результат вывести в консоль
 * Пример вызова:
 * int result = roundNumber(4.45)
 * System.out.println(result)
 *
 * 2) Написать алгоритм получения дробной части числа.
 * То есть, если у меня число 2.75, то я хочу получить 0.75
 *
 */

public class Task5 {

    public static int roundNumber(double number) {
        /** NOTE! Можно написать в 1 трочку кода.
         * Если не найдешь решение, то напиши мне.
         * Я пришлю ответ.
         **/
        
        // исправил, собирался уже применять Math.round(), но нам же нужен свой алгоритм
        // это решение нагуглил, но сразу понял, как оно работает
        
        return (int) (number + 0.5);    
    }

    public static double/*int*/ getTail(double number) { 
        //дробная часть числа - это double, а не int, поэтому корректирую возвр. тип
        /** NOTE! Можно написать return number - left; **/
        
        // исправил
        
        int left = (int) number;
        return number - left;
    }

    public static void main(String[] args) {
        // вызвать функцию здесь
        System.out.println(roundNumber(56.5));
        System.out.println(getTail(12.733));
    }
}
