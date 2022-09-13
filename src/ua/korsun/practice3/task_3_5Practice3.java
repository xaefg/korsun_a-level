import java.util.Scanner;

public class task_3_5Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter exponent");
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }

    public static int power(int a, int b) {
        int result = 1;
        if (b == 0) {
            return result;
        } else {
            while (b != 0) {
                result *= a;
                --b;
            }
        }
        return result;
    }
}
