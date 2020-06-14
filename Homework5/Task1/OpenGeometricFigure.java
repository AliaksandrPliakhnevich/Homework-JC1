package JC1.Homework.Homework5.Task1;

public class OpenGeometricFigure extends GeometricFigure{
    
    protected boolean closed;

    public boolean isClosed() {
        return closed;
    }

    public OpenGeometricFigure(String nameOfFigure) {
        super(nameOfFigure);
        this.closed = false;
    }
    
    public void closeOpenFigure(){
        this.closed = true;
        System.out.println("Открытая фигура " + getNameOfFigure() + " замкнута");
    }
}
