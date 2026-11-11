import java.util.*;

public class Driver {
    public static int difficulty = 0;
    public static int attempts = 0;
    public static Scanner scan = new Scanner(System.in);

    public static void DifficultySelect() {
        while (true) {
            System.out.println("Please select the difficulty level:\n1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)\n");
            System.out.print("Enter your choice: ");
            difficulty = scan.nextInt();
            if (difficulty > 0 && difficulty < 4) break;
            System.out.println("\nInvalid input, please try again.\n");
        }

        switch (difficulty) {
            case 1:
                System.out.println("\nGreat! You have selected the Easy difficulty level.\nLet's start the game!");
                attempts = 10;
                break;
            case 2:
                System.out.println("\nGreat! You have selected the Medium difficulty level.\nLet's start the game!");
                attempts = 5;
                break;
            case 3:
                System.out.println("\nGreat! You have selected the Hard difficulty level.\nLet's start the game!");
                attempts = 3;
                break;
        }
    }
    public static void GuessingGame() {
        int randnum = (int)(Math.random() * 100) + 1;
        int guess = 0;

        for (int i = 0; i < attempts; i++) {
            System.out.print("\nEnter your guess: ");
            guess = scan.nextInt();
            if (guess < randnum) {System.out.println("Incorrect! The number is more than " + guess);}
            if (guess > randnum) {System.out.println("Incorrect! The number is less than " + guess);}
            if (guess == randnum) {
                System.out.println("Congratulations! You guessed the correct number in " + (i + 1) + " attempts.");
                break;
            }
        }
        if (guess != randnum) {
            System.out.println("\nThe number was " + randnum);
            System.out.println("You have exhausted all your chances. Nice try.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        DifficultySelect();
        GuessingGame();

    }
}
