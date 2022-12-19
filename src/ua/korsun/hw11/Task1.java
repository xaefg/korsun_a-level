package hw11;
import hw10.*;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Andrew", "Tate","504");
        Student student2 = new Student("Vitaly'", "Volochai","503");
        Student student3 = new Student("Andrew", "Tate","504");
        Aspirant aspirant1 = new Aspirant("Andrew", "Tate","504");
        Aspirant aspirant2 = new Aspirant("Andrew", "Tate","504");
        Aspirant aspirant3 = new Aspirant("Andrew", "Tate","504");
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(aspirant2.equals(student3));
        System.out.println();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(aspirant1.hashCode());

    }
}
