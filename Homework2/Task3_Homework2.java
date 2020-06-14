//Дано целое число от 1 – 100. Необходимо найти максимальный делить числа
//(кроме 1 и самого числа), деление на которое не дает остаток 
//(т.е. деление без остатка);
package JC1.Homework.Homework2.Homework2v1;
public class Task3_Homework2 {
    
    public static void maxDivider(int number){
        int res = number;
        for (int i = number; i > 0; i--){
            if (i == 1) {
                System.out.println("У числа "+number+" нет делителей кроме самого числа и единицы");
                break;
            }
            if (i == number) {continue;}
            if (number % i == 0) {
                res = i;
                System.out.println("Максимальный делитель числа "+number+": "+res);
                break;
            }    
        }        
    }
    public static void main(String[] args) {
        maxDivider(14);
    }
    
}
