package JC1.Homework.Homework5.Task2;

import JC1.Homework.Homework5.Task2.employees.*;

public class Main {
    
    public static void main(String[] args) {
        Employee employee1 = new SecurityGuard("Иванов И.И.", 1975);
        employee1.toGiveTask();
        employee1.printEmployeeInfo();
        System.out.println(employee1.getResponsibility());
        
        HeadOfSecurity employee2 = new HeadOfSecurity("Величко А.Н.", 1960);
        employee2.printEmployeeInfo();
        employee2.closeTheDoor();
        
        ChiefMechanicalEngineer chiefMechanicalEngineer = new ChiefMechanicalEngineer("Петров В.Л.", 1969);
        chiefMechanicalEngineer.washTheCar("Volvo", "VW", "UAZ");
    }
}
