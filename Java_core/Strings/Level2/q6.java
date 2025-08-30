package Java_core.Strings.Level2;

import java.util.Scanner;

public class q6 {
    public static int findLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] classifyCharacters(String s) {
        String[][] res = new String[findLength(s)][2];
        for (int i = 0; i < findLength(s); i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = checkChar(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] arr = classifyCharacters(s);
        System.out.println("Char\tType");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }
}
