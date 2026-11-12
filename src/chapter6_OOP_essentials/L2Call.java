package chapter6_OOP_essentials;

public class L2Call {
    static void main(String[] args) {
        L1Variables obj = new L1Variables();
        System.out.println(obj.instanceVar); // use obj name . (obj) to use instance Variable

        System.out.println(L1Variables.staticVar); // use class name . (L1Variables) to use static variable
    }
}
