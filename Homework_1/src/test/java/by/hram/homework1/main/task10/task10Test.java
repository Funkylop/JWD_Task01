package by.hram.homework1.main.task10;

import org.junit.Test;

import static by.hram.homework1.main.task10.task10.printSpreadSheet;
import static by.hram.homework1.main.task10.task10.spreadSheet;
import static java.lang.StrictMath.tan;
import static org.junit.Assert.*;

public class task10Test {

    @Test
    public void testSpreadSheet1() {
        int a = 30, b = 60, h = 2, k = 0;
        for(int i = a; i<b; i+=h){
            k++;
        }
        k++;
        double[] [] mass = new double[k][2];
        int temp = a;
        for(int i = 0; i < k; i++){
            mass[i][0] = temp;
            mass[i][1] = tan(mass[i][0]);
            temp = temp+h;
        }

        double [][] expected = mass;
        double [][] actual = spreadSheet(a,b,h);

        assertArrayEquals(expected, actual);
        printSpreadSheet(actual);
    }

    @Test
    public void testSpreadSheet2() {
        double [][] expected = new double[0][0];
        double [][] actual = spreadSheet(12, 12, 0);

        assertArrayEquals(expected, actual);
        printSpreadSheet(actual);
    }

    @Test
    public void testSpreadSheet3() {
        double[] [] expected = new double[0][0];
        double [][] actual = spreadSheet(14,12,2);

        assertArrayEquals(expected, actual);
        printSpreadSheet(actual);
    }
}