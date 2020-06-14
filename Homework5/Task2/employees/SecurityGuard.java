package JC1.Homework.Homework5.Task2.employees;

public class SecurityGuard extends Employee {

    public SecurityGuard(String fullName, int yearOfBirth) {
        super(fullName, yearOfBirth);
        super.position = "Охранник";
        super.responsibility = "Охранять вверенный объект";
        super.depatrment = "Отдел охраны";
    }

    public void closeTheDoor() {
        System.out.printf("%s %s, закройте главные ворота объекта\n", position, fullName);
    }

}
