package Java_core.JavaMethods.Level2;

public class Q12 {
     public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000 + 1000); // 1000 to 9999
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        double[] res = findAverageMinMax(arr);
        System.out.println("Average = " + res[0] + ", Min = " + res[1] + ", Max = " + res[2]);
    }
}
