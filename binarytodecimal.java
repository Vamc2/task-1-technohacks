import java.util.Random;

public class DiceRollSimulator {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();

        // Roll the first die (1 to 6)
        int die1 = random.nextInt(6) + 1;

        // Roll the second die (1 to 6)
        int die2 = random.nextInt(6) + 1;

        // Calculate the total result
        int total = die1 + die2;

        // Display the results
        System.out.println("Rolling a pair of dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + total);
    }
}
