package chapter3_Control_Statements;

public class L0Intro {
    static void main(String[] args) {
        boolean goodhealth = true;
        if (goodhealth) {
            System.out.println("I'll go to school today.");
        } else {
            System.out.println("I won't go to school");
        }

        int timer = 7;
        if (timer == 7){
            System.out.println("Alarm alert");
        } else {
            System.out.println("silence");
        }

        String day = "Sunday";
        if (day.equals("Sat") || day.equals("Sunday")){
            System.out.println("Java SE class is 8:30 PM");
        } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")) {
            System.out.println("SBU is calling YOU");
        } else {
            System.out.println("Your day");
        }
    }
}

//Do I need to make a decision?
//        │
//        └── YES → if / else
//        │
//        └── Is it one value with many specific options?
//        │
//        └── YES → switch
//
//
//Do I need to repeat something?
//        │
//        ├── YES
//        │
//                ├── Do I know how many times?
//        │       │
//        │       └── YES → for loop
//        │
//                └── Don't know / depends on condition?
//        │
//        ├── Check before running → while
//        │
//        └── Must run at least once → do-while
