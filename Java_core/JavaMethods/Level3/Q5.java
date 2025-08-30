package Java_core.JavaMethods.Level3;

import java.util.Scanner;

public class Q5 {
     public static boolean isPrime(long n){
        if(n<2) return false;
        if(n%2==0) return n==2;
        for(long i=3;i*i<=n;i+=2) if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n){
        long sq=1L*n*n;
        int sum=0; while(sq>0){ sum+=sq%10; sq/=10; }
        return sum==n;
    }
    public static boolean isSpy(int n){
        int sum=0, prod=1, x=Math.abs(n);
        if(x==0) { sum=0; prod=0; }
        while(x>0){ int d=x%10; sum+=d; prod*=d; x/=10; }
        return sum==prod;
    }
    public static boolean isAutomorphic(int n){
        long sq=1L*n*n;
        return String.valueOf(sq).endsWith(String.valueOf(Math.abs(n)));
    }
    public static boolean isBuzz(int n){ return n%7==0 || Math.abs(n)%10==7; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Prime? " + isPrime(n));
        System.out.println("Neon? " + isNeon(n));
        System.out.println("Spy? " + isSpy(n));
        System.out.println("Automorphic? " + isAutomorphic(n));
        System.out.println("Buzz? " + isBuzz(n));
    }
}
