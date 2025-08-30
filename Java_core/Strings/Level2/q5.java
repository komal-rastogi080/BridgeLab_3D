package Java_core.Strings.Level2;

import java.util.Scanner;

public class q5 {
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
    public static int[] countVowelsConsonants(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < findLength(s); i++) {
            String type = checkChar(s.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVowelsConsonants(s);
        System.out.println("Vowels: " + res[0] + ", Consonants: " + res[1]);
    }
}
