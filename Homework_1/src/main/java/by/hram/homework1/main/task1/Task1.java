package by.hram.homework1.main.task1;

public class Task1 {
    public static void main(String[] args) {
    }

    public static int numberOfSq(Number c)
    {
        String strNumb = String.valueOf(c);
        int lastNumb = Integer.parseInt("" + strNumb.charAt(strNumb.length()-1));

        return lastNumb * lastNumb % 10;
    }
}