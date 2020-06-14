package JC1.Homework.Homework8.menu;

import JC1.Homework.Homework8.menu.item.MainMenuAction;
import JC1.Homework.Homework8.menu.item.MenuItem;

import java.util.LinkedList;
import java.util.List;

import static JC1.Homework.Homework8.menu.MenuTextConst.*;

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
            case READ_FILE:
                return new MenuItem(ind, ITEM_TEXT_READ_FILES);
            case ADD_FILE:
                return new MenuItem(ind, ITEM_TEXT_ADD_FILE);
            case DELETE_FILE:
                return new MenuItem(ind, ITEM_TEXT_DELETE_FILE);
            case ADD_TEXT_TO_FILE:
                return new MenuItem(ind, ITEM_ADD_TEXT_TO_FILE);
            case ZIP_FILES:
                return new MenuItem(ind, ITEM_ZIP_FILES);
            case UNZIP_FILES:
                return new MenuItem(ind, ITEM_UNZIP_FILES);
            case EXIT:
                return new MenuItem(ind, ITEM_TEXT_EXIT);
        }
        return null;
    }

    private MenuFactory() {
    }
}
