import java.util.Scanner;

public class homework2Task4Smallest {
    public static void main(String args[]) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(smallest(num1, num2, num3));
    }

    public static String smallest(int num1, int num2, int num3) {
        boolean a = Math.abs(num1)<Math.abs(num2)&&Math.abs(num1)<Math.abs(num3)&&Math.abs(num1)!=Math.abs(num2)&&Math.abs(num1)!= Math.abs(num3);
        boolean b = Math.abs(num2)<Math.abs(num1)&&Math.abs(num2)<Math.abs(num3)&&Math.abs(num2)!=Math.abs(num1)&&Math.abs(num2)!= Math.abs(num3);
        boolean c = Math.abs(num3)<Math.abs(num1)&&Math.abs(num3)<Math.abs(num2)&&Math.abs(num3)!=Math.abs(num1)&&Math.abs(num3)!= Math.abs(num2);
        return a ? (num1+" the smallest") : (b ? (num2+" the smallest") : (c ? (num3+" the smallest") : "You've entered same numbers"));
    }
}