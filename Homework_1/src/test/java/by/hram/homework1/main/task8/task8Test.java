package by.hram.homework1.main.task8;

import org.junit.Test;

import static org.junit.Assert.*;

public class task8Test {

    @Test
    public void testFunctionValue01() {
        double x = 4.5151;

        double expected = -x*x + 3*x +9;
        double actual = task8.functionValue(x);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testFunctionValue02() {
        double x = 2;

        double expected = 1/(Math.pow(x,3) - 6);
        double actual = task8.functionValue(x);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testFunctionValue03() {
        double x = Math.pow(6,1/3.);

        double expected = Double.POSITIVE_INFINITY;
        double actual = task8.functionValue(x);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testFunctionValue04() {
        double x = Double.NaN;

        double expected = Double.NaN;
        double actual = task8.functionValue(x);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testFunctionValue05() {
        double x = Double.POSITIVE_INFINITY;

        double expected = Double.NaN;
        double actual = task8.functionValue(x);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testFunctionValue06() {
        double x = Double.NEGATIVE_INFINITY;

        double expected = 0.0;
        double actual = task8.functionValue(x);

        assertEquals(expected,actual,0.0);
    }
}