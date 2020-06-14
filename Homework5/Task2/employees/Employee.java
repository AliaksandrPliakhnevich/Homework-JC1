package JC1.Homework.Homework5.Task2.employees;

public abstract class Employee {

    protected String fullName;
    protected String position;
    protected String responsibility;
    protected int yearOfBirth;
    protected String depatrment;
    protected boolean workStatus;

    public Employee(String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.workStatus = true;
    }
    
    public void printEmployeeInfo(){
        System.out.printf("Имя сотрудника: %s\n", fullName);
        System.out.printf("Должность сотрудника: %s\n", position);
        System.out.printf("Год рождения сотрудника: %s\n", yearOfBirth);
        System.out.printf("Отдел сотрудника: %s\n", depatrment);
    }
    
    public void toGiveTask() {
        System.out.printf("Cотрудник %s, ваша задача: %s в соответствии с должностью %s\n", fullName, responsibility, position);
    }

    public void toFireEmpoyee() {
        workStatus = false;
        System.out.printf("%s, Вы уволены c должности %s\n", fullName, position);
    }

    public boolean getWorkStatus() {
        return workStatus;
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public String getDepatrment() {
        return depatrment;
    }

}
