package by.hram.homework1.main.task10;

import static java.lang.StrictMath.tan;

public class task10 {
    public static void main(String[] args) {
    }

    public static double[][] spreadSheet(int a, int b, int h){
        double[][] mass = new double[0][0];
        if (a>b) return mass;
        if (h==0 || h<0) return mass;
        int k = 0;
        for(int i = a; i<=b; i+=h){
            k++;
        }
        mass = new double[k][2];
        for(int i = 0; i < k; i++){
            mass[i][0] = a;
            mass[i][1] = tan(mass[i][0]);
            a = a+h;
        }
        return mass;
    }

    public static void printSpreadSheet(double[][] mass){
        System.out.println("\t\tTable");
        System.out.println("X  \t\t\t F(X) ");
        for (int i = 0; i < mass.length; i++) System.out.println(mass[i][0] + "\t\t" + mass[i][1]);
    }
}
