package Java_core.Strings.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class q5 {
    public static char[] uniqueChars(String s) {
        char[] temp = new char[s.length()];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) { unique = false; break; }
            }
            if (unique) temp[size++] = c;
        }
        return Arrays.copyOf(temp, size);
    }

    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = uniqueChars(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] result = frequency(s);
        System.out.println("Char\tFreq");
        for (String[] row : result) System.out.println(row[0] + "\t" + row[1]);
    }
}
