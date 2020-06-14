package JC1.Homework.Homework5.Task2.employees;

import java.util.Arrays;

public class ChiefMechanicalEngineer extends Driver {

    public ChiefMechanicalEngineer(String fullName, int yearOfBirth) {
        super(fullName, yearOfBirth);
        super.position = "Главный механик";
        super.responsibility = "Организовывать работу транспортных средств объекта";
        super.depatrment = "Отдел главного механика";
    }

    @Override
    public void washTheCar() {
        System.out.printf("%s %s, организуйте мойку служебного транспорта\n", position, fullName);
    }

    public void washTheCar(String... car) {
        System.out.printf("%s %s, организуйте мойку служебного транспорта %s\n", position, fullName, Arrays.toString(car));
    }

}
