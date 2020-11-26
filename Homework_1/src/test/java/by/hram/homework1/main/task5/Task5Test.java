package by.hram.homework1.main.task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void testIsTrue1() {
        int m = 6;

        boolean expected = true;
        boolean actual = Task5.isTrue(m);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue2() {
        int m = 28;

        boolean expected = true;
        boolean actual = Task5.isTrue(m);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue3() {
        int m = 2;

        boolean expected = false;
        boolean actual = Task5.isTrue(m);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue4() {
        int m = 496;

        boolean expected = true;
        boolean actual = Task5.isTrue(m);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue5() {
        int m = 33550336;

        boolean expected = true;
        boolean actual = Task5.isTrue(m);

        assertEquals(expected, actual);
    }
}