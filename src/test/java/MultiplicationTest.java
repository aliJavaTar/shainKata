import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {
    private Multiplication multiplication;

    @BeforeEach
    public void CreateObject() {
        multiplication = new Multiplication();
    }

    @Test
    public void numberLessThree()
    {
        int one = 1;
        int number = multiplication.computeMultipleSum(one);
        assertEquals(-1, number);
        int tow = 2;
        int number1 = multiplication.computeMultipleSum(one);
        assertEquals(-1, number1);
    }

    @Test
    public void numberBiggerTwo() {
        int number = multiplication.computeMultipleSum(11);
        assertEquals(40, number);

    }
    @Test
    public void numberBiggerTwo1() {
        int number1 = multiplication.computeMultipleSum(15);
        assertEquals(66, number1);
    }
    @Test
    public void numberBiggerTwo2() {
        int number1 = multiplication.computeMultipleSum(20);
        assertEquals(99, number1);
    }

}