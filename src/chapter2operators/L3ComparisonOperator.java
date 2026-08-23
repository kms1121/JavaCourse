package chapter2operators;

public class L3ComparisonOperator {
    static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;

        var comparison1 = a > b;
        System.out.println(comparison1);

        boolean comparison2 = b >= c;
        System.out.println(comparison2);

        boolean comparison3 = a != b;
        System.out.println(comparison3);
    }
}
