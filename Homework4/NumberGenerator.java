package JC1.Homework.Homework4.Homework4v1;
public class NumberGenerator {
    
    public static int[] generateNumbers(int n){
        // мой метод для генерации массива неповторяющихся случайных чисел от 1 до 49 в количестве n
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = 1 + (int)(Math.random() * 49);                
        }
        boolean marker = false;
        do{
            marker = false;
            for (int i = 0; i < nums.length; i++){
                for (int j = 0; j < nums.length; j++){
                    if (j == i) {
                        continue;
                    }
                    if (nums[j] == nums[i]){
                        nums[j] = 1 + (int)(Math.random() * 49);
                        j--;
                        marker = true;
                    }
                }    
            }            
        }
        while(marker == true);
        return nums;
    }
}
