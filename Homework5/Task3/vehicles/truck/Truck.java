package JC1.Homework.Homework5.Task3.vehicles.truck;

import JC1.Homework.Homework5.Task3.vehicles.Car;

public abstract class Truck extends Car {
    
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
