package JC1.Homework.Homework6.Task3.printers;

import java.util.ArrayList;

public class ListOfDevices {

    private final ArrayList<Printable> devicesList;

    public ListOfDevices() {
        devicesList = new ArrayList<>();
    }
    
    public void addNewDeviceToList(Printable device){
        devicesList.add(device);
    }

    public String getAllDevices() {
        String str = "";
        if (!devicesList.isEmpty()) {
            for (Printable device : devicesList) {
                str += Integer.toString(devicesList.indexOf(device) + 1) + " " + device.toString() + "\n";
            }
            return str;
        }
        return "Устройств не обраружено";
    }

    public Printable getDevice(int index) {
        return devicesList.get(index - 1);
    }

}
