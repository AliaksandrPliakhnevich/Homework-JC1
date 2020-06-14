package JC1.Homework.Homework5.Task1;

public class Circle extends ClosedGeometricFigure{
    
    protected double squareOfFigure;

    public Circle(double squareOfFigure, String nameOfFigure) {
        super(nameOfFigure);
        this.squareOfFigure = squareOfFigure;
    }

    public double getsquareOfFigure() {
        return squareOfFigure;
    }

    public void setsquareOfFigure(double squareOfFigure) {
        this.squareOfFigure = squareOfFigure;
    }
    
}
