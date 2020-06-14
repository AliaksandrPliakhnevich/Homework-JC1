package JC1.Homework.Homework6.Task1.sorting;

public class ChoiseSorting extends Sorting{

    @Override
    public double[] sortArrayMinMax(double[] array) {
        for (int i = 0; i + 1 < array.length; i++){
            double min = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    indexMin = j;
                }
            }
            if (i < indexMin){
                double swap = array[indexMin];
                array[indexMin] = array[i];
                array[i] = swap;
            }            
        }
        return array;
    }
    
    @Override
    public double[] sortArrayMaxMin(double[] array) {
        for (int i = 0; i + 1 < array.length; i++){
            double max = array[i];
            int indexMax = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > max){
                    max = array[j];
                    indexMax = j;
                }
            }
            if (i < indexMax){
                double swap = array[indexMax];
                array[indexMax] = array[i];
                array[i] = swap;
            }            
        }
        return array;
    }


    
}
