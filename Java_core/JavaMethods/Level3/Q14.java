package Java_core.JavaMethods.Level3;

import java.util.Random;
import java.util.Scanner;

public class Q14 {
    public static int[][] randomMatrix(int rows,int cols){
        Random r=new Random();
        int[][] a=new int[rows][cols];
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) a[i][j]=r.nextInt(21)-10; // -10..10
        return a;
    }
    public static int[][] add(int[][] A,int[][] B){
        int r=A.length,c=A[0].length; int[][] R=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) R[i][j]=A[i][j]+B[i][j];
        return R;
    }
    public static int[][] sub(int[][] A,int[][] B){
        int r=A.length,c=A[0].length; int[][] R=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) R[i][j]=A[i][j]-B[i][j];
        return R;
    }
    public static int[][] mul(int[][] A,int[][] B){
        int r=A.length, n=A[0].length, c=B[0].length;
        int[][] R=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++){
            int s=0; for(int k=0;k<n;k++) s+=A[i][k]*B[k][j];
            R[i][j]=s;
        }
        return R;
    }
    public static void print(int[][] M){
        for(int[] row:M){ for(int x:row) System.out.printf("%4d",x); System.out.println(); }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Rows, Cols for A: ");
        int ra=sc.nextInt(), ca=sc.nextInt();
        System.out.print("Rows, Cols for B (for add/sub must match A; for mul rowsB=colsA): ");
        int rb=sc.nextInt(), cb=sc.nextInt();

        int[][] A = randomMatrix(ra, ca);
        int[][] B = randomMatrix(rb, cb);

        System.out.println("A:"); print(A);
        System.out.println("B:"); print(B);

        if(ra==rb && ca==cb){
            System.out.println("A+B:"); print(add(A,B));
            System.out.println("A-B:"); print(sub(A,B));
        } else {
            System.out.println("Add/Sub not possible due to size mismatch.");
        }

        if(ca==rb){
            System.out.println("A*B:"); print(mul(A,B));
        } else {
            System.out.println("Multiply not possible (colsA != rowsB).");
        }
    }
}
