package by.hram.homework1.main.task6;

public class Task6 {
    public static void main(String[] args) {
    }

    public static int[] passedFrom(int sec)
    {
        if (sec > 86400) return new int[]{};
        int hours = sec / 3600;
        int minutes = (sec-3600*hours)/60;
        sec = sec - hours*3600 - minutes*60;

        int [] mass = new int[]{hours, minutes, sec};

        return mass;
    }
}
