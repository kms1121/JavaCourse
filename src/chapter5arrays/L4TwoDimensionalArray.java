package chapter5arrays;

import java.util.Arrays;

public class L4TwoDimensionalArray {
    static void main(String[] args) {
        int[] OneDimensional = {10, 20, 30 , 40, 50};

        int[][] twoDimensional = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(OneDimensional[2]);
        System.out.println(twoDimensional[2][3]);

        // This is manually type
        int totalRoom = twoDimensional[0].length + twoDimensional[1].length + twoDimensional[2].length + twoDimensional[3].length;
        System.out.println("Total Room is =>  " + totalRoom);

        // This is using for Loop
        var total = 0;
        for (int[] one : twoDimensional) {
            total += one.length;
        }
        System.out.println("Total children room of two dimensional =>  " + total);

        OneDimensional[4] = 200;
        OneDimensional[3] = OneDimensional[3] * OneDimensional[4];

        System.out.println(Arrays.toString(OneDimensional));

        twoDimensional[3][1] = 2000;
        twoDimensional[3][2] = twoDimensional[3][2] * twoDimensional[3][3];

        System.out.println(Arrays.deepToString(twoDimensional));
        // This is way to output of TwoDimensional Arrays by using deepToString

        System.out.println("============================");
//        Second Way to Create Two Dimensional Arrays

        int[][] number = new int[4][];
        int[][] amount = new int[4][5];

        System.out.println("number arrays =>  " + Arrays.deepToString(number));
        System.out.println("amount arrays =>  " + Arrays.deepToString(amount));

        System.out.println("========================");

        number[0] = new int[2];
        number[1] = new int[4];
        number[2] = new int[6];
        number[3] = new int[3];

        System.out.println("number arrays =>  " + Arrays.deepToString(number));

        number[0][0] = 3;
        number[0][1] = 300;
        number[1][0] = 2;
        number[1][1] = 20;
        number[1][2] = 200;

        System.out.println("number arrays => " + Arrays.deepToString(number));

    }
}
