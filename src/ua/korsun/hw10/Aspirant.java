package hw10;

import java.util.Objects;

public class Aspirant extends Student {
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

    @Override
    public boolean equals(Object object) {
        return (object instanceof Aspirant aspirant)
                && (Objects.equals(this.firstName, aspirant.firstName))
                && (Objects.equals(this.lastName, aspirant.lastName))
                && (Objects.equals(this.group, aspirant.group))
                && (Objects.equals(this.scienceWork, aspirant.scienceWork));
    }

    @Override
    public int hashCode() {
        int result = 3;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + group.hashCode();
        result = 31 * result + scienceWork.hashCode();
        return result;
    }

}
