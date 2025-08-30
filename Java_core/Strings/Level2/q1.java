package Java_core.Strings.Level2;

import java.util.Scanner;

public class q1 {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Manual length: " + findLength(s));
        System.out.println("Built-in length: " + s.length());
    }
}
