package home_work8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void cancelResult() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(0,calc.cancelResult());

    }

    @Test
    void add() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(9,calc.add(2,7));

    }

    @Test
    void addByNumber() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(4.5,calc.addByNumber(4.5));
    }

    @Test
    void subtract() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(90.5,calc.subtract(92,1.5));
    }

    @Test
    void subtractByNumber() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(-4.5,calc.subtractByNumber(4.5));
    }

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(151.5,calc.multiply(30.3,5));
    }

    @Test
    void multiplyByNumber() {
        Calculator calc = new Calculator();
        calc.add(3,5);
        Assertions.assertEquals(56,calc.multiplyByNumber(7));
    }

    @Test
    void divide() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(560.5,calc.divide(1121,2));
    }

    @Test
    void divideByNumber() {
        Calculator calc = new Calculator();
        calc.add(2,188);
        Assertions.assertEquals(10,calc.divideByNumber(19));
    }
}