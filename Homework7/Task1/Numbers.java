package JC1.Homework.Homework7.Task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Numbers {

    private final Scanner scanner;
    private int number;

    public Numbers() {
        scanner = new Scanner(System.in);
    }

    public void go() {
        PrintText.printStartMenu();
        setNumber();
        PrintText.printResult(number);
        exit();
    }

    private void setNumber() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[1-9]{1}\\d*", str)) {
            this.number = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            setNumber();
        }
    }

    private void exit() {
        scanner.close();
        Runtime.getRuntime().exit(0);
    }

}
