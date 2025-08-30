package Java_core.JavaMethods.Level2;

import java.util.Scanner;

public class Q10 {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, bmi
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);
            String bmiStatus = getBMIStatus(bmi);

            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
            status[i] = bmiStatus;
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + data[i][0] + "kg, Height = " + data[i][1] + "cm, BMI = " + String.format("%.2f", data[i][2]) + ", Status = " + status[i]);
        }
    }
}
