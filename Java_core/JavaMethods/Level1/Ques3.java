package Java_core.JavaMethods.Level1;
import java.util.Scanner;

public class Ques3 {
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return (5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int a = sc.nextInt();
        System.out.print("Enter side2: ");
        int b = sc.nextInt();
        System.out.print("Enter side3: ");
        int c = sc.nextInt();

        System.out.println("Number of rounds to complete 5 km = " + calculateRounds(a, b, c));
    }
}