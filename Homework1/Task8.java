package JC1.Homework.Homework1_Correction;

/**
 * Задание № 7
 * <p>
 * 1) Даны 3 числа. Вычислить их сумму. Если все три числа равны,
 * то нужно вернуть сумму увеличеннную в два раза
 * <p>
 * 2) Даны 2 числа, нужно вернуть true,
 * если одно из низ равно 10 или их сумма равно 10
 * <p>
 * 3) Даны 3 числа, нужно вернуть максимально число
 * Результат вывести в консоль
 * <p>
 * 4) Даны 3 числа, нужно вернуть минимальное число
 * Результат вывести в консоль
 */

public class Task8 {

    /** NOTE! Ко всему кода в этом классе!
     *
     * Лучше не писать все в одну строку.
     * Понимаю что хочется чтобы было меньше строк,
     * но так лучше не делать. Сложнее читать код.
     * то есть дучше так:
     *
     * if() {
     *
     * } else if(){
     *
     * } else {
     *
     * }
     *
     * Если пишешь в IntellijIdea то нажки cltr + alt + L
     **/
    
    // исправил везде форматирование кода, return можно не писать за закрывающей скобкой?
    // в случае когда у нас return вместо else
    //
    // типа if(){           или нужно   if(){
    //      }                           } return;
    //      return ;

    public static int sum1(int a, int b, int c) {
        
        int res = a + b + c;
        if (a == b && b == c) {
            return res * 2;
        } 
        return res;
    }

    public static boolean /*void*/ sum2(int a, int b, int c) { 
        //т.к. вернуть нужно boolean корректирую возвращаемый тип
        //и в условии даны два числа, а у нас три, решаю для трех
        
        // так же можно сразу выводить в return?
        
        return a == 10 || b == 10 || c == 10 || (a + b + c) == 10;
    }

    public static void max(int a, int b, int c) {
        int max = a;
        if (b >= a && b >= c) {
            max = b;
        } else if (c >= a && c >= b) {
            max = c;
        }
        System.out.println(max);
    }

    public static void min(int a, int b, int c) {
        int min = a;
        if (b <= a && b <= c) {
            min = b;
        } else if (c <= a && c <= b) {
            min = c;
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        
        System.out.println(sum1(3,3,3));
        
        System.out.println(sum2(0,11,-1));
        
        max(2,2,3);
        
        min(6,2,-100);
    }
}
