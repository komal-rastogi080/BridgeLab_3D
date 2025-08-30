package Java_core.Strings.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static int findLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }

    public static char[] uniqueChars(String s) {
        int n = findLength(s);
        char[] temp = new char[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) { unique = false; break; }
            }
            if (unique) temp[size++] = c;
        }
        return Arrays.copyOf(temp, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] result = uniqueChars(s);
        System.out.println("Unique characters: " + Arrays.toString(result));
    }
}
