package Java_core.Strings.Level2;

import java.util.Random;
import java.util.Scanner;

public class q10 {
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60;
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }
    public static double[][] calculateTotals(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double per = Math.round((total / 300.0) * 10000.0) / 100.0;
            result[i][0] = total; result[i][1] = Math.round(avg * 100.0) / 100.0; result[i][2] = per;
        }
        return result;
    }
    public static String[] calculateGrades(double[][] totals) {
        String[] grades = new String[totals.length];
        for (int i = 0; i < totals.length; i++) {
            double p = totals[i][2];
            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateMarks(n);
        double[][] totals = calculateTotals(scores);
        String[] grades = calculateGrades(totals);
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + (int)totals[i][0] + "\t" + totals[i][1] + "\t" + totals[i][2] + "\t" + grades[i]);
        }
    }
}
