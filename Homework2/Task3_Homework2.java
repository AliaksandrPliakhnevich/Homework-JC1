package JC1.Homework.Homework2.Homework2_Correction;

//Дано целое число от 1 – 100. Необходимо найти максимальный делить числа
//(кроме 1 и самого числа), деление на которое не дает остаток 
//(т.е. деление без остатка);

public class Task3_Homework2 {
    
    public static void maxDivider(int number){
        int i;
        if (number == 1){
            System.out.println("Максимальный делитель числа " + number + ": " + number); 
        } else {
            for (i = number-1; number % i != 0; i--){  
            }    
            System.out.println("Максимальный делитель числа " + number + ": " + i);
        }
        /** NOTE! Вообще лучше избегать использование continue.
                 * Но надо про него помнить и значть что этот оператор делает.
                 * Лучше пересмотреть условие f (number % i == 0) Туда можно
                 * внедрить нужную тебе проверку*/
        //  исправил, условие в цикле подправил, break и continue избежал.
        // добавил if else чтобы для числа 1 также был ответ
    }        
    
    public static void main(String[] args) {
        maxDivider(4);
    }
    
}
