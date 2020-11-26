package by.hram.homework1.main.task7;

import org.junit.Test;

import static by.hram.homework1.main.task7.Task7.isCloser;
import static org.junit.Assert.*;

public class Task7Test {

    @Test
    public void testIsCloser1() {
        int[] cord1 = {0, 3};
        int[] cord2 = {3, 0};

        int[] actual = isCloser(cord1, cord2);
        int[] expected = cord1;
    }

    @Test
    public void testIsCloser2() {
        int[] cord1 = {0, 12};
        int[] cord2 = {4, 3};

        int[] actual = isCloser(cord1, cord2);
        int[] expected = cord2;

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIsCloser3() {
        int[] cord1 = {1, 6};
        int[] cord2 = {4, 15};

        int[] actual = isCloser(cord1, cord2);
        int[] expected = cord1;

        assertArrayEquals(expected, actual);
    }
}