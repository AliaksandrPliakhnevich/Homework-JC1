package JC1.Homework.Homework8.menu.item;

import JC1.Homework.Homework8.exception.MenuActionException;

public enum MainMenuAction {
    READ_FILE, ADD_FILE, DELETE_FILE, ADD_TEXT_TO_FILE, ZIP_FILES, UNZIP_FILES, EXIT;

    public static MainMenuAction getMainMenuAction(int actionNumber) throws MenuActionException {
        MainMenuAction[] valuesArr = values();
        if (actionNumber >=0 && actionNumber < valuesArr.length) {
            return valuesArr[actionNumber];
        }
        throw new MenuActionException("Wrong action number");
    }
}
