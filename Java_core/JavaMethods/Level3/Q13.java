package Java_core.JavaMethods.Level3;

import java.util.Random;
import java.util.Scanner;

public class Q13 {
    public static int[][] generatePCM(int n){
        Random r=new Random();
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++) a[i][j]= r.nextInt(90)+10; // 10..99 (two-digit)
        }
        return a;
    }
    public static double[][] totalsAvgPct(int[][] pcm){
        double[][] res=new double[pcm.length][3]; // total, avg, pct
        for(int i=0;i<pcm.length;i++){
            int total = pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg = total/3.0;
            double pct = (total/300.0)*100.0;
            res[i][0]=Math.round(total*100.0)/100.0;
            res[i][1]=Math.round(avg*100.0)/100.0;
            res[i][2]=Math.round(pct*100.0)/100.0;
        }
        return res;
    }
    public static void printScorecard(int[][] pcm, double[][] stats){
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPct%");
        for(int i=0;i<pcm.length;i++){
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f%n",
                i+1, pcm[i][0], pcm[i][1], pcm[i][2], stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] pcm = generatePCM(n);
        double[][] stats = totalsAvgPct(pcm);
        printScorecard(pcm, stats);
    }
}
