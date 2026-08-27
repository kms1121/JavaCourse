package chapter4game_project;

import java.util.Scanner;

public class L2RepeatInput {
    static void main(String[] args) {
        int code = 12345;
        var scanner = new Scanner(System.in);

        System.out.print("Enter your pin code: ");

        while (true){

            var userCode = scanner.nextInt();

            if (userCode == code){
                System.out.println("Success");
                break;
            }else {
                System.out.println("Wrong Pin");
                System.out.print("Try again: ");
            }
        }

        System.out.println("Next: ");
    }
}
