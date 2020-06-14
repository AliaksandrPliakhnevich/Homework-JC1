package JC1.Homework.Homework5.Task1;

public class Polyline extends OpenGeometricFigure{
    
    protected double lengthOfPolyline;

    public Polyline(double lengthOfPolyline, String nameOfFigure) {
        super(nameOfFigure);
        this.lengthOfPolyline = lengthOfPolyline;
    }

    public double getLengthOfPolyline() {
        return lengthOfPolyline;
    }

    public void setLengthOfPolyline(double lengthOfPolyline) {
        this.lengthOfPolyline = lengthOfPolyline;
    }
    
}
