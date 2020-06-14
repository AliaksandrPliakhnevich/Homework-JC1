// Есть двумерный массив (MxN) целых чисел (от 0 до 9). С помощью команд 
// System.out.println и System.out.print вывести в консоль весь массив как в 
// примере ниже. По возможности использовать чикл for-each;
//      1 2 4 5
//      8 9 7 0
//      6 6 4 3

package JC1.Homework.Homework2.Homework2v1;
public class Task10_Homework2 {
    
    static void printArray(int[][] nums) {
        for (int[] element: nums){
            for (int i: element){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 4, 5}, {8, 9, 7, 0}, {6, 6, 4, 3}};
        printArray(array);
    }
    
}
