package by.hram.homework1.main.task9;

import org.junit.Test;

import static org.junit.Assert.*;

public class task9Test {

    @Test
    public void testAreaCircle01() {
        double radius = 5.321;

        double expected = Math.PI * radius * radius;
        double actual = task9.square(radius);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAreaCircle02() {
        double radius = Double.NaN;

        double expected = Double.NaN;
        double actual = task9.square(radius);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAreaCircle03() {
        double radius = Double.POSITIVE_INFINITY;

        double expected = Double.POSITIVE_INFINITY;
        double actual = task9.square(radius);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAreaCircle04() {
        double radius = Double.NEGATIVE_INFINITY;

        double expected = Double.POSITIVE_INFINITY;
        double actual = task9.square(radius);

        assertEquals(expected, actual, 0.0);
    }


    @Test
    public void testLengthCircle01() {
        double radius = 8;

        double expected = 2 * Math.PI * radius;
        double actual = task9.len(radius);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLengthCircle02() {
        double radius = Double.NaN;

        double expected = Double.NaN;
        double actual = task9.len(radius);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLengthCircle03() {
        double radius = Double.POSITIVE_INFINITY;

        double expected = Double.POSITIVE_INFINITY;
        double actual = task9.len(radius);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testLengthCircle04() {
        double radius = Double.NEGATIVE_INFINITY;

        double expected = Double.NEGATIVE_INFINITY;
        double actual = task9.len(radius);

        assertEquals(expected, actual, 0.0);
    }

}