package Java_core.Strings.Level3;

import java.util.ArrayList;
import java.util.Scanner;

public class q4 {
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > 0) {
                list.add(new String[]{String.valueOf(s.charAt(i)), String.valueOf(freq[s.charAt(i)])});
                freq[s.charAt(i)] = 0;
            }
        }
        return list.toArray(new String[0][0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] result = frequency(s);
        System.out.println("Char\tFreq");
        for (String[] row : result) System.out.println(row[0] + "\t" + row[1]);
    }
}
