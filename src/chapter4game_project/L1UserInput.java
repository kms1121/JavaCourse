package chapter4game_project;

import java.util.Scanner;

public class L1UserInput {
    static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter your name :");
        var username = scanner.nextLine();
        System.out.println(username);

        System.out.print("Enter your age :");
        var age = scanner.nextInt();
        System.out.println(age);
    }
}
