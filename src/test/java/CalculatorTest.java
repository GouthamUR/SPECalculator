package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testFactorial() {
        // Testing the factorial method in the Main class
        assertEquals(1, Main.factorial(0));
        assertEquals(1, Main.factorial(1));
        assertEquals(2, Main.factorial(2));
        assertEquals(6, Main.factorial(3));
        assertEquals(24, Main.factorial(4));
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testSquareRoot() {
        // Using reflection to invoke the private method or changing it to public for test purposes
        assertEquals(2.0, Main.sqrt(4), 0.001);
        assertEquals(3.0, Main.sqrt(9), 0.001);
        assertEquals(0.0, Main.sqrt(0), 0.001);
        assertEquals(5.0, Main.sqrt(25), 0.001);
    }

    @Test
    public void testNaturalLog() {
        // Using reflection to invoke the private method or changing it to public for test purposes
        assertEquals(0.0, Main.ln(1), 0.001);
        assertEquals(Math.log(2), Main.ln(2), 0.001);
        assertEquals(Math.log(10), Main.ln(10), 0.001);
    }

    @Test
    public void testPower() {
        // Using reflection to invoke the private method or changing it to public for test purposes
        assertEquals(4.0, Main.power(2, 2), 0.001);
        assertEquals(8.0, Main.power(2, 3), 0.001);
        assertEquals(1.0, Main.power(5, 0), 0.001);
        assertEquals(25.0, Main.power(5, 2), 0.001);
    }
}
