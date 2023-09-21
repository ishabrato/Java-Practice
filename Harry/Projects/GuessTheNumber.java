import java.util.Scanner;

import java.lang.Math;

class GuessTheNumber {
    public static void main(String[] args) {
        String RESET = "\u001b[0m";
        String RED = "\u001b[31m";
        String GREEN = "\u001b[32m";
        String YELLOW = "\u001b[33m";
        String CYAN = "\u001b[36m";

        int answer = (int) (Math.random() * 100) + 1;

        int k = 5;

        Scanner input = new Scanner(System.in);

        boolean correct = false;
        System.out.println("I'm thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
        while (k > 0) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            

            if (guess == answer) {
                System.out.println(GREEN+"You guessed the number!\nYou win!"+RESET);
                correct = true;
                break;
            }

            else if (guess > answer) {
                System.out.println(YELLOW+"Your guess is too high.\nYou have " + (k - 1) + " tries left."+RESET);
                k--;
            }

            else {
                System.out.println(YELLOW+"Your guess is too low.\nYou have " + (k - 1) + " tries left."+RESET);
                k--;
            }

            
        }

        if (correct == false) {
            System.out.println(RED+"You ran out of tries.\nYou lose!"+ RESET);
        }
    }
}
