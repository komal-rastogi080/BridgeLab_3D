package Java_core.Arrays;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Voting Age
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] < 0) System.out.println("Invalid age");
            else if (ages[i] >= 18) System.out.println("The student with the age " + ages[i] + " can vote");
            else System.out.println("The student with the age " + ages[i] + " cannot vote");
        }

        // 2. Positive, Negative, Zero, Even/Odd, Compare first and last
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) System.out.println(numbers[i] + " is positive and even");
                else System.out.println(numbers[i] + " is positive and odd");
            } else if (numbers[i] < 0) System.out.println(numbers[i] + " is negative");
            else System.out.println("0");
        }
        if (numbers[0] == numbers[4]) System.out.println("First and last are equal");
        else if (numbers[0] > numbers[4]) System.out.println("First is greater than last");
        else System.out.println("First is less than last");

        // 3. Multiplication table
        int num = sc.nextInt();
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) table[i] = num * (i + 1);
        for (int i = 0; i < 10; i++) System.out.println(num + " * " + (i + 1) + " = " + table[i]);

        // 4. Store values up to 10 or until 0/negative and sum
        double[] vals = new double[10];
        double total = 0.0;
        int idx = 0;
        while (true) {
            double v = sc.nextDouble();
            if (v <= 0 || idx == 10) break;
            vals[idx++] = v;
        }
        for (int i = 0; i < idx; i++) total += vals[i];
        for (int i = 0; i < idx; i++) System.out.println(vals[i]);
        System.out.println("Total = " + total);

        // 5. Multiplication table 6 to 9
        int number = sc.nextInt();
        int[] multResult = new int[4];
        for (int i = 6; i <= 9; i++) multResult[i-6] = number * i;
        for (int i = 6; i <= 9; i++) System.out.println(number + " * " + i + " = " + multResult[i-6]);

        // 6. Mean height of football team
        double[] heights = new double[11];
        double sumHeight = 0;
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sumHeight += heights[i];
        }
        System.out.println("Mean height = " + (sumHeight / 11));

        // 7. Odd and Even arrays
        int upper = sc.nextInt();
        if (upper < 1) {
            System.out.println("Error: not a natural number");
            return;
        }
        int[] odd = new int[upper/2 + 1];
        int[] even = new int[upper/2 + 1];
        int oddIdx = 0, evenIdx = 0;
        for (int i = 1; i <= upper; i++) {
            if (i % 2 == 0) even[evenIdx++] = i;
            else odd[oddIdx++] = i;
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIdx; i++) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIdx; i++) System.out.print(even[i] + " ");
        System.out.println();

        // 8. Factors of a number
        int fnum = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int fIdx = 0;
        for (int i = 1; i <= fnum; i++) {
            if (fnum % i == 0) {
                if (fIdx == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, fIdx);
                    factors = temp;
                }
                factors[fIdx++] = i;
            }
        }
        System.out.print("Factors: ");
        for (int i = 0; i < fIdx; i++) System.out.print(factors[i] + " ");
        System.out.println();

        // 9. 2D Array to 1D Array
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) matrix[i][j] = sc.nextInt();
        int[] oneD = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) oneD[index++] = matrix[i][j];
        System.out.print("1D Array: ");
        for (int val : oneD) System.out.print(val + " ");
        System.out.println();

        // 10. FizzBuzz
        int fbNum = sc.nextInt();
        if (fbNum > 0) {
            String[] fbArr = new String[fbNum+1];
            for (int i = 0; i <= fbNum; i++) {
                if (i % 3 == 0 && i % 5 == 0) fbArr[i] = "FizzBuzz";
                else if (i % 3 == 0) fbArr[i] = "Fizz";
                else if (i % 5 == 0) fbArr[i] = "Buzz";
                else fbArr[i] = Integer.toString(i);
            }
            for (int i = 0; i <= fbNum; i++) System.out.println("Position " + i + " = " + fbArr[i]);
        }
    }
}
