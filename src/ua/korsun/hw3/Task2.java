package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String []args){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = blankClearer(str);
        System.out.println("Your string is "+ checker(str1));
    }

    public static String blankClearer(String str){
        str = str.replaceAll(" ", "");
        return str;
    }
    public static String checker(String str1){
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.reverse();
        String str2 = new String(sb);
        return str2.equals(str1) ? "palindrome" : "not palindrome";
    }
}

