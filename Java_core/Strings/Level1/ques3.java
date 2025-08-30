package Java_core.Strings.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class ques3 {
    public static char[] toCharArrayManual(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] manual = toCharArrayManual(s);
        char[] builtin = s.toCharArray();
        boolean res = compareArrays(manual, builtin);
        System.out.println("Manual Array: " + Arrays.toString(manual));
        System.out.println("Built-in Array: " + Arrays.toString(builtin));
        System.out.println("Compare Arrays: " + res);
    }
}
