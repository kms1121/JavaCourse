package chapter3_Control_Statements;

public class L1IfStatement {
    static void main(String[] args) {
        int mark = 79;
        if (80 <= mark) {
            System.out.println("A");
        } else if (80 > mark && 60 <= mark) {
            System.out.println("B");
        } else if (60 > mark && 40 < mark) {
            System.out.println("C");
        } else if (40 > mark) {
            System.out.println("D");
        }else {
            System.out.println("Something went wrong");
        }
    }
}

// ခြေနေတခုထက်ပိုစစ်ချင်ရင်သုံးလို့ရတယ် (if_else)
