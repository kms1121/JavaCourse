package chapter4game_project;

import java.util.Random;
import java.util.Scanner;

public class MindGame {
    static void main(String[] args) {
        System.out.println("Welcome to our Mind Game");

        Scanner scanner = new Scanner(System.in);
        int secretNumber = new Random().nextInt(1,100);

        int guessCount = 0;

        while (true){

            System.out.print("Enter guess number whatever you prefer: ");
            int userNumber = scanner.nextInt();
            guessCount++;

            if (userNumber > secretNumber){
                System.out.println("Input is greater than the correct number");
            } else if (userNumber == secretNumber) {
                System.out.println("Boom! You Won Dude");
                System.out.println("Times: " + guessCount);

                if (guessCount <= 4){
                    System.out.println("You're Genius");
                } else if (guessCount <=10) {
                    System.out.println("Good");
                } else if (guessCount <= 13) {
                    System.out.println("Not bad");
                }else {
                    System.out.println("Fucking stupid dude");
                }
                break;
            }else {
                System.out.println("Input is less than the correct number");
            }
        }


    }
}
