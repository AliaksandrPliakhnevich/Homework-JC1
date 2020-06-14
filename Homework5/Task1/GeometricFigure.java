package JC1.Homework.Homework5.Task1;

public class GeometricFigure {
    protected String nameOfFigure;

    public GeometricFigure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }

    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public void setNameOfFigure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }
    
    public static void rotateFigure(GeometricFigure geometricFigure){
        System.out.println("Геометрическая фигура " + geometricFigure.getNameOfFigure() + " повёрнута");
    }
    
    public static void zoomFigure(GeometricFigure geometricFigure){
        System.out.println("Изменен размер геометрической фигуры " + geometricFigure.getNameOfFigure());
    }
    
}
