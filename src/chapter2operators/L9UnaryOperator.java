package chapter2operators;

public class L9UnaryOperator {
    static void main(String[] args) {

        //initialize
        int wallet;

        //reassign / update
        wallet = 10000;

        wallet = wallet + 1000;
        wallet += 1000;

//        wallet += 1;
        ++wallet;

        int a = 5;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(wallet);
    }
}

// ++a prefix
// --a prefix

// a++ postfix
// a-- postfix
