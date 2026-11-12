package chapter6_OOP_essentials;

import java.util.Scanner;

public class L7ReturnIf {


//    static String validate(){
//        System.out.print("Enter your age: ");
//        int userInput = new Scanner(System.in).nextInt();
//        if (userInput < 18) return "can't";
//        return "can";
//    }

    static void validateWR(){
        System.out.print("Enter your age: ");
        int userInput = new Scanner(System.in).nextInt();
        if (userInput > 18 ){
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }
    }

    static void main(String[] args) {
        validateWR();
    }
}
