package by.hram.homework1.main.task3;

import org.junit.Test;

import static by.hram.homework1.main.task3.Task3.innerArea;
import static by.hram.homework1.main.task3.Task3.ratio;
import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void testAreaInscribedSquare01() {
        double areaOuterSquare = 15.5;

        double expected = 7.75;
        double actual = innerArea(areaOuterSquare);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testAreaInscribedSquare02() {
        double areaOuterSquare = Double.NaN;

        double expected = Double.NaN;
        double actual = innerArea(areaOuterSquare);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testAreaInscribedSquare03() {
        double areaOuterSquare = Double.POSITIVE_INFINITY;

        double expected = Double.POSITIVE_INFINITY;
        double actual = innerArea(areaOuterSquare);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testAreaInscribedSquare04() {
        double areaOuterSquare = Double.NEGATIVE_INFINITY;

        double expected = Double.NEGATIVE_INFINITY;
        double actual = innerArea(areaOuterSquare);

        assertEquals(expected,actual,0.0);
    }

    @Test
    public void testRatioInnerAreaToOuterArea01() {
        double areaOuterSquare = 15.5;
        double areaInscribedSquare = 7.75;

        double expected = 2;
        double actual = ratio(areaOuterSquare, areaInscribedSquare);

        assertEquals(expected, actual,0.0);
    }

    @Test
    public void testRatioInnerAreaToOuterArea02() {
        double areaOuterSquare = 15.5;
        double areaInscribedSquare = 0;

        double expected = Double.POSITIVE_INFINITY;
        double actual = ratio(areaOuterSquare, areaInscribedSquare);

        assertEquals(expected, actual,0.0);
    }


    @Test
    public void testRatioInnerAreaToOuterArea03() {
        double areaOuterSquare = 0;
        double areaInscribedSquare = 0;

        double expected = Double.NaN;
        double actual = ratio(areaOuterSquare, areaInscribedSquare);

        assertEquals(expected, actual,0.0);
    }

    @Test
    public void testRatioInnerAreaToOuterArea04() {
        double areaOuterSquare = Double.NaN;
        double areaInscribedSquare = 0;

        double expected = Double.NaN;
        double actual = ratio(areaOuterSquare, areaInscribedSquare);

        assertEquals(expected, actual,0.0);
    }

    @Test
    public void testRatioInnerAreaToOuterArea05() {
        double areaOuterSquare = 231;
        double areaInscribedSquare = Double.NaN;

        double expected = Double.NaN;
        double actual = ratio(areaOuterSquare, areaInscribedSquare);

        assertEquals(expected, actual,0.0);
    }
}