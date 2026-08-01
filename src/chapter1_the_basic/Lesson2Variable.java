package chapter1_the_basic;

import java.util.ArrayList;

public class Lesson2Variable {
    static void main(String[] args) {
        String countryName ="Thailand";

        System.out.println("I live " + countryName);
        System.out.println("I live " + countryName);
        System.out.println("I live " + countryName);
        System.out.println("I live " + countryName);
        System.out.println("I live " + countryName);

        countryName = "Germany";

        System.out.println("I live " + countryName);
        System.out.println("I live " + countryName);
        System.out.println("I live " + countryName);
        System.out.println("I live " + countryName);

        System.out.println("=====================");

        // Variable Initialization

        // Variable declaration // declare
        int count ;

        //Assign
        count = 34;
        System.out.println(count);

        //Java is a static programming language
        int a = 4;

        // a = "4";
        System.out.println(a);
        System.out.println("===========");

        //Type inference
        var b = "Test";
        var c =  3;
        var d = 4.0;

        var list = new ArrayList<Integer>();
        list.add(3);

    }
}
