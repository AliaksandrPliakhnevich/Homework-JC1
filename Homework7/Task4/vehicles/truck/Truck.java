package JC1.Homework.Homework7.Task4.vehicles.truck;

import JC1.Homework.Homework7.Task4.vehicles.Car;

public class Truck extends Car {

    protected Truck() {
    }

    protected double vantageVolume;

    public double getVantageVolume() {
        return vantageVolume;
    }

    public void setVantageVolume(double vantageVolume) {
        this.vantageVolume = vantageVolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", объем грузового отсека: " + vantageVolume; //To change body of generated methods, choose Tools | Templates.
    }

}
