
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        int totalAttempts = 0;
        int totalRounds = 0;
        int totalRoundsWon = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        
        while (playAgain) {
            totalRounds++;
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5; 
            
            while (attempts < maxAttempts) {
                System.out.print("Guess the number between 1 and 100: ");
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;
                
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
                    totalRoundsWon++;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + secretNumber + ".");
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        
        System.out.println("You played " + totalRounds + " rounds, won " + totalRoundsWon + " rounds, and took " + totalAttempts + " attempts in total.");
        
        scanner.close();
    }
}
