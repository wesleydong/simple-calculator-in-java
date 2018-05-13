
package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
    private static Calc calculator;

    @BeforeClass
    public static void boot() {
        calculator = new Calc();
    }

    @Test
    public void shouldAddTwoNumbers() {
        int result = calculator.add(5, 7);
        assertEquals(result, 5 + 7);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        int result = calculator.subtract(12, 7);
        assertEquals(result, 12 - 7);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = calculator.multiply(3, 4);
        assertEquals(result, 3 * 4);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int result = calculator.divide(12, 4);
        assertEquals(result, 12 / 4);
    }

    @Test
    public void shouldMultiplyByZero() {
        int result = calculator.multiply(3, 0);
        assertEquals(result, 3 * 0);
    }

    @Test
    public void catchDivideBy0() {
        try {
            calculator.divide(5, 0);
            assert (false);
        }
        catch (Exception e_) {
            assert (true);
        }
    }

    @Test
    public void catchOverAdd() {

        try {
            calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
            assert (false);
        }
        catch (Exception e_) {
            assert (true);
        }

    }

    @Test
    public void catchOverMult() {

        try {
            calculator.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE);
            assert (false);
        }
        catch (Exception e_) {
            assert (true);
        }

    }

}
