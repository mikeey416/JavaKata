package lesson09b;

import java.util.Scanner;

public class Loop04GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userGuess = getUserGuess(scanner);
        int randomNumber = getRandomNumber();

        while (userGuess != randomNumber) {
            System.out.println("Guess = " + userGuess + ", Random = " + randomNumber);
            randomNumber = getRandomNumber();
            userGuess = getUserGuess(scanner);
        }
    }

    private static int getUserGuess(Scanner scanner) {
        System.out.println("Please enter your guess:");
        int userGuess = scanner.nextInt();
        return userGuess;
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }
}
