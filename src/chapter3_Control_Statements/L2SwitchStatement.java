package chapter3_Control_Statements;

import java.lang.classfile.instruction.SwitchCase;

public class L2SwitchStatement {
    static void main(String[] args) {

//        String day = "Tue";
//        switch (day) {
//            case "Mon" :
//                System.out.println("Today is Monday");
//                break;
//            case "Tue" :
//                System.out.println("Today is Tuesday");
//                break;
//            case "Wed" :
//                System.out.println("Today is Wednesday");
//                break;
//            case "Thur" :
//                System.out.println("Today is Thursday");
//                break;
//            case "Fri" :
//                System.out.println("Today is Friday");
//                break;
//            case "Sat" :
//                System.out.println("Today is Saturday");
//                break;
//            case "Sun" :
//                System.out.println("Today is Sunday");
//                break;
//
//            default:
//                System.out.println("Something Wrong");
//        }

//        Combine Switch and if statement below

        String food = "Pizza";
        int quantity = 3;
        double price = 10.0;

        switch (food) {
            case "Pizza":
                if (quantity != 1) {
                    double totalAmount = price * quantity;
                    System.out.println("You ordered " + quantity + food);
                    System.out.println("Total Amount $" + totalAmount);
                    if (quantity >= 3) {
                        double total = quantity % 2;
                        double DisTotal = total * price;
                        System.out.println("Your total payment is $" + DisTotal);
                        System.out.println("Currently We have 2% off discount for your above 3 items");
                    }
                } else {
                    double singlefood = price * quantity;
                    System.out.println("Your ordered " + quantity + food);
                    System.out.println("Total is $" + singlefood);
                }
                break;

            case "coffee":
                if (quantity >= 1){
                    double totalAmount = price * quantity;
                    System.out.println("You ordered " + quantity + food);
                    System.out.println("Total Amount $" + totalAmount);
                    if (quantity == 1){
                        System.out.println("Thanks, enjoy your food dude");
                    } else if (quantity > 2) {
                        System.out.println("Currently We have discount for your above 2 items");
                    }
                }else {
                    System.out.println("What would you like to order? Mate");
                }
                break;

            default:{
                System.out.println("Something wrong");
            }
        }
    }
}
