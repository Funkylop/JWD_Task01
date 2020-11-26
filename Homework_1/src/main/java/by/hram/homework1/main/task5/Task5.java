package by.hram.homework1.main.task5;

public class Task5 {
    public static void main(String[] args) {
    }

    public static boolean isTrue(int num) {
        if (num < 6) return false;

        int sum = 1;

        for (int i = 2; i < num/2+1; i++)
        {
            if (num % i == 0) sum+=i;
        }

        return sum == num;
    }
}
