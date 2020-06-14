package JC1.Homework.Homework1_Correction;

/**
 * Задание № 3
 *
 * 1) Написать алгоритм проверки необходимости человеку работать.
 * Функция имеет два параметра:
 * - isWeekDay показывает это рабочий день (true) или выходной(false)
 * - isHoliday показывает нахожусь ли я в отпуске true) или нет(false)
 *
 * Задание:
 * - если человек в отпуске или сейчас выходной день, то вывести в консоль
 * сообщение "Отдыхай"
 * - иначе вывести сообщение "Давай работай"
 * Вывод сообщения произвести в консоль
 */

public class Task3 {

    public static void checkHoliday(boolean isWeekDay, boolean isHoliday) {
        /** NOTE! Тут можно было сделать проще.
         * Только с одним if и else.
         *
         * if(...) {
         *
         * } else {
         *
         * }
         *
         * Подумай как.
         * Если не захочешь исправлять, то напиши мне. Я пришлю ответ.
         **/
        
        // исправил
        
        if (isHoliday || !isWeekDay){
            System.out.println("Отдыхай");
        } else {
            System.out.println("Давай работай");
        }
    }

    public static void main(String[] args) {
        checkHoliday(true, false); // вызвать функцию здесь
    }
}
