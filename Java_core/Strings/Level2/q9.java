package Java_core.Strings.Level2;

import java.util.Scanner;

public class q9 {
    public static String computerChoice() {
        int c = (int)(Math.random() * 3);
        if (c == 0) return "rock";
        else if (c == 1) return "paper";
        return "scissors";
    }
    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        return -1;
    }
    public static String[][] calculateStats(int uWins, int cWins, int total) {
        String[][] res = new String[2][3];
        res[0][0] = "User"; res[0][1] = String.valueOf(uWins); res[0][2] = String.valueOf((uWins * 100.0) / total);
        res[1][0] = "Computer"; res[1][1] = String.valueOf(cWins); res[1][2] = String.valueOf((cWins * 100.0) / total);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int uWins = 0, cWins = 0;
        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user, comp);
            if (res == 1) uWins++;
            else if (res == -1) cWins++;
            System.out.println("Computer: " + comp + " -> " + (res == 1 ? "User Wins" : res == -1 ? "Computer Wins" : "Draw"));
        }
        String[][] stats = calculateStats(uWins, cWins, n);
        System.out.println("Player\tWins\t%");
        for (String[] row : stats) System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
    }
}
