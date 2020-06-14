package JC1.Homework.Homework2.Homework2_Correction;

// Есть массив из десяти целых чисел. Необходимо посчитать среднее 
// арифметическое для всех элементов массива;

public class Task8_Homework2 {
    public static void avArifm(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double arr = (double)sum/nums.length;
        System.out.println("Среднее арфиметическое элементов массива: " + arr);
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 8, 3, -2, 8, 9, 10, 1, 100};
        avArifm(array);
    }
    
}
