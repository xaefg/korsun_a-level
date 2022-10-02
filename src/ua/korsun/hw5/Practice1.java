package hw5;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] goodPrices = {1000, 650, 213, 2135, 543, 322, 506, 574, 690, 1203, 1230, 312};
        System.out.println("Goods prices " + Arrays.toString(goodPrices));
        System.out.println("Total price of goods above 1000uah is " + counter(goodPrices));
    }

    public static int counter(int[] arr) {
        int price = 0;
        for (int j : arr) {
            if (j > 1000) {
                price += j;
            }
        }
        return price;
    }
}

