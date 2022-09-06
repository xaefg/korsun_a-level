import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Your number is "+isOdd(x));
    }

    public static String isOdd(double x){
        return (x%2 == 0) ? "even" : "odd";
    }
}
