import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("Welcome to the Guessing Game! ");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            while (!guessed) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! you guesssed the right number");
                    System.out.println("Number of attempts: " + attempts);
                    guessed = true;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again. ");
                } else {
                    System.out.println("Too high! Try again. ");
                }
            }
            scanner.close();
    }
}
