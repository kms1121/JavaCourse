package chapter6_OOP_essentials;

public class L1Variables {

    // static var
    static int staticVar = 1;

    static {
        var a = 1;
        a = 2;
        System.out.println(a);
    }

    //instance var , no static
    int instanceVar = 2;
    {
        var a = 1;
        a = 2;
        System.out.println(a);
    }

    static void main() {
        var a = 1;
        a = 2;
        System.out.println(a);

        L1Variables obj = new L1Variables();
        System.out.println(obj.instanceVar); // You have to build obj to use instance variables

        System.out.println(L1Variables.staticVar); // Just write like this to use static variables
    }

    // 2 types of global variable ( instance & static variables)

}
