package JC1.Homework.Homework5.Task3.vehicleApp;

import JC1.Homework.Homework5.Task3.garage.Garage;
import JC1.Homework.Homework5.Task3.vehicles.Car;
import JC1.Homework.Homework5.Task3.vehicles.passengerCar.PassengerCar;
import JC1.Homework.Homework5.Task3.vehicles.truck.Truck;

public class PrintText {

    private final static String menu = "Выберите тип автомобиля\n1 - легковые\n2 - грузовые";
    private final static String correctionMenu = "Введите корректное значение";

    public static void printMenu() {
        System.out.println(menu);
    }

    public static void printCorrectionMenu() {
        System.out.println(correctionMenu);
    }

    public static void printCarsAccordingUserChoise(int userChoiseMenu) {
        switch (userChoiseMenu) {
            case 1:
                printPassengerCars();
                break;
            case 2:
                printTrucks();
                break;
            default:
                break;
        }
    }

    private static void printTrucks() {
        for (Car CARS_IN_GARAGE : Garage.CARS_IN_GARAGE) {
            if (CARS_IN_GARAGE instanceof Truck) {
                System.out.println(CARS_IN_GARAGE.toString());
            }
        }
    }

    private static void printPassengerCars() {
        for (Car CARS_IN_GARAGE : Garage.CARS_IN_GARAGE) {
            if (CARS_IN_GARAGE instanceof PassengerCar) {
                System.out.println(CARS_IN_GARAGE.toString());
            }
        }
    }

}
