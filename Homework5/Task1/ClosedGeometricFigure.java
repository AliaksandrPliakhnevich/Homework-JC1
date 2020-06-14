package JC1.Homework.Homework5.Task1;

public class ClosedGeometricFigure extends GeometricFigure{
    
    protected boolean open;

    public boolean isOpen() {
        return open;
    }

    public ClosedGeometricFigure(String nameOfFigure) {
        super(nameOfFigure);
        this.open = false;
    }
    
    public void openClosedFigure(){
        this.open = true;
        System.out.println("Замкнутая фигура " + getNameOfFigure() + " разомкнута");
    }
}
