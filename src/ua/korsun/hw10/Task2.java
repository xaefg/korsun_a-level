package hw10;

public class Task2 {
    public static void main(String[] args) {
        Pow power = (number, pow) -> {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result *= number;
            }
            return result;
        };
        int result = power.pow(3,3);
        System.out.println(result);
    }
}
