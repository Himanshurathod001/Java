import java.util.Scanner;

public class cricket2 {
    public static void main(String[] args) {
        // Create an array to store the runs scored on each ball
        int[] runs = new int[6];

        // Predefined runs for each ball (as per the provided image)
        runs[0] = 1; // Ball 1
        runs[1] = 4; // Ball 2
        runs[2] = 0; // Ball 3 (dot ball)
        runs[3] = 6; // Ball 4
        runs[4] = 2; // Ball 5
        runs[5] = 0; // Ball 6 (dot ball)

        // Calculate total runs, count dot balls and find the highest score
        int totalRuns = 0;
        int dotBalls = 0;
        int highestRun = runs[0];

        for (int i = 0; i < runs.length; i++) {
            totalRuns += runs[i];
            if (runs[i] == 0) {
                dotBalls++;
            }
            if (runs[i] > highestRun) {
                highestRun = runs[i];
            }
        }

        // Output the results
        System.out.println("Total runs scored in the over: " + totalRuns);
        System.out.println("Number of dot balls: " + dotBalls);
        System.out.println("Highest run scored on a single ball: " + highestRun);
    }
}
