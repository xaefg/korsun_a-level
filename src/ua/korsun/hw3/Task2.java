import java.util.Scanner;

public class Task2 {
    public static void main(String []args){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Your string is "+ checker(str));
        System.out.println("Your string is "+ checker1(str));
    }
    //with loop
    public static String checker(String str){
        String str1 = str.replaceAll(" ", "");
        String str2 = "";
        for(int i = 0; i <str1.length() ; i++){
            char ch;
            ch = str1.charAt(i);
            str2 = ch+str2;
        }
        return str1.equals(str2) ? "palindrome" : "not palindrome";
    }
    //with string builder
    public static String checker1(String str){
        str = str.replaceAll(" ", "");
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        return str.contentEquals(str1) ? "palindrome" : "not palindrome";
    }
}
