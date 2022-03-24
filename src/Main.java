import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        int sum = 0;
        double average = 0;

        for (int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(101);
        }

        for (int e : dataPoints) {
            System.out.print(e + " | ");
        }

        for (int e : dataPoints) {
            sum += e;
        }
        average = (double) sum / dataPoints.length;

        System.out.println("\n The sum of the data points is: " + sum + "\n The average of the data points is: " + average);
    }
}