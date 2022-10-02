package hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(smallest(num1, num2, num3));
    }

    public static String smallest(int num1, int num2, int num3) {
        int a = num1 > 0 ? num1 : -num1;
        int b = num2 > 0 ? num2 : -num2;
        int c = num3 > 0 ? num3 : -num3;
        return a<b&&a<c ? (num1+" the smallest") : (b<a&&b<c? (num2+" the smallest") : (c<a&&c<b ? (num3+" the smallest") : "You've entered same numbers"));
    }
}