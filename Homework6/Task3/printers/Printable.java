package JC1.Homework.Homework6.Task3.printers;
/** NOTE! Не мог бы ты рассказать почему этот класс абстрактный? */
// поправил, класс теперь не абстрактный, но конструктор у него закрыт
public class Printable {

    protected String model;

    protected Printable(String model) {
        this.model = model;
    }

    public void toPrint(String note) {
        System.out.println("Ваше сообщение: \"" + note + "\" напечатано на устройстве " + this.toString());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
