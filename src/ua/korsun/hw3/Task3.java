package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        System.out.println("Enter sentence");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Your sentence have " + counter(str) + " words");
    }

    public static int counter(String str){
        str = str.trim();
        // trim for case, if input have space at the beginning
        String[] str1 = str.split("\\s+");
        return str.isEmpty() ? 0 : str1.length;
    }
}
