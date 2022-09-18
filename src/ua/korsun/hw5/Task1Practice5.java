import java.util.Arrays;

public class Task1Practice5 {
    public static void main(String[] args) {
        int[] goodPrices = {1000, 650, 213, 2135, 543, 322, 506, 574, 690, 1203, 1230, 312};
        System.out.println("Goods prices "+Arrays.toString(goodPrices));
        System.out.println("We have " + counter(goodPrices)+ " goods with price above 1000");
    }
    public static int counter(int [] arr){
        int count = 0;
        for (int j: arr) {
            if(j>1000){
                count++;
            }
        }
        return count;
    }
}
