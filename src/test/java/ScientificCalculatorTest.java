import static org.junit.jupiter.api.Assertions.*;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.Test;

class ScientificCalculatorTests {

    private final ScientificCalculator calculator = new ScientificCalculator();

    @Test
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001);
        assertEquals(5.0, calculator.squareRoot(25), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    @Test
    void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(120, calculator.factorial(5));
        assertEquals(3628800, calculator.factorial(10));
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, calculator.naturalLog(1), 0.0001);
        assertEquals(Math.log(10), calculator.naturalLog(10), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculator.naturalLog(0));
        assertThrows(IllegalArgumentException.class, () -> calculator.naturalLog(-3));
    }

    @Test
    void testPowerFunction() {
        assertEquals(8.0, calculator.power(2, 3), 0.0001);
        assertEquals(1.0, calculator.power(5, 0), 0.0001);
        assertEquals(0.25, calculator.power(2, -2), 0.0001);
    }
}
