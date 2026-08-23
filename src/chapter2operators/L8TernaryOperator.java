package chapter2operators;

public class L8TernaryOperator {
    static void main(String[] args) {
        int b = 15;
        int c = 2;

        String result = (b > c) ? "B is Greater than C" : " C is Greater than B";
        int result2 = b > c ? b : c;
        boolean result3 = b > c;
        char result4 = b > c ? 'b' : 'c';

        var result5 = b > c ? 'b' : false;
        Object result6 = b > c ? 3 : 3.0;
        System.out.println(result);
    }
}
