package JC1.Homework.Homework7.Task3;

import java.util.HashSet;
import java.util.Set;

public class NumberGenerator {

    public static Set<Integer> generateNumbers(int n) {
        // мой метод для генерации массива неповторяющихся случайных чисел от 1 до 49 в количестве n
        // HashSet, чтобы хранить множество неповторяющихся чисел, и порядок нам не важен
        // если рандомное число повторяется, .add его не добавит и выдаст false, значит уменьшаем
        // счетчик и повторяем, пока все не получится

        /** NOTE!
         * 1) Не самая лучшая идея изменять счетчик i в теле цикла.
         * Это может запутать.
         * 2) randomNumber есть смысл внести в тело цикла, так как эта переменная
         * используется только там
         * 3) Генерацию можно еще написать примерно так:
         *
         *          Set<Integer> nums = new HashSet<>(n);
         *          while (nums.size() < n) {
         *             int randomNumber = 1 + (int) (Math.random() * 49);
         *             nums.add(randomNumber);
         *         }
         **/
        
        // согласен, ваш метод намного аккуратнее, теперь даже не знаю, как свой 
        // написать, оставляю ваш вариант)

        Set<Integer> nums = new HashSet<>(n);
//        int randomNumber;
//        for (int i = 0; i < n; i++) {
//            randomNumber = 1 + (int) (Math.random() * 49);
//            if (!nums.add(randomNumber)) {
//                i--;
//            }
//        }

        while (nums.size() < n) {
            int randomNumber = 1 + (int) (Math.random() * 49);
            nums.add(randomNumber);
        }

        return nums;
    }
}

