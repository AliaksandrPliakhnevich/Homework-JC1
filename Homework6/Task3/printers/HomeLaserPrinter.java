package JC1.Homework.Homework6.Task3.printers;

public class HomeLaserPrinter extends Printable {

    private static final String HOME_LASER_PRINTER_NAME = "Домашний лазерный принтер";

    public HomeLaserPrinter(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return HOME_LASER_PRINTER_NAME + " " + this.model;
    }

}
