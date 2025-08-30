package Java_core.JavaMethods.Level3;

import java.util.Scanner;

public class Q10 {
     public static boolean collinearSlope(double x1,double y1,double x2,double y2,double x3,double y3){
        // Compare slopes via cross-multiplication to avoid divide-by-zero
        double abx = x2 - x1, aby = y2 - y1;
        double bcx = x3 - x2, bcy = y3 - y2;
        double acx = x3 - x1, acy = y3 - y1;
        // ab/ = ac/ check => aby*acx == acy*abx and bcy*abx == aby*bcx
        return Math.abs(aby*acx - acy*abx) < 1e-9 && Math.abs(bcy*abx - aby*bcx) < 1e-9;
    }
    public static boolean collinearArea(double x1,double y1,double x2,double y2,double x3,double y3){
        double area = 0.5 * ( x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2) );
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
        double x1=sc.nextDouble(), y1=sc.nextDouble(), x2=sc.nextDouble(), y2=sc.nextDouble(), x3=sc.nextDouble(), y3=sc.nextDouble();
        System.out.println("Collinear (slope)? " + collinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Collinear (area)?  " + collinearArea(x1,y1,x2,y2,x3,y3));
    }
}
