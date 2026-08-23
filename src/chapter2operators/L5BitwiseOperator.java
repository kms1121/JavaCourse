package chapter2operators;

public class L5BitwiseOperator {
    static void main(String[] args) {
        var result1 = true | false;
        System.out.println(result1);

        boolean result2 = true & false;
        System.out.println(result2);

        boolean result3 = false ^ false;
        System.out.println(result3);

        var result = 5 | 3;
        System.out.println(result);
    }
}
