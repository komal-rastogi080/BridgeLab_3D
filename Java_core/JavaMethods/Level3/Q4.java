package Java_core.JavaMethods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static int[] toDigits(long n){
        char[] cs = String.valueOf(Math.abs(n)).toCharArray();
        int[] d=new int[cs.length];
        for(int i=0;i<cs.length;i++) d[i]=cs[i]-'0';
        return d;
    }
    public static int[] reverse(int[] a){
        int[] b=a.clone();
        for(int i=0,j=b.length-1;i<j;i++,j--){ int t=b[i]; b[i]=b[j]; b[j]=t; }
        return b;
    }
    public static boolean arraysEqual(int[] a,int[] b){
        return Arrays.equals(a,b);
    }
    public static boolean isPalindrome(long n){
        int[] d=toDigits(n);
        return arraysEqual(d, reverse(d));
    }
    public static boolean isDuck(long n){
        String s=String.valueOf(Math.abs(n));
        return s.indexOf('0',1)!=-1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        long n=sc.nextLong();
        int[] d=toDigits(n);
        int[] rev=reverse(d);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Reversed: " + Arrays.toString(rev));
        System.out.println("Arrays equal? " + arraysEqual(d,rev));
        System.out.println("Palindrome? " + isPalindrome(n));
        System.out.println("Duck? " + isDuck(n));
    }
}
