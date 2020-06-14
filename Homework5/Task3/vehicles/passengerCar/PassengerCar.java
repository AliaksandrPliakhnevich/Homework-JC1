package JC1.Homework.Homework5.Task3.vehicles.passengerCar;

import JC1.Homework.Homework5.Task3.vehicles.Car;

public abstract class PassengerCar extends Car {

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
