package hw10;

public class Task1 {
    public static void main(String[] args) {
        Student[] students ={new Student(5), new Student(4), new Student(3)};
        Aspirant[] aspirants = {new Aspirant(4), new Aspirant(5), new Aspirant(3)};
        print(students);
        print1(aspirants);
    }
    static void print(Student[] arr){
        for(Student student : arr){
            System.out.println(student.getScholarship());
        }
    }
    static void print1(Aspirant[] arr){
        for (Aspirant aspirant : arr) {
            System.out.println(aspirant.getScholarship());
        }
    }
}
