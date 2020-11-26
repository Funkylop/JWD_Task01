package by.hram.homework1.main.task4;

public class Task4 {
    public static void main(String[] args) {

    }

    public static boolean isTrue(int[] mass)
    {
        for (int i = 0; i < mass.length-1; i++) {
            if (mass[i] % 2 == 0) for (int j = i + 1; j < mass.length; j++) if (mass[j] % 2 == 0) return true;
        }
        return false;
    }
}
