package JC1.Homework.Homework2.Homework2_Correction;

//Есть массив из десяти целых чисел. Необходимо вывести максимальное и 
//минимальное число из массива;

public class Task4_Homework2 {
    
    public static void maxMinFromArray (int[] nums){
        int max = nums[0], min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("Максимальное число: " + max + ", минимальное число: " + min);
    }
    public static void main(String[] args) {
        int[] array = {5, 4, 8, 46, -95, 85, 78, 10, 1, 100};
        maxMinFromArray(array);
    }
    
}
