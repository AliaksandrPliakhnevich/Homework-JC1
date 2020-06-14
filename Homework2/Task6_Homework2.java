package JC1.Homework.Homework2.Homework2_Correction;

//Есть массив из десяти целых чисел. Необходимо заменить каждый четный элемент
//массива на его удвоенное произведение (т.е. возвести квадрат). Например, есть 
//массив [1, 2, 3, 4], тогда результатом должен быть [1, 4, 3, 16];

public class Task6_Homework2 {
    
    public static void go(int[] nums){
        for (int i = 0; i < nums.length; i += 2){ //итерацию выполняю сразу по четным элементам
            nums[i] *= nums[i];
        }
        System.out.println("Массив с удвоенными чётными элементами:");
        for (int i: nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 8, 3, -2, 8, 9, 10, 1, 100};
        go(array);
    }
    
}
