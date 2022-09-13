import java.util.Scanner;

public class task2Hw2 {
    public static void main(String[] args){
        System.out.println("The triangle area is " + trSqr());
    }
    // i could make it work just through main method, but we need another one
    public static double trSqr(){
        /* to make this program somewhat useful i've added scanner,
        so my little brother will admire computer science supremacy */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter coordinates");
        double aX = sc.nextDouble();
        double aY = sc.nextDouble();
        double bX = sc.nextDouble();
        double bY = sc.nextDouble();
        double cX = sc.nextDouble();
        double cY = sc.nextDouble();

        /* with your pre-entered coordinates
        int aX = 1;
        int aY = 5;
        int bX = 3;
        int bY = 5;
        int cX = 6;
        int cY = 7;*/


        return Math.abs((aX * (bY - cY) + bX * (cY- aY) + cX * (aY - bY))/2);
    }
}