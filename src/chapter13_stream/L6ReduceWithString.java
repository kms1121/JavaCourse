package chapter13_stream;

import java.util.*;

public class L6ReduceWithString {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");

        String result = stringList.stream()
                .reduce("String ->", (a, b) -> a + b);

        System.out.println(result);
    }
}
