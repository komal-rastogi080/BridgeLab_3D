package Java_core.Strings.Level1;

import java.util.Scanner;

public class ques2 {
     public static String substringUsingCharAt(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += s.charAt(i);
        }
        return sub;
    }
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String manual = substringUsingCharAt(s, start, end);
        String builtin = s.substring(start, end);
        boolean res = compareUsingCharAt(manual, builtin);
        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtin);
        System.out.println("Compare: " + res);
    }
}
