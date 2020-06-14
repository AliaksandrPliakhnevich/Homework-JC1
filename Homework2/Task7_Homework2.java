package JC1.Homework.Homework2.Homework2_Correction;

// Есть массив из десяти целых чисел. Заменить каждый элемент с нечетным 
// индексом на 0;

public class Task7_Homework2 {
    public static void go(int[] nums) {
        for (int i = 1; i < nums.length; i += 2){ //итерацию выполняю сразу по нечетным элементам
            nums[i] = 0;
        }
        for (int i: nums){
            System.out.print(i + " ,");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 8, 3, -2, 8, 9, 10, 1, 100};
        go(array);
    }           
}
