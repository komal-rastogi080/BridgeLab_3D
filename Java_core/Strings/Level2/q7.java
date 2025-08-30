package Java_core.Strings.Level2;

import java.util.Scanner;

public class q7 {
    public static int findLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }
    public static int[] trimIndexes(String s) {
        int start = 0, end = findLength(s) - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }
    public static String substringManual(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) res += s.charAt(i);
        return res;
    }
    public static boolean compareStrings(String a, String b) {
        if (findLength(a) != findLength(b)) return false;
        for (int i = 0; i < findLength(a); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] idx = trimIndexes(s);
        String manual = substringManual(s, idx[0], idx[1]);
        String builtin = s.trim();
        System.out.println("Manual: '" + manual + "'");
        System.out.println("Built-in: '" + builtin + "'");
        System.out.println("Compare: " + compareStrings(manual, builtin));
    }
}
