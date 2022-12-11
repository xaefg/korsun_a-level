package hw10;

public class Aspirant extends Student{
    protected String scienceWork;
    public Aspirant(double averageMark) {
        super(averageMark);
    }
    public Aspirant(String firstName, String lastName, String group) {
        super(firstName, lastName, group);
    }

    @Override
    public int getScholarship() {
        return this.averageMark == 5 ? 200 : 180;
    }
}
