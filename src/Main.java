import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        int sum = 0;
        int inputInt = 0;
        int min = dataPoints[1];
        int max = dataPoints[1];
        double average = 0;
        boolean found = false;
        boolean foundPartTwo = false;

        for (int e = 1; e < dataPoints.length; e++) {
            dataPoints[e] = 1 + rnd.nextInt(100);
        }

        for (int e : dataPoints) {
            System.out.print(e + " | ");
        }

        for (int e : dataPoints) {
            sum += e;
        }
        average = (double) sum / dataPoints.length;

        System.out.println("\n The sum of the data points is: " + sum + "\n The average of the data points is: " + average);

        inputInt = SafeInput.getRangedInt(in, " Please enter a value between 1 and 100: ", 1,100);
        System.out.println(" You chose the number: " +inputInt);

        for (int e = 1; e < dataPoints.length; e++) {
            if (dataPoints[e] == inputInt) {
                System.out.println(" Your number was found at array index position(s): " + e);
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("\n Your number was not found in the data set.");
        }

        inputInt = SafeInput.getRangedInt(in, "\n Please enter a value between 1 and 100: ", 1,100);
        System.out.println(" You chose the number: " +inputInt);

        for (int e = 1; e < dataPoints.length; e++) {
            if (dataPoints[e] == inputInt) {
                System.out.println("\n Your number was found at array index position: " + e);
                foundPartTwo = true;
                break;
            }
        }
        if (!foundPartTwo)
        {
            System.out.println(" Your number was not found in the data set.");
        }

        for (int e:dataPoints)
        {
            if (e > max)
            {
                max = e;
            }
            if (e < min)
            {
                min = e;
            }
        }
        System.out.println(" The minimum number in the data set is: " + min + "\n the maximum number in the data set is " + max);

        System.out.println(" Average of your data points is: " + getAverage(dataPoints));

    }

    public static double getAverage(int values[]) {
        double sum = 0;
        double average = 0;

        for (double d : values) {
            sum += d;
        }
        average = sum / values.length;

        return average;
    }
    }