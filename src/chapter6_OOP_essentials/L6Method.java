package chapter6_OOP_essentials;

public class L6Method {

//    What is the method?
//     Method vs function

//    file system
//    pre defined method
//    user defined method

//    OOP concept
//    static method
//    instance method

//    Return
//    has return, not return


//    static method
    static void show(){
        System.out.println("Welcome to Myanmar");
    }

    static String returnName (){
        System.out.println("Codewall");
        return "Sartar";
    }

    static int returnInt (){
        int a = 1;
        int b = 2;
        return a + b;
    }

    static boolean returnBoolean(){
        return false;
    }

    static char workAndThenReturn(){
        char ch = 45+ 56;
        System.out.println("This method is working with two method");
        return ch;
    }

    static void main(String[] args) {
        L6Method.show();
        L6Method.workAndThenReturn();
        new L6Method().display();

        var name = returnName();
        var number = returnInt();
        var bo = returnBoolean();

        new L6Method().name();
        new L6Method().Kyi();
        new L6Method().min();

        L6Method.nam();
    }

//    instance method
    void display(){
        System.out.println("This is display method");
    }

    void name(){
        System.out.println("This is name");
    }
    void Kyi(){
        System.out.println("This is Kyi Min");
    }

    void min(){
        System.out.println("MIN");
    }

    static void nam(){
        System.out.println("My name");
    }

}
