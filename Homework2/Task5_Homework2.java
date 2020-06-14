package JC1.Homework.Homework2.Homework2_Correction;

// Есть массив из десяти целых чисел. 
// Необходимо поменять элементы массива в обратном порядке;

public class Task5_Homework2 {
    
    public static void reverseArray(int[] nums){
        for (int i = 0, j = nums.length - 1; i < nums.length/2; i++, j--){
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap;
        }
        System.out.println("Массив в обратном порядке:");
        for (int i: nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 8, 46, -95, 85, 78, 10, 1, 100};
        reverseArray(array);
    }
    
}
