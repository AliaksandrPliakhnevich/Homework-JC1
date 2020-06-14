package JC1.Homework.Homework6.Task1.sorting;

public class BubbleSorting extends Sorting {

    @Override
    public double[] sortArrayMinMax(double[] array) {
        boolean ifSort = false;
        while (!ifSort) {
            int i = 0;
            ifSort = true;
            while (i + 1 < array.length) {
                if (array[i + 1] < array[i]) {
                    double swap = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = swap;
                    ifSort = false;
                }
                i++;
            }
        }
        return array;
    }

    @Override
    public double[] sortArrayMaxMin(double[] array) {
        boolean ifSort = false;
        while (!ifSort) {
            int i = 0;
            ifSort = true;
            while (i + 1 < array.length) {
                if (array[i + 1] > array[i]) {
                    double swap = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = swap;
                    ifSort = false;
                }
                i++;
            }
        }
        return array;
    }

}
