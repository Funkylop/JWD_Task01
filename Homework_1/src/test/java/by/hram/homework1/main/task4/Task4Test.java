package by.hram.homework1.main.task4;

import org.junit.Assert;
import org.junit.Test;

public class Task4Test {

    @Test
    public void testIsTrue1() {
        int [] mass = {4, 3, 1, 2};

        boolean actual = Task4.isTrue(mass);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue2() {
        int [] mass = {4, 3, 12, 35};

        boolean actual = Task4.isTrue(mass);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue3() {
        int [] mass = {1, 3, 12, 6};

        boolean actual = Task4.isTrue(mass);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue4() {
        int [] mass = {1, 3, 5, 3};

        boolean actual = Task4.isTrue(mass);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue5() {
        int [] mass = {2, 4, 12, 8};

        boolean actual = Task4.isTrue(mass);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsTrue6() {
        int [] mass = {9, 5, 1, 2};

        boolean actual = Task4.isTrue(mass);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }
}