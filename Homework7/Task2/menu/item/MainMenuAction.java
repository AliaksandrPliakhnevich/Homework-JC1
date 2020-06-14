package JC1.Homework.Homework7.Task2.menu.item;

import JC1.Homework.Homework7.Task2.exception.MenuActionException;



public enum MainMenuAction {

    EXIT, INVERT_NUMBER;

    public static MainMenuAction getMainMenuAction(int actionNumber) throws MenuActionException {
        MainMenuAction[] valuesArr = values();
        if (actionNumber >= 0 && actionNumber < valuesArr.length) {
            return valuesArr[actionNumber];
        }
        throw new MenuActionException("Wrong action number");
    }
}
