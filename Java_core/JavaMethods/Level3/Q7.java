package Java_core.JavaMethods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static int[] factors(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0) c++;
        int[] f=new int[c];
        int idx=0;
        for(int i=1;i<=n;i++) if(n%i==0) f[idx++]=i;
        return f;
    }
    public static int greatestProperFactor(int n){
        for(int i=n/2;i>=1;i--) if(n%i==0) return i;
        return 1;
    }
    public static long sum(int[] a){ long s=0; for(int x:a)s+=x; return s; }
    public static long product(int[] a){ long p=1; for(int x:a)p*=x; return p; }
    public static double productOfCubes(int[] a){
        double p=1.0;
        for(int x:a) p *= Math.pow(x,3);
        return p;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int[] f = factors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest proper factor: " + greatestProperFactor(n));
        System.out.println("Sum of factors: " + sum(f));
        System.out.println("Product of factors: " + product(f));
        System.out.println("Product of cubes of factors: " + productOfCubes(f));
    }
}
