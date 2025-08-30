package Java_core.Strings.Level2;

import java.util.Scanner;

public class q4 {
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
    public static String[][] wordsWithLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLength(words[i]));
        }
        return res;
    }
    public static int[] shortestLongest(String[][] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIdx = -1, maxIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] arr = wordsWithLength(splitManual(s));
        int[] res = shortestLongest(arr);
        System.out.println("Shortest: " + arr[res[0]][0]);
        System.out.println("Longest: " + arr[res[1]][0]);
    }
}
