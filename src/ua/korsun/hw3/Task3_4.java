package hw3;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int b = sc.nextInt();
        int a = (int) (Math.random()*3);
        System.out.println(checker(a,b));
    }
    public static String checker(int a, int b){
        Scanner sc = new Scanner(System.in);
        while(b != a){
            if(b<a){
                System.out.println("Low");
                b= sc.nextInt();
            }
            else{
                System.out.println("Too much");
                b= sc.nextInt();
            }
        }
        return "You've guessed!";
    }
}
