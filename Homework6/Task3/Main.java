package JC1.Homework.Homework6.Task3;

import JC1.Homework.Homework6.Task3.app.PrintApp;
import JC1.Homework.Homework6.Task3.printers.*;

public class Main {

    public static void main(String[] args) {
        
        ListOfDevices myDevices = new ListOfDevices();
        myDevices.addNewDeviceToList(new Home3DPrinter("XIAOMI NX456.4"));
        myDevices.addNewDeviceToList(new HomeLaserPrinter("HP 4565"));
        myDevices.addNewDeviceToList(new HomeColorPhotoPrinter("Epson 4512"));
        myDevices.addNewDeviceToList(new PublicAdvertisingDisplay("Samsung FDS45"));
        myDevices.addNewDeviceToList(new HomeLaserPrinter("Xerox TPS45-45"));

        new PrintApp(myDevices).appGo();
    }
}
