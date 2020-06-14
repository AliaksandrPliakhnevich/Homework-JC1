package JC1.Homework.Homework5.Task3.vehicles;

public abstract class Car {

    protected double engineVolume;
    protected String carModel;
    protected String fuelType;
    protected String color;
    protected int year;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + carModel + ", объем двигателя: " + engineVolume
                + ", тип топлива: " + fuelType + ", цвет: " + color
                + ", год выпуска: " + year;
    }

}
