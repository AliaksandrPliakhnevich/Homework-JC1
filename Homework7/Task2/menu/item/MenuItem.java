package JC1.Homework.Homework7.Task2.menu.item;

public class MenuItem {

    private int index;
    private String text;

    public MenuItem(int index, String text) {
        this.index = index;
        this.text = text;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return index + " - " + text;
    }

}
