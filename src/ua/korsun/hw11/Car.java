package hw11;

public class Car implements Recovery{
    protected final String series;
    protected final int year;
    protected final String color;
    protected final int tankSize;
    protected  double currentFuel;
    protected double fuelConsumption;
    protected  double stat;

    public Car(String series, int year, String color, int tankSize, int currentFuel, int fuelConsumption) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.tankSize = tankSize;
        this.currentFuel = currentFuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void move() {
        if (currentFuel >= fuelConsumption && currentFuel <= tankSize) {
            while (currentFuel > 0) {
                System.out.println("brr");
                currentFuel -= fuelConsumption;
                stat++;
                if (currentFuel < fuelConsumption) {
                    stat+=(fuelConsumption-currentFuel)/10;
                }
            }
        } else {
            System.out.println("Incorrect car parameters");
        }
    }

    public void getStats() {
        System.out.printf("car drove "+  "%.2f",stat);
        System.out.println();
    }
    @Override
    public void refuel(){
        currentFuel = tankSize;
    }

}
