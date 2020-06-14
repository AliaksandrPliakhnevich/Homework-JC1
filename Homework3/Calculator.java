package JC1.Homework.Homework3.Homework3_Correction1;

import static JC1.Homework.Homework3.Homework3_Correction1.Task1_Homework3.userChoiseMenu;

public class Calculator {

    double firstNum;
    double secondNum;
    
    Calculator(double firstNum, double secondNum){
    this.firstNum = firstNum;
    this.secondNum = secondNum;}    

    double mathActions(int userChoise){
        // исправил
        
        /** NOTE! В этом методе лучше просто производить вычисления и
         * возвращать результат, а выводить сообщение лучше во втором
         * классе потому, что именно он тебя работает с консолью.
         * Данный класс предназначен только для выполнения арифметических операций.
         * Он не должен уметь печатать текст в консоль. Есть такой "Принцип единсственной
         * ответственности" он как раз говорит что класс должен делать именно то, для чего он
         * предназначен и ничего больше. Соответстенно Calculator должен только считать.*/
        // арифметические операции калькулятора
        switch(userChoise){
            case 1: 
                return firstNum + secondNum;
            case 2: 
                return firstNum - secondNum;
            case 3:
                return firstNum * secondNum;
            case 4:
                return firstNum / secondNum;
            // требует return хоть у меня на вход метода приходит только проверенный 
            // параметр userChoise = 1...4, просто пишу default: return 0.0;
            // но как правильно сделать в этом случае?    
            default: return 0.0;    
        }
    }   
}
