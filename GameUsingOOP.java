// Game - Guess the number

import java.util.Random;
import java.util.Scanner;

class guessNumber {
    Scanner sc = new Scanner(System.in);
    int userInput;
    int numberToGuess;
    int noOfGuesses = 0;

    // constructor generates the random number
    public guessNumber() {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1;
    }

    public void playGame() {
        while (userInput != numberToGuess) {
            System.out.print("Enter your guess( 1 to 100 ): ");
            userInput = sc.nextInt();
            if (userInput < 1 || userInput > 100) {
                System.out.println("Invalid Input! please enter number between 1 to 100");
                continue;
            } else if (userInput == numberToGuess) {
                System.out.println("You correctly guessed");
            } else if (userInput > numberToGuess) {
                System.out.println("Please guess smaller than this");
            } else if (userInput < numberToGuess) {
                System.out.println("Please guess larger than this");
            }
            noOfGuesses++;
        }
    }

    public int getNoOfGusses() {
        return noOfGuesses;
    }
}

public class GameUsingOOP {
    public static void main(String[] args) {
        guessNumber n1 = new guessNumber();
        n1.playGame();
        System.out.println("you guessed the number in " + n1.getNoOfGusses() + " tries");
    }
}

// import java.util.Random;
// import java.util.Scanner;

// // Game class that handles all the logic
// class Game {
// private int numberToGuess; // Stores the number to be guessed
// private int userGuess; // Stores the user's current guess
// private int noOfGuesses = 0; // Tracks the number of attempts

// // Constructor to generate the random number
// public Game() {
// Random rand = new Random();
// numberToGuess = rand.nextInt(100) + 1; // Random number from 1 to 100
// }

// // Method to take user input
// public void takeUserInput() {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter your guess (1-100): ");
// userGuess = sc.nextInt();
// }

// // Method to check if the guessed number is correct
// public boolean isCorrectNumber() {
// noOfGuesses++; // Increment guess counter each time

// if (userGuess == numberToGuess) {
// System.out.println("🎉 Correct! You guessed the number.");
// return true;
// } else if (userGuess < numberToGuess) {
// System.out.println("📈 Too low... Try a larger number.");
// } else {
// System.out.println("📉 Too high... Try a smaller number.");
// }
// return false;
// }

// // Getter for number of guesses
// public int getNoOfGuesses() {
// return noOfGuesses;
// }

// // Setter for number of guesses (if needed)
// public void setNoOfGuesses(int guesses) {
// this.noOfGuesses = guesses;
// }
// }

// // Main class to run the game
// public class GuessTheNumberGame {
// public static void main(String[] args) {
// Game game = new Game(); // Create a game instance
// boolean hasGuessedCorrectly = false;

// // Keep asking until the user guesses correctly
// while (!hasGuessedCorrectly) {
// game.takeUserInput(); // Take input
// hasGuessedCorrectly = game.isCorrectNumber(); // Check result
// }

// // Show number of attempts
// System.out.println("✅ You took " + game.getNoOfGuesses() + " attempts.");
// }
// }
