
import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of coin flips
        System.out.print("Enter the number of times to flip the coin: ");
        int numberOfFlips = scanner.nextInt();

        // Validate that the input is a positive integer
        if (numberOfFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");

        }

        // Counters for heads and tails
        int headsCount = 0;
        int tailsCount = 0;

        // Creating a Random object
        Random random = new Random();

        // Simulating coin flips
        for (int i = 0; i < numberOfFlips; i++) {
            // Generating a random 0 or 1 (heads or tails)
            int result = random.nextInt(2);

            // Incrementing the counters based on the result
            if (result == 0) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Calculating percentages
        double headsPercentage = (double) headsCount / numberOfFlips * 100;
        double tailsPercentage = (double) tailsCount / numberOfFlips * 100;

        // Printing the results
        System.out.println("Number of flips: " + numberOfFlips);
        System.out.println("Heads count: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails count: " + tailsCount + " (" + tailsPercentage + "%)");

        // Close the scanner
        scanner.close();
    }
}
