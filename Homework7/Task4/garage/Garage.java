package JC1.Homework.Homework7.Task4.garage;


import JC1.Homework.Homework7.Task4.vehicles.Car;
import JC1.Homework.Homework7.Task4.vehicles.passengerCar.*;
import JC1.Homework.Homework7.Task4.vehicles.truck.*;
import java.util.LinkedList;
import java.util.List;

public class Garage {
    
    private List<Car> carsInGarage;

    public Garage() {
        carsInGarage = new LinkedList<>();
        carsInGarage.add(new Geely());
        carsInGarage.add(new Lada());
        carsInGarage.add(new Mazda());
        carsInGarage.add(new Mercedes());
        carsInGarage.add(new Volkswagen());
        carsInGarage.add(new DafTruck());
        carsInGarage.add(new IvecoTruck());
        carsInGarage.add(new KamazTruck());
        carsInGarage.add(new MazTruck());
        carsInGarage.add(new VolvoTruck());
    }
    
    public void addCarInGarage(Car car){
        carsInGarage.add(car);
    }
    
    public Car getCarFromGarage(int index){
        return carsInGarage.get(index);
    }

    public List<Car> getListCarsInGarage() {
        return carsInGarage;
    }
    
    

}
