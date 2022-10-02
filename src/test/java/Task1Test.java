import hw4.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {
    public Task1Test() {
    }

    @Test
    void ArithmeticMean_SomeArrays_Number() {
        int[] zeros = new int[20];
        int[] twelve = new int[]{20, 40, 5, 4, 5, 3, 3, 0, 10, 10, 40, 4};
        Assertions.assertEquals(0.0, Task1.arithmeticMean(zeros));
        Assertions.assertEquals(12.0, Task1.arithmeticMean(twelve));
    }

    @Test
    void GeometricMean_SomeArrays_Number() {
        int[] zeros = new int[20];
        int[] someArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(0.0, Task1.geometricMean(zeros));
        Assertions.assertEquals(3.764350599503129, Task1.geometricMean(someArray));
    }
}
