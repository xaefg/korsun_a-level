import java.util.Arrays;
import java.util.Random;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] unsorted = createRandomArray(150000);
        int[] sorted = sort(unsorted);
        int[] sorted1 = sort1(unsorted);
        long before = System.currentTimeMillis();
        System.out.println(Arrays.toString(unsorted));
        System.out.println(Arrays.toString(sorted)+before);
        long before1 = System.currentTimeMillis();
        System.out.println(Arrays.toString(sorted1)+before1);
    }


//    public Constructor() {
//    }

    public static int[] sort(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
//        Constructor
        boolean changed;
        do {
            changed = false;
            for (int i = 1; i < sorted.length; i++) {
                if (sorted[i] < sorted[i - 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i - 1];
                    sorted[i - 1] = temp;
                    changed = true;
                }
            }
        } while (changed);

        return sorted;
    }

    public static int[] sort1(int[] arr) {
        int[] sortedOpt = Arrays.copyOf(arr, arr.length);
        boolean changed;
        int iterationDone = 0;
        do {
            changed = false;
            for (int i = 1; i < sortedOpt.length - iterationDone; i++) {
                ++iterationDone;
                if (sortedOpt[i] < sortedOpt[i - 1]) {
                    int temp = sortedOpt[i];
                    sortedOpt[i] = sortedOpt[i - 1];
                    sortedOpt[i - 1] = temp;
                    changed = true;
                }
            }
        } while (changed);

        return sortedOpt;
    }


    public static int[] createRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(500);
        }
        return numbers;
    }
}
