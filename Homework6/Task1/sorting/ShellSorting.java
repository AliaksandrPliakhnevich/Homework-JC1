package JC1.Homework.Homework6.Task1.sorting;

public class ShellSorting extends Sorting {

    // скопировал с википедии, ещё предстоит разобраться, как эта сортировка работает)
    
    @Override
    public double[] sortArrayMaxMin(double[] array) {
        for (int inc = array.length / 2; inc >= 1; inc = inc / 2) {
            for (int step = 0; step < inc; step++) {
                double tmp;
                for (int i = step; i < array.length - 1; i += inc) {
                    for (int j = Math.min(i + inc, array.length - 1); j - inc >= 0; j = j - inc) {
                        if (array[j - inc] < array[j]) {
                            tmp = array[j];
                            array[j] = array[j - inc];
                            array[j - inc] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }

    @Override
    public double[] sortArrayMinMax(double[] array) {
        for (int inc = array.length / 2; inc >= 1; inc = inc / 2) {
            for (int step = 0; step < inc; step++) {
                double tmp;
                for (int i = step; i < array.length - 1; i += inc) {
                    for (int j = Math.min(i + inc, array.length - 1); j - inc >= 0; j = j - inc) {
                        if (array[j - inc] > array[j]) {
                            tmp = array[j];
                            array[j] = array[j - inc];
                            array[j - inc] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }
}
