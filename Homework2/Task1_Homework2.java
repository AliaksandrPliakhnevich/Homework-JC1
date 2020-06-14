package JC1.Homework.Homework2.Homework2_Correction;

//Посчитать сумму всех чисел от 0 до N. Реализовать задание через while;

public class Task1_Homework2 {
    
    public static void sumToN (int n) {
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Сумма числел от 0 до " + n + " : " + sum);
    }
    
    public static void main(String[] args) {
        
        sumToN(15);
        
    }
    
}
