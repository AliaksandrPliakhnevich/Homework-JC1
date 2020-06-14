package JC1.Homework.Homework5.Task2.employees;

public class Cleaner extends Employee {

    public Cleaner(String fullName, int yearOfBirth) {
        super(fullName, yearOfBirth);
        super.position = "Уборщик";
        super.responsibility = "Осуществлять уборку объекта";
        super.depatrment = "Вспомогательный отдел";
    }

    public void cleanTerritory(String territory) {
        System.out.printf("%s %s, осуществите уборку территории %s\n", position, fullName, territory);
    }

}
