package chapter5arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L1OneDimensionalArray {
    static void main(String[] args) {
        String name = "Aung Aung";
        int age = 21;

        String[] subjects ={"NSC", "Web", "Mobile", "Eng", "AI"};
        int[] marks = {60, 77, 80, 75, 90};

        System.out.println(name);
        System.out.println(age);

        System.out.print(subjects + " => ");
        System.out.println(Arrays.toString(subjects));

        System.out.print(marks+ " => ");
        System.out.println(Arrays.toString(marks));

        System.out.println(subjects[2]);
        System.out.println(subjects.length);
        System.out.println(marks[subjects.length-1]);

        System.out.println("=============================");

        // datatype array-name = new datatype array-size;  <This is note>

//        int userInput = new Scanner(System.in).nextInt();
        int[] debts = new int[9]; // able to use usernameInput in array
        double[] amount = new double[10];
        String[] roles = new String[6];


        System.out.println(Arrays.toString(debts));
        System.out.println(Arrays.toString(amount));
        System.out.println(Arrays.toString(roles));


        amount[0] = 3.0;
        amount[1] = amount[0] + 3;

        roles[0] = "Admin";
        roles[1] = "Developer";

        System.out.println(Arrays.toString(amount));
        System.out.println(Arrays.toString(roles));




    }
}
