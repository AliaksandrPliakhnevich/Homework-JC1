package JC1.Homework.Homework7.Task2.menu;

import static JC1.Homework.Homework7.Task2.menu.MainMenuTextConst.ITEM_TEXT_EXIT;
import static JC1.Homework.Homework7.Task2.menu.MainMenuTextConst.ITEM_TEXT_DO_INVERT;
import JC1.Homework.Homework7.Task2.menu.item.MainMenuAction;
import JC1.Homework.Homework7.Task2.menu.item.MenuItem;
import java.util.LinkedList;
import java.util.List;

public class MenuFactory {

    public static List<MenuItem> getMainMenu(MainMenuAction... menuActions) {
        LinkedList<MenuItem> linkedList = new LinkedList<>();
        for (int i = 0; i < menuActions.length; i++) {
            MenuItem menuItem = getMainMenuItem(i, menuActions[i]);
            if (menuItem != null) {
                linkedList.add(menuItem);
            }
        }
        return linkedList;
    }

    private static MenuItem getMainMenuItem(int ind, MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case INVERT_NUMBER:
                return new MenuItem(ind, ITEM_TEXT_DO_INVERT);
            case EXIT:
                return new MenuItem(ind, ITEM_TEXT_EXIT);
        }
        return null;
    }

    private MenuFactory() {
    }
}
