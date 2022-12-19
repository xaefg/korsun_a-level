package hw11;

public class PassengerCar extends Car {
    private volatile double passenger = 0;

    public PassengerCar(String series, int year, String color, int tankSize,
                        int currentFuel, int fuelConsumption) {
        super(series, year, color, tankSize, currentFuel, fuelConsumption);
    }

    public void sitPassenger(int a) {
        if (a<4) {
            this.passenger = a;
        }else{
            throw new RuntimeException("No space for passengers");
        }
    }

    @Override
    public void move() {
        fuelConsumption += passenger;
        super.move();
    }

}