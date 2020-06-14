package JC1.Homework.Homework7.Task2;

import JC1.Homework.Homework7.Task2.exception.MenuActionException;
import static JC1.Homework.Homework7.Task2.menu.MenuFactory.getMainMenu;
import JC1.Homework.Homework7.Task2.menu.item.MainMenuAction;
import JC1.Homework.Homework7.Task2.menu.item.MenuItem;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            printMenuItems(getMainMenu(MainMenuAction.values()));
            try {
                MainMenuAction mainMenuAction = MainMenuAction.getMainMenuAction(readIntFromConsole());
                doMainMenuAction(mainMenuAction);
            } catch (MenuActionException e) {
                e.printStackTrace();
            }
        }
    }

    private void doMainMenuAction(MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case INVERT_NUMBER:
                System.out.println(doRecursionInvert(readLongFromConsole()));
                break;
            case EXIT:
                System.exit(0);
        }

    }

    private void printInvertProcess(){
        
    }
    
    private void printMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }

    private int readIntFromConsole() {
        return scanner.nextInt();
    }

    private long readLongFromConsole() {
        return scanner.nextLong();
    }

    private String doRecursionInvert(long number) {
        if (number < 10) {
            return number % 10 + "";
        }
        return number % 10 + doRecursionInvert(number / 10);
    }

}
