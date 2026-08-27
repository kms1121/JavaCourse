package chapter3_Control_Statements;

import java.util.Random;

public class L7BreakAndContinue {
    static void main(String[] args) {
//        int a = 0;
//        while (a < 50){
//
//            a += new Random().nextInt(1,3);
//            System.out.println(a);
//            if(a == 30)break;
//        }


//        int b = 0;
//        while (true){
//            System.out.println(b);
//            b++;
//            if (b == 10)break;
//        }

        int c = 0;
        while (c < 20){
            c++;
            if (c == 6 || c == 8 || c == 11) continue; // (Skipped number cuz of continue)
            System.out.println(c);

        }


    }
}
