package JC1.Homework.Homework2.Homework2_Correction;

// Получить первые N чисел из ряда Фибоначчи (использовать только циклы);

public class Task9_Homework2 {
    
    static void fibonacci(int n) {
        
        int[] fibonacci = new int[n];
        if (n > 0) {
            fibonacci[0] = 0;
        } //добавляю условие чтобы избежать ошибок при n = 0;
        if (n > 1) {
            fibonacci[1] = 1;
        } //добавляю условие чтобы избежать ошибок при n = 1;
        
        for(int i = 2; n >= 2 && i < n; i++){
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        
        for (int element: fibonacci){
            System.out.print(element + ", ");
        }
    }

    public static void main(String[] args) {
        
        int n = 5;
        fibonacci(n);
    }
    
}
