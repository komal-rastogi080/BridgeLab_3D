package Java_core.JavaMethods.Level2;

import java.util.Scanner;

public class Q3 {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (isLeapYear(year)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }
}
