package Java_core.Strings.Level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    public static String[][] frequency(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];
        Arrays.fill(freq, -1);

        for (int i = 0; i < n; i++) {
            if (freq[i] == -1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }

        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (freq[i] > 0) list.add(new String[]{String.valueOf(chars[i]), String.valueOf(freq[i])});
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
