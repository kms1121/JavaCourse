package chapter4game_project;

import java.util.Random;

public class L3Random {
    static void main(String[] args) {
        var number = new Random() .nextInt(1,9);
        System.out.println(number);
    }
}
