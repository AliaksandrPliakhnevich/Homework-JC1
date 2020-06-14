package JC1.Homework.Homework7.Task4.vehicleApp;


import JC1.Homework.Homework7.Task4.garage.Garage;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    private final Scanner scanner;
    private final Garage garage;
    private int userChoiseMenu;

    public App() {
        scanner = new Scanner(System.in);
        this.garage = new Garage();
    }

    public void go() {
        PrintText.printMenu();
        setUserChoiseMenu();
        PrintText.printCarsAccordingUserChoise(userChoiseMenu, garage.getListCarsInGarage());
        exit();
    }

    private void setUserChoiseMenu() {
        String str = scanner.nextLine();
        str = str.trim();
        if (Pattern.matches("[1-2]{1}", str)) {
            this.userChoiseMenu = Integer.parseInt(str);
        } else {
            PrintText.printCorrectionMenu();
            PrintText.printMenu();
            setUserChoiseMenu();
        }
    }

    private void exit() {
        scanner.close();
        Runtime.getRuntime().exit(0);
    }
}
