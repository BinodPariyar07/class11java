import java.util.Random;
import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("I've chosen a number between 1 and 100. Can you guess it?");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
            } else if (userGuess < randomNumber) {
                System.out.println("The number is higher. Try again!");
            } else if (userGuess > randomNumber) {
                System.out.println("The number is lower. Try again!");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
