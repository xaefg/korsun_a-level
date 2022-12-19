package hw10;

import java.util.Objects;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }

    @Override
    public boolean equals(Object object) {
        return (object instanceof Student student)
                && (Objects.equals(this.firstName, student.firstName))
                && (Objects.equals(this.lastName, student.lastName))
                && (Objects.equals(this.group, student.group));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + group.hashCode();
        return result;
    }
}

