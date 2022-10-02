package hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("The triangle area is " + trSqr());
    }
    public static double trSqr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter coordinates");
        double aX = sc.nextDouble();
        double aY = sc.nextDouble();
        double bX = sc.nextDouble();
        double bY = sc.nextDouble();
        double cX = sc.nextDouble();
        double cY = sc.nextDouble();
        return Math.abs((aX * (bY - cY) + bX * (cY- aY) + cX * (aY - bY))/2);
    }
}