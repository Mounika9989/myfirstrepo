import java.util.Random; // Import the Random class

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random randomGenerator = new Random();

        // Define the minimum and maximum values for the range (inclusive)
        int min = 1;
        int max = 100;

        // Generate a random integer between min and max (inclusive)
        // The formula is random.nextInt((max - min) + 1) + min;
        int randomNumber = randomGenerator.nextInt((max - min) + 1) + min;

        // Print the generated random number
        System.out.println("Generated random number between " + min + " and " + max + ": " + randomNumber);
    }
}


