package Java_core.Arrays;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Bonus for 10 employees
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            double s = sc.nextDouble();
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) { i--; continue; }
            salary[i] = s; years[i] = y;
        }
        for (int i = 0; i < 10; i++) {
            bonus[i] = (years[i] > 5) ? salary[i]*0.05 : salary[i]*0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);

        // 2. Youngest and tallest of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) { ages[i] = sc.nextInt(); heights[i] = sc.nextDouble(); }
        int minAge = ages[0], maxHeight = 0;
        for (int i = 1; i < 3; i++) { if (ages[i] < minAge) minAge = ages[i]; }
        double tallest = heights[0];
        for (int i = 1; i < 3; i++) { if (heights[i] > tallest) tallest = heights[i]; }
        System.out.println("Youngest age: " + minAge);
        System.out.println("Tallest height: " + tallest);

        // 3. Largest and second largest digit of a number
        long number = sc.nextLong();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;
        while (number != 0) {
            if (idx == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, idx);
                digits = temp;
            }
            digits[idx++] = (int)(number % 10);
            number /= 10;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < idx; i++) {
            if (digits[i] > largest) { secondLargest = largest; largest = digits[i]; }
            else if (digits[i] > secondLargest && digits[i] != largest) secondLargest = digits[i];
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        // 4. Reverse number
        System.out.print("Reversed digits: ");
        for (int i = idx-1; i >= 0; i--) System.out.print(digits[i] + " ");
        System.out.println();

        // 5. BMI for persons
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            weight[i] = w; height[i] = h;
        }
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i]/(height[i]*height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) System.out.println("Height: " + height[i] + " Weight: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);

        // 6. BMI using 2D array
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w/(h*h);
            double bmiVal = personData[i][2];
            if (bmiVal < 18.5) weightStatus[i] = "Underweight";
            else if (bmiVal < 25) weightStatus[i] = "Normal";
            else if (bmiVal < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for (int i = 0; i < n; i++) System.out.println("Height: " + personData[i][1] + " Weight: " + personData[i][0] + " BMI: " + personData[i][2] + " Status: " + weightStatus[i]);

        // 7. Student grades based on marks in 3 subjects
        int students = sc.nextInt();
        int[][] marks = new int[students][3];
        double[] percentages = new double[students];
        String[] grades = new String[students];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                if (m < 0) { j--; continue; }
                marks[i][j] = m;
            }
            percentages[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            double p = percentages[i];
            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        for (int i = 0; i < students; i++) System.out.println("Student " + (i+1) + " Percentage: " + percentages[i] + " Grade: " + grades[i]);

        // 8. Frequency of digits in a number
        long freqNum = sc.nextLong();
        int[] freqDigits = new int[10];
        while (freqNum != 0) { freqDigits[(int)(freqNum%10)]++; freqNum/=10; }
        for (int i = 0; i < 10; i++) System.out.println("Digit " + i + ": " + freqDigits[i]);
    }
}
