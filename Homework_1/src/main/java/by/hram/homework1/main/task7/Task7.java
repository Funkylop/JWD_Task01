package by.hram.homework1.main.task7;

import static java.lang.Math.sqrt;

public class Task7 {
    public static void main(String[] args) {
    }

    public static int [] isCloser(int[] cord1, int[] cord2) {
        double len1 = sqrt(cord1[0]*cord1[0] + cord1[1]*cord1[1]);
        double len2 = sqrt(cord2[0]*cord2[0] + cord2[1]*cord2[1]);
        if (len1 == len2) return cord1;
        if (len1 > len2) return cord2;
        else return cord1;
    }
}
