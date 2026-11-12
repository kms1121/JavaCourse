package chapter5arrays;

import java.util.Arrays;

public class L5LoopingTwoDimensionalArrays {
    static void main(String[] args) {
        int[] OneDimensional = {10, 20, 30 , 40, 50};

        int[][] twoDimensional = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < OneDimensional.length; i++) {
            OneDimensional[i] = OneDimensional[i] * 10;
        }
        System.out.println(Arrays.toString(OneDimensional));

        for (int i : OneDimensional) {
            System.out.println(i + "");
        }
        System.out.println();
        

        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional.length; j++) {
                twoDimensional[i][j] = twoDimensional[i][j] * 10;
            }
        }
        System.out.println(Arrays.deepToString(twoDimensional));

        for (int[] innerArray : twoDimensional) {
            for (int numbers : innerArray) {
                System.out.print(numbers + "");
            }
            System.out.println();
        }
    }
}
