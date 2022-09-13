import java.util.Arrays;
import java.util.Random;

public class task2practice5 {
    public static void main(String[] args) {
        int[] goods = new int[12];
        int[] goods1 = filler(goods);
        System.out.println(Arrays.toString(filler(goods)));
        System.out.printf("Sum of goods above 1000 uah is " + total(goods1));
    }

    public static int[] filler(int[] arr) {
        Random random = new Random();
        for(int i =0;i< arr.length;i++){
            arr[i] = random.nextInt(0, 1200);
        }
        return arr;
    }
    public static int total(int[] arr){
        int sum = 0;
        for (int j : arr) {
            if(j>1000){
                sum += j;
            }
        }return sum;
    }
}
