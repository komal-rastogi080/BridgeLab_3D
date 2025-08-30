package Java_core.JavaMethods.Level3;

import java.util.Random;

public class Q11 {
    public static int[][] generateOldData(int n){
        // col0: salary, col1: years of service
        Random r=new Random();
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]= r.nextInt(90000)+10000; // 5-digit (10000..99999)
            a[i][1]= r.nextInt(11);          // 0..10 years
        }
        return a;
    }
    public static double[][] newSalaryAndBonus(int[][] old){
        // col0: new salary, col1: bonus amount
        double[][] res=new double[old.length][2];
        for(int i=0;i<old.length;i++){
            double rate = old[i][1] > 5 ? 0.05 : 0.02;
            double bonus = old[i][0]*rate;
            res[i][0] = old[i][0] + bonus;
            res[i][1] = bonus;
        }
        return res;
    }
    public static void printTable(int[][] old, double[][] latest){
        double totalOld=0,totalNew=0,totalBonus=0;
        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        for(int i=0;i<old.length;i++){
            totalOld += old[i][0];
            totalNew += latest[i][0];
            totalBonus += latest[i][1];
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f%n", i+1, old[i][0], old[i][1], latest[i][1], latest[i][0]);
        }
        System.out.printf("TOTALS\t%.2f\t\t \t%.2f\t\t%.2f%n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args){
        int[][] old = generateOldData(10);
        double[][] latest = newSalaryAndBonus(old);
        printTable(old, latest);
    }
}
