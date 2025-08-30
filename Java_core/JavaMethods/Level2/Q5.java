package Java_core.JavaMethods.Level2;

public class Q5 {
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double ft) { return ft * 0.333333; }
    public static double convertMetersToInches(double m) { return m * 39.3701; }
    public static double convertInchesToMeters(double in) { return in * 0.0254; }
    public static double convertInchesToCm(double in) { return in * 2.54; }

    public static void main(String[] args) {
        System.out.println("2 yards = " + convertYardsToFeet(2) + " feet");
        System.out.println("9 ft = " + convertFeetToYards(9) + " yards");
        System.out.println("1 m = " + convertMetersToInches(1) + " inches");
        System.out.println("10 in = " + convertInchesToMeters(10) + " m");
        System.out.println("5 in = " + convertInchesToCm(5) + " cm");
    }
}
