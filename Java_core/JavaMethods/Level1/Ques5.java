package Java_core.JavaMethods.Level1;
import java.util.Scanner;

public class Ques5 {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();

        if (isSpringSeason(m, d)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
}