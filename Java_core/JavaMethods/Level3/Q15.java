package Java_core.JavaMethods.Level3;

import java.util.Random;
import java.util.Scanner;

public class Q15 {
    public static double[][] randomMatrix(int n){
        Random r=new Random();
        double[][] a=new double[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) a[i][j]=r.nextInt(11)-5; // -5..5
        return a;
    }
    public static double[][] transpose(double[][] A){
        int n=A.length; double[][] T=new double[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) T[j][i]=A[i][j];
        return T;
    }
    public static double det2(double[][] A){
        return A[0][0]*A[1][1]-A[0][1]*A[1][0];
    }
    public static double det3(double[][] A){
        double a=A[0][0], b=A[0][1], c=A[0][2];
        double d=A[1][0], e=A[1][1], f=A[1][2];
        double g=A[2][0], h=A[2][1], i=A[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }
    public static double[][] inverse2(double[][] A){
        double det=det2(A);
        if(Math.abs(det)<1e-12) return null;
        double[][] inv = new double[2][2];
        inv[0][0]= A[1][1]/det;
        inv[0][1]=-A[0][1]/det;
        inv[1][0]=-A[1][0]/det;
        inv[1][1]= A[0][0]/det;
        return inv;
    }
    public static void print(double[][] M){
        for(double[] row:M){ for(double x:row) System.out.printf("%8.3f",x); System.out.println(); }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Matrix size (2 or 3 for det; inverse only for 2): ");
        int n=sc.nextInt();
        if(n!=2 && n!=3){ System.out.println("Only 2 or 3 supported in this demo."); return; }
        double[][] A = randomMatrix(n);
        System.out.println("Matrix A:"); print(A);

        System.out.println("Transpose(A):"); print(transpose(A));

        if(n==2){
            double det = det2(A);
            System.out.printf("det(A) = %.3f%n", det);
            double[][] inv = inverse2(A);
            if(inv==null) System.out.println("Inverse does not exist (singular).");
            else { System.out.println("Inverse(A):"); print(inv); }
        } else {
            double det = det3(A);
            System.out.printf("det(A) = %.3f%n", det);
            System.out.println("(Inverse not implemented for 3x3 in this demo.)");
        }
    }
}
