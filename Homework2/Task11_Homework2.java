// Есть массив чисел с плавающей запятой. Необходимо реализовать сортировку 
// пузырьком по возрастанию и по убыванию;
package JC1.Homework.Homework2.Homework2v1;
public class Task11_Homework2 {
    
    static void bubbleSortMinMax(double[] nums){
        boolean ifSort = false;
        
        while (!ifSort){
            int i = 0;
            ifSort = true;
            while (i+1 < nums.length){
                if (nums[i+1] < nums[i]){
                    double swap = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = swap;
                    ifSort = false;
                }
                i++;
            }
        }
        for (double element: nums){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    static void bubbleSortMaxMin(double[] nums){
        boolean ifSort = false;
        
        while (!ifSort){
            int i = 0;
            ifSort = true;
            while (i+1 < nums.length){
                if (nums[i+1] > nums[i]){
                    double swap = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = swap;
                    ifSort = false;
                }
                i++;
            }
        }
        for (double element: nums){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] array = {56.8, -7.0, 84.9, 24.01, -1.5, 0.0};
        bubbleSortMinMax(array);
        bubbleSortMaxMin(array);
    }    
}
