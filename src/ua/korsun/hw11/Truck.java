package hw11;

public class Truck extends Car {
    protected double cargo = 0;

    public Truck(String series, int year, String color, int tankSize, int currentFuel, int fuelConsumption) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
    }

    @Override
    public void move() {
        super.move();
        if(cargo!=0) {
            fuelConsumption *= 2;
        }
    }

    public void loadCargo(double t) {
        this.cargo += t;
    }

    public void unloadCargo(double t) {
        this.cargo -= t;
    }

}
