package JC1.Homework.Homework2.Homework2_Correction;

// Посчитать степень числа. Использовать цикл for;

public class Task2_Homework2 {
    // решение при условии что степень - целое число, положительное или отрицательное
    public static double degreeOf(int number, int degree){
        double res = number;
        
        if (degree == 0) {
            return 1;
        } /** NOTE! Лучше перенести тело блока if на новую строку */
        // перенес тело блока if !
        if (degree == 1) {
            return res;
        } /** NOTE! Лучше перенести тело блока if на новую строку */
        // перенес тело блока if !
        int absDegree = Math.abs(degree);
        for(int i = 2; i <= absDegree; i++) {
            res *= number;
        }
        
        if (degree > 0) {
            return res;
        } else {
            return 1/res;
        } /** NOTE! Лучше перенести тело блока if на новую строку */
        // перенес тело блока if !
        
    }
    public static void main(String[] args) {
        int number = 10, degree = 3;
        double res = degreeOf(number,degree);
        System.out.println("Число "+number+" в степени "+degree+": "+res);
    }
    
}
