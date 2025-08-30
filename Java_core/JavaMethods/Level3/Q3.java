package Java_core.JavaMethods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
     public static int[] toDigits(long n){
        char[] cs = String.valueOf(Math.abs(n)).toCharArray();
        int[] d = new int[cs.length];
        for (int i=0;i<cs.length;i++) d[i]=cs[i]-'0';
        return d;
    }
    public static int sumDigits(int[] d){ int s=0; for(int x:d)s+=x; return s; }
    public static int sumSquares(int[] d){ int s=0; for(int x:d)s+= (int)Math.pow(x,2); return s; }
    public static boolean isHarshad(long n){
        int[] d = toDigits(n);
        int s = sumDigits(d);
        return s!=0 && Math.abs(n)%s==0;
    }
    public static int[][] digitFrequency(int[] d){
        int[] f=new int[10];
        for(int x:d) f[x]++;
        int[][] res=new int[10][2];
        for(int i=0;i<10;i++){ res[i][0]=i; res[i][1]=f[i]; }
        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        long n=sc.nextLong();
        int[] digits=toDigits(n);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Harshad? " + isHarshad(n));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit : Freq");
        for (int i=0;i<freq.length;i++) System.out.println(freq[i][0]+" : "+freq[i][1]);
    }
}
