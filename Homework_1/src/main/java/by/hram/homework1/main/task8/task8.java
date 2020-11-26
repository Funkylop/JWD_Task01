package by.hram.homework1.main.task8;

public class task8 {
    public static void main(String[] args) {

    }

    public static double functionValue(double x){
        if (x>=3) return -x * x + 3 * x + 9;
        else return 1 / (Math.pow(x,3) - 6);
    }
}
