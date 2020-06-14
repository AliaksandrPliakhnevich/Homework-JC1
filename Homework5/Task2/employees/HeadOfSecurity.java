package JC1.Homework.Homework5.Task2.employees;

public class HeadOfSecurity extends SecurityGuard {

    public HeadOfSecurity(String fullName, int yearOfBirth) {
        super(fullName, yearOfBirth);
        super.position = "Начальник отдела охраны";
        super.responsibility = "Руководить охраной объекта";
        super.depatrment = "Отдел охраны";
    }

    @Override
    public void closeTheDoor() {
        System.out.printf("%s %s, распорядитесь закрыть главные ворота объекта\n", position, fullName);
    }

    public void closeTheObject() {
        System.out.printf("%s %s, закройте доступ на объект\n", position, fullName);
    }

}
