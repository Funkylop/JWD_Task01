package by.hram.homework1.main.task6;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {

    @Test
    public void testPassedFrom1() {
        int sec = 8245;

        int [] expected = {2, 17, 25};
        int [] actual = Task6.passedFrom(sec);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPassedFrom2() {
        int sec = 86401;

        int [] expected = {};
        int [] actual = Task6.passedFrom(sec);

        Assert.assertArrayEquals(expected, actual);
    }
}