package Java_core.Strings.Level2;

import java.util.Scanner;

public class q3 {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitManual(s);
        String[][] result = wordsWithLength(words);
        System.out.println("Word\tLength");
        for (String[] row : result) System.out.println(row[0] + "\t" + row[1]);
    }
}
