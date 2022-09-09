import java.util.Scanner;

public class Task2 {
    public static void main(String []args){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Your string is "+ checker(str));
    }

    public static String reverser(String str){
        str = str.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return new String(sb);
    }
    public static String checker(String str){
        return str.replaceAll(" ", "").equals(reverser(str)) ? "palindrome" : "not palindrome";
    }
}
