import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number (" + secretNumber + ") in "
                        + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
