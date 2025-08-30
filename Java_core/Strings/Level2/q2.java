package Java_core.Strings.Level2;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static int findLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }
    public static String[] splitManual(String s) {
        int count = 1;
        for (int i = 0; i < findLength(s); i++) if (s.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int lastIndex = 0, w = 0;
        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) == ' ') {
                words[w++] = s.substring(lastIndex, i);
                lastIndex = i + 1;
            }
        }
        words[w] = s.substring(lastIndex);
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] manual = splitManual(s);
        String[] builtin = s.split(" ");
        System.out.println("Manual: " + Arrays.toString(manual));
        System.out.println("Built-in: " + Arrays.toString(builtin));
        System.out.println("Compare: " + compareArrays(manual, builtin));
    }
}
