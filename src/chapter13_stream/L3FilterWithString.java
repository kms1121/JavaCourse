package chapter13_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L3FilterWithString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Mg Mg Khant",
                "Aung Aung ",
                "CodeWall Technologies",
                " Mg Mg ",
                " Ko Ko ",
                "Khant Hpone Lwin",
                "Khant Khant",
                " Kyaw "
        );

        List<String> result = list.stream()
                .map(String::trim)
                .filter(s -> s.length() >= 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
