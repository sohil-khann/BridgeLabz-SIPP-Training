import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100. I will try to guess it.");
        System.out.println("Please provide feedback: 'high', 'low', or 'correct'.");

        while (true) {
            attempts++;
            guess = generateGuess(lowerBound, upperBound, random);
            System.out.println("My guess is: " + guess);
            System.out.print("Is it (high/low/correct)? ");
            feedback = scanner.next().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Great! I guessed your number in " + attempts + " attempts.");
                break;
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            } else {
                System.out.println("Invalid feedback. Please enter 'high', 'low', or 'correct'.");
            }

            if (lowerBound > upperBound) {
                System.out.println("It seems there's an issue with your feedback. I can't guess the number.");
                break;
            }
        }
        scanner.close();
    }

    public static int generateGuess(int lowerBound, int upperBound, Random random) {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}