package Java_core.Strings.Level3;

import java.util.Scanner;

public class q1 {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] res = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            res[i][0] = String.valueOf(weight);
            res[i][1] = String.valueOf(height);
            res[i][2] = String.format("%.2f", bmi);
            res[i][3] = getStatus(bmi);
        }
        return res;
    }

    public static void display(String[][] arr) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = computeBMI(data);
        display(result);
    }
}
