
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int choice;
        int maxNumber;
        int attempts;
        int score;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        System.out.print("Choose difficulty: ");
        choice = sc.nextInt();

        if (choice == 1) {
            maxNumber = 50;
            attempts = 10;
        }
        else if (choice == 2) {
            maxNumber = 100;
            attempts = 7;
        }
        else if (choice == 3) {
            maxNumber = 200;
            attempts = 5;
        }
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        int number = random.nextInt(maxNumber) + 1;
        score = attempts * 10;

        System.out.println("\nI have selected a number between 1 and " + maxNumber);
        System.out.println("You have " + attempts + " attempts.");

        boolean won = false;

        for (int i = 1; i <= attempts; i++) {

            System.out.print("\nAttempt " + i + ": Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("🎉 CORRECT! You won!");
                System.out.println("Your score: " + score);
                won = true;
                break;
            }
            else if (guess > number) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }

            score = score - 10;
        }

        if (won == false) {
            System.out.println("\n😢 Game Over!");
            System.out.println("The correct number was: " + number);
        }

        System.out.println("\n===== THANK YOU FOR PLAYING =====");

        sc.close();
    }
}
