package JC1.Homework.Homework5.Task2.employees;

public class Driver extends Employee {

    protected String car;

    public Driver(String fullName, int yearOfBirth) {
        super(fullName, yearOfBirth);
        super.position = "Водитель";
        super.responsibility = "Совершать служебные поездки на вверенном автомобиле";
        super.depatrment = "Отдел главного механика";
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void washTheCar() {
        if (car != null) {
            System.out.printf("%s %s, помойте автомобиль %s\n", position, fullName, car);
        } else {
            System.out.printf("%s %s не получал служебный автомобиль\n", position, fullName);
        }
    }

    public void washTheCar(String car) {
        System.out.printf("%s %s, помойте другой автомобиль, %s\n", position, fullName, car);
    }

}
