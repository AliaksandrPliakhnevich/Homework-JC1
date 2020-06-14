package JC1.Homework.Homework5.Task1;

public class Oval extends Circle {

    protected double radiusOfOval1;
    protected double radiusOfOval2;

    public Oval(double radiusOfOval1, double radiusOfOval2, double squareOfFigure, String nameOfFigure) {
        super(squareOfFigure, nameOfFigure);
        this.radiusOfOval1 = radiusOfOval1;
        this.radiusOfOval2 = radiusOfOval2;
    }

    public double getRadiusOfOval1() {
        return radiusOfOval1;
    }

    public void setRadiusOfOval1(double radiusOfOval1) {
        this.radiusOfOval1 = radiusOfOval1;
    }

    public double getRediusOfOval2() {
        return radiusOfOval2;
    }

    public void setRadiusOfOval2(double radiusOfOval2) {
        this.radiusOfOval2 = radiusOfOval2;
    }

}
