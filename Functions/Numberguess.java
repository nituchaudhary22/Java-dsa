package Functions;

import java.util.Scanner;

public class Numberguess {
    public static void Guess(int num,int guess){
        if (guess > num) {
            System.out.println("Too high");
        }
        else if (guess < num) {
            System.out.println("Too low");
        }
        else {
            System.out.println("Correct Number!");
        }
    }
     public static void playGame() {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 50;
        int guess;

        do {
            System.out.println("Enter number between 1 to 100: ");
            guess = sc.nextInt();

            Guess(secretNumber, guess);

        } while (guess != secretNumber);

        sc.close();
    }
     public static void main(String[] args) {

        playGame();
    }
    }

