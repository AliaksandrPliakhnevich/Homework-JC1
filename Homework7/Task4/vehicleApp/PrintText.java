package JC1.Homework.Homework7.Task4.vehicleApp;

import JC1.Homework.Homework7.Task4.vehicles.Car;
import JC1.Homework.Homework7.Task4.vehicles.passengerCar.PassengerCar;
import JC1.Homework.Homework7.Task4.vehicles.truck.Truck;
import java.util.LinkedList;
import java.util.List;

public class PrintText {

    private final static String menu = "Выберите тип автомобиля\n1 - легковые\n2 - грузовые";
    private final static String correctionMenu = "Введите корректное значение";

    public static void printMenu() {
        System.out.println(menu);
    }

    public static void printCorrectionMenu() {
        System.out.println(correctionMenu);
    }

    public static void printCarsAccordingUserChoise(int userChoiseMenu, List<Car> cars) {
        String carClassName;
        switch (userChoiseMenu) {
            case 1:
                carClassName = "PassengerCar";
                break;
            case 2:
                carClassName = "Truck";
                break;
            default:
                carClassName = null;
                break;
        }
        printCars(cars, carClassName);
    }
    
    // исправил так: теперь метод printCars принимает в параметрах еще и строку carClassName
    // затем у элемента списка типа Car получаем класс, далее имя класса и сравниваем
    // с переданным carClassName. Если имена классов совпадают, печатаем элемент списка
    /**
     * NOTE! printTrucks и printPassengerCars по сути одинаковые. Тут можно
     * написать один общий метод
     *
     */
    private static void printCars(List<Car> cars, String carClassName) {
        for (Car car : cars) {
            if (car.getClass().getName().equals(carClassName)) {
                System.out.println(car.toString());
            }            
        }
    }


//    private static void printTrucks(List<Car> cars) {
//        for (Car car : cars) {
//            /**
//             * NOTE! А зачем тут эта проверка? Ты же просто печатешь то, то дает
//             * тебе toString
//             *
//             */
//            if (car instanceof Truck) {
//                System.out.println(car.toString());
//            }
//        }
//    }
//
//    private static void printPassengerCars(List<Car> cars) {
//        for (Car car : cars) {
//            if (car instanceof PassengerCar) {
//                System.out.println(car.toString());
//            }
//        }
//    }

}
