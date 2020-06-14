package JC1.Homework.Homework7.Task4.vehicles.passengerCar;

import JC1.Homework.Homework7.Task4.vehicles.Car;



public class PassengerCar extends Car {

    protected PassengerCar() {
    }

    protected int seatsNumber;
    protected String carBodyType;

    public int getPassengerSeats() {
        return seatsNumber;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.seatsNumber = passengerSeats;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество мест в автомобиле: " + seatsNumber + ", тип кузова: " + carBodyType;
    }

}
