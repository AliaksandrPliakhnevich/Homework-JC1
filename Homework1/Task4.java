package JC1.Homework.Homework1_Correction;

/**
 * Задание № 4
 *
 * 1) В переменной min лежит число от 0 до 59.
 * Определите в какую четверть часа попадает это число
 * (в первую, вторую, третью или четвертую).
 *
 * - от 0 до 14 - первая
 * - от 15 до 29 - вторая
 * - от 30 до 44 - третья
 * - от 45 до 59 - четвертая
 * - если число не входит в диапазон, то вывести сообщение об этом
 *
 * Пример пример сообщения:
 * System.out.println("первая")
 *
 * Пример вызова функции в main:
 * checkTimePath(15)
 * checkTimePath(100)
 *
 * 2) В функцию приходит время в виде миллисекунд.
 * Необходимо вывести в консолько сколько в этих миллисекундах
 * часов, минут и секунд. 1секунда = 1000 милиссекунд.
 *
 * Пример вывода:
 * int hours = ...
 * System.out.println("Часы: " + hours)
 */

public class Task4 {

    public static void checkTimePath(int number) {
        /** NOTE! Лучше не писать все в одну строку.
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
        
        // исправил
        
        if (number >= 0 && number <= 14) {
            System.out.println("первая");
        } else if (number >= 15 && number <= 29) {
            System.out.println("вторая");
        } else if (number >= 30 && number <= 44) {
            System.out.println("третья");
        } else if (number >= 45 && number <= 59) {
            System.out.println("четвертая");
        } else {
            System.out.println("число не входит в заданный диапазон");
        }
    }

    public static void parseMilliseconds(long milliseconds) {
        // TODO написать деление миллисекунд
        System.out.println(milliseconds + " миллисек. состоит из:");
        int hours = (int) (milliseconds / (60 * 60 * 1000));
        System.out.println("Часы: " + hours);
        int millisecondsWithoutHours = (int) (milliseconds - hours * (60 * 60 * 1000));
        int minutes = millisecondsWithoutHours / (60 * 1000);
        System.out.println("Минуты: " + minutes);
        int millisecondsWithoutMinutes = millisecondsWithoutHours - minutes * (60 * 1000);
        int seconds = millisecondsWithoutMinutes / (1000);
        System.out.println("Секунды: " + seconds);
    }

    public static void main(String[] args) {
        // вызвать функцию здесь с разными сходными параметрами
        checkTimePath (-5);
        checkTimePath (15);

        parseMilliseconds(25600000L);
    }
}
