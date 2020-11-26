package by.hram.homework1.main.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {

    @Test
    public void TestDays1() {
        int year = 1990;
        int month = 1;

        int expected = 31;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestLeap1() {
        int year = 1990;

        boolean expected = false; //ne visokosnii
        boolean actual = Task2.checkYear(year);

        assertEquals(expected, actual);
    }
    
    @Test
    public void TestDays2() {
        int year = 1990;
        int month = 2;

        int expected = 28;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestLeap2() {
        int year = 1990;

        boolean expected = false; //ne visokosnii
        boolean actual = Task2.checkYear(year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestDays3() {
        int year = 2000;
        int month = 2;

        int expected = 29;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestLeap3() {
        int year = 2000;

        boolean expected = true; //visokosnii
        boolean actual = Task2.checkYear(year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestDays4() {
        int year = 2004;
        int month = 3;

        int expected = 31;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestLeap4() {
        int year = 2004;

        boolean expected = true; //visokosnii
        boolean actual = Task2.checkYear(year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestDays5() {
        int year = 2004;
        int month = 4;

        int expected = 30;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestLeap5() {
        int year = 2004;

        boolean expected = true; //visokosnii
        boolean actual = Task2.checkYear(year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestDays6() {
        int year = 2100;
        int month = 5;

        int expected = 31;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestLeap6() {
        int year = 2100;

        boolean expected = false; //ne visokosnii
        boolean actual = Task2.checkYear(year);

        assertEquals(expected, actual);
    }



    @Test
    public void TestDays7() {
        int year = 2110;
        int month = 4;

        int expected = 30;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestLeap7() {
        int year = 2110;

        boolean expected = false; //ne visokosnii
        boolean actual = Task2.checkYear(year);

        assertEquals(expected, actual);
    }

    @Test
    public void TestDays8() {
        int year = 2110;
        int month = 14;

        int expected = 0;
        int actual = Task2.checkMonth(month, year);

        assertEquals(expected, actual);
    }

}
