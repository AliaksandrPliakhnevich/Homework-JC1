// Создать иерархию классов для геометрических фигур (не менее 5 классов)
package JC1.Homework.Homework5.Task1;

public class Main {
    public static void main(String[] args){
        OpenGeometricFigure line = new OpenGeometricFigure("Линия");
        line.closeOpenFigure();
        
        ClosedGeometricFigure circle = new ClosedGeometricFigure("Круг");
        circle.openClosedFigure();
        
        GeometricFigure point = new GeometricFigure("Точка");
        System.out.println(point.getNameOfFigure());
        
        Oval oval = new Oval(15, 17, 30, "Овал");
        System.out.println(oval.getNameOfFigure());
        System.out.println(oval.getRadiusOfOval1());
        System.out.println(oval.getRediusOfOval2());
        oval.openClosedFigure();
        
        
    }
    
}
