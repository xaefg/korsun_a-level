import hw4.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {
    public Task1Test() {
    }

    @Test
    void ArithmeticMean_FilledArray_Number() {
        int[] twelve = new int[]{20, 40, 5, 4, 5, 3, 3, 0, 10, 10, 40, 4};
        Assertions.assertEquals(12.0, Task1.arithmeticMean(twelve));
    }
    @Test
    void ArithmeticMean_ZerosArray_Zero(){
        Assertions.assertEquals(0.0, Task1.arithmeticMean(new int[20]));
    }

    @Test
    void GeometricMean_FilledArray_Number() {
        int[] someArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(3.764350599503129, Task1.geometricMean(someArray));
    }
    @Test
    void GeometricMean_ZerosArray_Zero(){
        Assertions.assertEquals(0.0, Task1.geometricMean(new int[20]));
    }
}
