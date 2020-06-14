package JC1.Homework.Homework6.Task2.ConversionDegreeApp;

public class PrintText {

    private static final String menuCorrectionText = "Введите корректное значение";
    
    private static final String menuStartText = "Введите значение в градусах Цельсия:";
    
    private static final String menuConversionTypeChoise = "Выберите, в какие единицы совершить перевод:\n1 - градусы Кельвина\n2 - градусы Фаренгейта";
    
    private static final String menuConversionText = "Введенное Вами значение в градусах Цельсия равняется ";
    
    private static final String menuAfterConversionText = "Желаете конвертировать ещё одно значение?\n1 - продолжить\n0 - выход";
    
    public static void printCorrectionMenu() {
        System.out.println(menuCorrectionText);
    }
    
    public static void printStartMenu() {
        System.out.println(menuStartText);
    }
    
    public static void printConvertionTypeChoiseMenu() {
        System.out.println(menuConversionTypeChoise);
    }
    
    public static void printConvertionTextMenu(double degree, String name) {
        System.out.println(menuConversionText + degree + name);
    }
    
    public static void printAfterConvertionMenu() {
        System.out.println(menuAfterConversionText);
    }
}
