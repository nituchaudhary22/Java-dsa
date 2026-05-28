<<<<<<< HEAD
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
            System.out.println("Correct Number");
        }
    }
     public static void playGame() {

        Scanner sc = new Scanner(System.in);

        int num = 50;
        int guess;

        do {
            System.out.println("Enter number between 1 to 100: ");
            guess = sc.nextInt();

            Guess(num, guess);

        } while (guess != num);

        sc.close();
    }
     public static void main(String[] args) {

        playGame();
    }
    }

=======
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

>>>>>>> 6e1f7accc33d58f695467def97fa7b6c2348fc45
