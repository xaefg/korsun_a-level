package hw13;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 40;
        System.out.println(search(arr, x) == x);


    }

    public static int search(int[] arr, int x) {
        if (arr.length == 0) {
            return -1;
        }
        int l = arr[0];
        int r = arr[arr.length - 1];
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m == x) {
                return m;
            }
            if (m < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }

        }
        return -1;
    }

}
