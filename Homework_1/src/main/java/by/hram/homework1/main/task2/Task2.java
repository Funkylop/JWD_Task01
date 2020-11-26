package by.hram.homework1.main.task2;

public class Task2 {
    public static void main(String[] args) {
    }

    public static int checkMonth(int numOfMonth, int year) {
        int daysInMonth;
        if (numOfMonth > 12 || numOfMonth < 0 || year < 0) return 0;
        if (numOfMonth == 4 || numOfMonth == 9 || numOfMonth == 9 || numOfMonth == 11) daysInMonth = 30;
        else if (numOfMonth == 2) if (checkYear(year)) daysInMonth = 29;
                                  else daysInMonth = 28;
        else daysInMonth = 31;
        return daysInMonth;
    }

    public static boolean checkYear(int year){
        if (year < 0 ) return false;
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else if (year % 4 == 0) return true;
        else return false;

    }
}
