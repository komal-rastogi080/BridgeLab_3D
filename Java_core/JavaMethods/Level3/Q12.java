package Java_core.JavaMethods.Level3;

import java.util.Scanner;

public class Q12 {
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] lineEquation(double x1,double y1,double x2,double y2){
        if (Math.abs(x2-x1) < 1e-12) return new double[]{Double.POSITIVE_INFINITY, Double.NaN}; // vertical line
        double m = (y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2: ");
        double x1=sc.nextDouble(), y1=sc.nextDouble(), x2=sc.nextDouble(), y2=sc.nextDouble();
        System.out.printf("Distance: %.4f%n", distance(x1,y1,x2,y2));
        double[] mb=lineEquation(x1,y1,x2,y2);
        if(Double.isInfinite(mb[0])) System.out.println("Line: x = " + x1 + " (vertical)");
        else System.out.printf("Line: y = %.4f*x + %.4f%n", mb[0], mb[1]);
    }
}
