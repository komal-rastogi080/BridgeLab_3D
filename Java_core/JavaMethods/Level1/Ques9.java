package Java_core.JavaMethods.Level1;
import java.util.Scanner;

public class Ques9 {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int ch = sc.nextInt();
        System.out.print("Enter number of children: ");
        int kids = sc.nextInt();

        int[] result = findRemainderAndQuotient(ch, kids);
        System.out.println("Each child gets " + result[1] + " chocolates, Remaining = " + result[0]);
    }
}