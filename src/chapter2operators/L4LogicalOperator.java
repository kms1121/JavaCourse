package chapter2operators;

//LogicalOperator
//Logical AND => &&
//Logical OR => ||

public class L4LogicalOperator {
    static void main(String[] args) {

        boolean result1 = 4 > 3 && 1 < 2 && 4 > 2;
        System.out.println(result1);

        boolean result2 = 4 < 3 || 1 > 2 || 6 > 4;
        System.out.println(result2);

        var result3 = 6 < 7 && 9 != 4+4;
        System.out.println(result3 + " This is result3");

    }
}
