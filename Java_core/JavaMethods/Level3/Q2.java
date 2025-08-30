package Java_core.JavaMethods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static int countDigits(long n){ return String.valueOf(Math.abs(n)).length(); }
    public static int[] toDigits(long n){
        char[] cs = String.valueOf(Math.abs(n)).toCharArray();
        int[] d = new int[cs.length];
        for (int i=0;i<cs.length;i++) d[i]=cs[i]-'0';
        return d;
    }
    // Duck number (standard): contains at least one '0' not counting a leading zero
    public static boolean isDuck(long n){
        String s = String.valueOf(Math.abs(n));
        return s.indexOf('0', 1) != -1;
    }
    public static boolean isArmstrong(long n){
        int[] d = toDigits(n);
        int p = d.length;
        long sum = 0;
        for (int x: d) sum += Math.pow(x, p);
        return sum == Math.abs(n);
    }
    public static int[] largestTwo(int[] d){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int x: d){
            if(x>first){ second=first; first=x; }
            else if(x>second && x!=first){ second=x; }
        }
        return new int[]{first, second};
    }
    public static int[] smallestTwo(int[] d){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int x: d){
            if(x<first){ second=first; first=x; }
            else if(x<second && x!=first){ second=x; }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        long n=sc.nextLong();
        int[] digits = toDigits(n);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count : " + countDigits(n));
        System.out.println("Duck? : " + isDuck(n));
        System.out.println("Armstrong? : " + isArmstrong(n));
        System.out.println("Largest & 2nd: " + Arrays.toString(largestTwo(digits)));
        System.out.println("Smallest & 2nd: " + Arrays.toString(smallestTwo(digits)));
    }
}
