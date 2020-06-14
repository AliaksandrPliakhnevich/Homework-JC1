package JC1.Homework.Homework2.Homework2_Correction;

// Есть массив чисел с плавающей запятой. Необходимо реализовать сортировку 
// методом выбора по возрастанию и по убыванию;

public class Task12_Homework2 {
    
    static void selectionSortMinMax(double[] nums){
        /** NOTE! Немного не верная реализация. В соответствии с
         * этим алгоритмом, тебе нужно найти минимальный или максимальный
         * элемент (начиная от i+1) и поменять его с i-м. А у тебя получается, что
         * один элемент перемещается по массиву постоянно. Это больше
         * на пузырек похоже.
         *
         * http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/
         * */
        
        // исправил
        for (int i = 0; i + 1 < nums.length; i++){
            double min = nums[i];
            int indexMin = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < min){
                    min = nums[j];
                    indexMin = j;
                }
            }
            if (i < indexMin){
                double swap = nums[indexMin];
                nums[indexMin] = nums[i];
                nums[i] = swap;
            }            
        }   
        for(double element: nums){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    static void selectionSortMaxMin(double[] nums){
        for (int i = 0; i + 1 < nums.length; i++){
            double max = nums[i];
            int indexMax = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] > max){
                    max = nums[j];
                    indexMax = j;
                }
            }
            if (i < indexMax){
                double swap = nums[indexMax];
                nums[indexMax] = nums[i];
                nums[i] = swap;
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
