package by.hram.homework1.main.task1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Test {

    @Test
    public void testNumberOfSq01() {
        Number number = 15.1245;

        int expected = 5;
        int actual = Task1.numberOfSq(number);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfSq02() {
        Number number = 12;

        int expected = 4;
        int actual = Task1.numberOfSq(number);

        assertEquals(expected, actual);
    }
    @Test
    public void testNumberOfSq03() {
        Number number = 152;

        int expected = 4;
        int actual = Task1.numberOfSq(number);

        Assert.assertEquals(expected, actual);
    }
}