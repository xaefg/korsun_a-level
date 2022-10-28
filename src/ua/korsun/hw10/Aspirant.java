package hw10;

public class Aspirant extends Student{
    protected String scienceWork;
    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    public int getScholarship() {
        return this.averageMark == 5 ? 200 : 180;
    }
}
