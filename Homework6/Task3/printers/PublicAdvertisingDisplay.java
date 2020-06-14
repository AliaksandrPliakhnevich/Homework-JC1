package JC1.Homework.Homework6.Task3.printers;

public class PublicAdvertisingDisplay extends Printable {

    private static final String PUBLIC_ADVERTISING_DISPLAY_NAME = "Рекламная панель в подъезде";

    public PublicAdvertisingDisplay(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return PUBLIC_ADVERTISING_DISPLAY_NAME + " " + this.model;
    }

}
