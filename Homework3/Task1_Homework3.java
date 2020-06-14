package JC1.Homework.Homework3.Homework3v1;

import java.util.Scanner;

public class Task1_Homework3 {
    
    static int userChoiseMenu;
    static int ifDivide0;
    
    static void calculatorMenu(){
        // вывод меню и запуск метода scanMenu() с привоением значения полю userChoiseMenu
            System.out.println("Выберите функцию");
            System.out.println("1: Сложение");
            System.out.println("2: Разность");
            System.out.println("3: Умножение");
            System.out.println("4: Деление");
            System.out.println("0: Выход");
            userChoiseMenu = scanMenu();
        } 
    static int scanMenu() {
        // главное меню, возвращает 0, 1, 2 ,3, 4
        while (true){
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()){
                int userChoiseMenu = scan.nextInt();
                if (userChoiseMenu >= 0 && userChoiseMenu <= 4){
                    return userChoiseMenu;
                } else {
                    System.out.println("Введите корректное значение");
                }                
            } else {
                System.out.println("Введите корректное значение");
            }            
        }        
    }
    static int scanMenuDivide0(){
        // меню при делении на 0, возвращает 1 или 2
        while (true){
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()){
                int ifDivide0 = scan.nextInt();
                if (ifDivide0 >= 1 && ifDivide0 <= 2){
                    return ifDivide0;
                } else {
                    System.out.println("Введите корректное значение");
                }                
            } else {
                System.out.println("Введите корректное значение");
            }            
        }        
    }        
    static double getFirstNumber(){
        // ввод и возвращение первого числа с проверкой
        System.out.println("Введите первое число:");
        while (true){
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()){
                double firstNum = scan.nextDouble();
                return firstNum;               
            } else {
                System.out.println("Введите корректное значение");
            }
        }
    }    
    static double getSecondNumber(){
        // ввод и возвращение второго числа с проверкой
        System.out.println("Введите второе число:");
        while (true){
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()){
                double secondNum = scan.nextDouble();     
                return secondNum;
            } else {
                System.out.println("Введите корректное значение");
            }
        }        
    }
    static void goCalc(){
        // создание нового объекта класса Calculator, проверка при делении на 0
        Calculator calc = new Calculator(getFirstNumber(), getSecondNumber());
            if (userChoiseMenu == 4 && calc.secondNum == 0){
                System.out.println("Делить на 0 нельзя");
                System.out.println("1: Ввести другое число");
                System.out.println("2: Выйти в меню");
                ifDivide0 = scanMenuDivide0();
                switch (ifDivide0){
                    case 1: {
                        // запрашиваем новое первое число
                        calc.firstNum = getFirstNumber();
                        // запрашиваем новое второе число, не равное 0
                        do {
                            calc.secondNum = getSecondNumber();
                        }
                        while (calc.secondNum == 0);
                        break;
                    }
                    case 2: {
                        return;
                    }                    
                }
            }
        calc.mathActions(userChoiseMenu);
    }

    public static void main(String[] args) {
        // зацикливаем выполнение калькулятора и останавливаем при вводе 0
        do {
            calculatorMenu();
            if (userChoiseMenu != 0) {
                goCalc();
            } else {
                break;
            }            
        }
        while (true);
    }    
}
