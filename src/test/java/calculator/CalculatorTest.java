package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void init() {

        this.calculator = new Calculator();
    }

    @Test
    public void add() {
        System.out.println("test add function");
        assertEquals(6.2f, calculator.add(3.1f, 3.1f));
        assertEquals(-2.2f, calculator.add(-4.4f, 2.2f));
        assertThrows(IllegalArgumentException.class, () -> calculator.add(Float.NaN, 1.0f ));
    }

    @Test
    public void subtract() {
        System.out.println("test subtract function");
        assertEquals(2.0f, calculator.subtract(6.0f, 4.0f));
        assertEquals(4.4f, calculator.subtract(2.2f, -2.2f));
        assertThrows(IllegalArgumentException.class, ()-> calculator.subtract(Float.NaN, 2.0f));
    }

    @Test
    public void divide() {
        System.out.println("test divide function");

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0), "è impossibile dividere un qualsiasi " +
                "numero per 0");
        assertThrows(IllegalArgumentException.class,()-> calculator.divide(Float.NaN, 2f));
        assertEquals(12f, calculator.divide(24f, 2f));
    }

    @Test
    public void multiply() {
        assertEquals(49f, calculator.multiply(7f,7f));
        assertEquals(4.84f, calculator.multiply(2.2f, 2.2f));
        assertThrows(IllegalArgumentException.class, ()-> calculator.multiply(Float.NaN, 2f));
    }
}