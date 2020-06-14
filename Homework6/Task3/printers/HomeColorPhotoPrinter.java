package JC1.Homework.Homework6.Task3.printers;

public class HomeColorPhotoPrinter extends Printable {

    private static final String HOME_COLOR_PHOTO_PRINTER_NAME = "Домашний цветной фото-принтер";

    public HomeColorPhotoPrinter(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return HOME_COLOR_PHOTO_PRINTER_NAME + " " + this.model;
    }

}
