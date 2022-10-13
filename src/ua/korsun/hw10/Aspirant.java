package hw10;

public class Aspirant extends Student{
    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    public String getScholarship() {
        return this.averageMark == 5 ? "200 uah" : "180 uah";
    }
}
