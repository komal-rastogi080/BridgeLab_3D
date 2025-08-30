package Java_core.JavaMethods.Level3;

import java.util.Scanner;

public class Q6 {
    public static int sumProperDivisors(int n){
        if(n<=1) return 0;
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){ sum+=i; if(i!=n/i) sum+=n/i; }
        }
        return sum;
    }
    public static boolean isPerfect(int n){ return n>0 && sumProperDivisors(n)==n; }
    public static boolean isAbundant(int n){ return n>0 && sumProperDivisors(n)>n; }
    public static boolean isDeficient(int n){ return n>0 && sumProperDivisors(n)<n; }
    public static long fact(int x){ long f=1; for(int i=2;i<=x;i++) f*=i; return f; }
    public static boolean isStrong(int n){
        int x=Math.abs(n);
        long sum=0, y=x;
        if(x==0) sum=1; // 0! = 1
        while(y>0){ int d=(int) (y%10); sum+=fact(d); y/=10; }
        return sum==x;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Perfect? " + isPerfect(n));
        System.out.println("Abundant? " + isAbundant(n));
        System.out.println("Deficient? " + isDeficient(n));
        System.out.println("Strong? " + isStrong(n));
    }
}
