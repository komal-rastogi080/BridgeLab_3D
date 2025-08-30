package Java_core.Strings.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class q7 {
    public static boolean isPalindromeIterative(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = s.charAt(arr.length - 1 - i);
        return Arrays.equals(arr, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Iterative: " + isPalindromeIterative(s));
        System.out.println("Recursive: " + isPalindromeRecursive(s, 0, s.length() - 1));
        System.out.println("Array Compare: " + isPalindromeArray(s));
    }
}
