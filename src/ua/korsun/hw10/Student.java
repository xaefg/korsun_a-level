package hw10;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getScholarship() {
        return averageMark == 5 ? "100 uah" : "80 uah";
    }
}

