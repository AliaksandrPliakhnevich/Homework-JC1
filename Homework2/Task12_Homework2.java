// Есть массив чисел с плавающей запятой. Необходимо реализовать сортировку 
// методом выбора по возрастанию и по убыванию;

package JC1.Homework.Homework2.Homework2v1;
public class Task12_Homework2 {
    
    static void selectionSortMinMax(double[] nums){
        for(int i = 0; i + 1 < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    double swap = nums[j];
                    nums[j] = nums[i];
                    nums[i] = swap;
                }
            }
        }     
        for(double element: nums){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    static void selectionSortMaxMin(double[] nums){
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] > nums[i]){
                    double swap = nums[j];
                    nums[j] = nums[i];
                    nums[i] = swap;
                }
            }
        }     
        for(double element: nums){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] array = {56.8, -7.0, 84.9, 24.01, -1.5, 0.0};
        selectionSortMinMax(array);
        selectionSortMaxMin(array);
    }    
}
