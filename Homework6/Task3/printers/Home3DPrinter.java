package JC1.Homework.Homework6.Task3.printers;

public class Home3DPrinter extends Printable {

    private static final String HOME_3DPRINTER_TYPE = "Домашний 3D принтер";

    public Home3DPrinter(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return HOME_3DPRINTER_TYPE + " " + super.model;
    }

}
