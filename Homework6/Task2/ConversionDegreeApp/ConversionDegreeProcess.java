package JC1.Homework.Homework6.Task2.ConversionDegreeApp;

import JC1.Homework.Homework6.Task2.Degree.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConversionDegreeProcess {

    private final Scanner scanner;
    private double celsiusDegreeValue;
    private Degree degree;
    private int userChoiseConversionType;
    private int userChoiseAfterConversion;

    public ConversionDegreeProcess() {
        this.scanner = new Scanner(System.in);
    }

    public void appProcess() {
        while (true) {
            PrintText.printStartMenu();
            setCelsiusDegreeValue();

            PrintText.printConvertionTypeChoiseMenu();
            setUserChoiseConversionType();

            degree = setDegree();
            PrintText.printConvertionTextMenu(degree.getDegreeValue(), degree.getName());

            PrintText.printAfterConvertionMenu();
            setUserChoiseAfterConversion();

            exit(userChoiseAfterConversion);
        }
    }

    private void setCelsiusDegreeValue() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("-?\\d+(\\.?\\d+)?", str)) {
            this.celsiusDegreeValue = Double.parseDouble(str);
        } else {
            PrintText.printCorrectionMenu();
            setCelsiusDegreeValue();
        }
    }

    private void setUserChoiseConversionType() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[1-2]{1}", str)) {
            this.userChoiseConversionType = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setUserChoiseConversionType();
        }
    }

    private void setUserChoiseAfterConversion() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[0-1]{1}", str)) {
            this.userChoiseAfterConversion = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setUserChoiseAfterConversion();
        }
    }

    private Degree setDegree() {
        switch (userChoiseConversionType) {
            case 1:
                return new Kelvin(celsiusDegreeValue);
            case 2:
                return new Fahrenheit(celsiusDegreeValue);
            default:
                return null;
        }
    }

    private void exit(int num) {
        if (num == 0) {
            scanner.close();
            Runtime.getRuntime().exit(0);
        }
    }
}
