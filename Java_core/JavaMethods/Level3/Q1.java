package Java_core.JavaMethods.Level3;

import java.util.Arrays;
import java.util.Random;

public class Q1 {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random r = new Random();
        for (int i = 0; i < 11; i++) heights[i] = r.nextInt(101) + 150; // 150..250
        return heights;
    }
    public static int sum(int[] a) { int s=0; for (int x:a) s+=x; return s; }
    public static double mean(int[] a) { return sum(a) / 11.0; }
    public static int min(int[] a) { int m=a[0]; for (int x:a) m=Math.min(m,x); return m; }
    public static int max(int[] a) { int m=a[0]; for (int x:a) m=Math.max(m,x); return m; }

    public static void main(String[] args){
        int[] h = generateHeights();
        System.out.println("Heights: " + Arrays.toString(h));
        System.out.println("Shortest: " + min(h) + " cm");
        System.out.println("Tallest : " + max(h) + " cm");
        System.out.printf("Mean    : %.2f cm%n", mean(h));
    }
}
