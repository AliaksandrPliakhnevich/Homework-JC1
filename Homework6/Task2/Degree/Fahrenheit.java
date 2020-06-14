package JC1.Homework.Homework6.Task2.Degree;

public class Fahrenheit extends Degree {

    public Fahrenheit(double degreeValue) {
        super(degreeValue * 9 / 5 + 32);
        super.name = " в градусах Фаренгейта";
    }

}
