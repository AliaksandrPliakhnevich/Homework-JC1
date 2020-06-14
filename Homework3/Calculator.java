package JC1.Homework.Homework3.Homework3v1;

public class Calculator {

    double firstNum;
    double secondNum;
    
    Calculator(double firstNum, double secondNum){
    this.firstNum = firstNum;
    this.secondNum = secondNum;
    }    

    void mathActions(int userChoise){
        // арифметические операции калькулятора
        switch(userChoise){
            case 1: {
                double res = firstNum + secondNum;
                System.out.println("Результат равен: " + res + "\n");
                break;
            }
            case 2: {
                double res = firstNum - secondNum;
                System.out.println("Результат равен: " + res + "\n");
                break;
            }
            case 3: {
                double res = firstNum * secondNum;
                System.out.println("Результат равен: " + res + "\n");
                break;
            }
            case 4: {
                double res = firstNum / secondNum;
                System.out.println("Результат равен: " + res + "\n");
                break;
            }
        }
    }   
}
