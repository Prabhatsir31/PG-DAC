/*
define a functional interface "First" with an abstract method "void disp1()".
define a class "Second" with a method "void fun1()"
inside main function create a method reference for "First" and invoke "fun1" of "Second"

*/
package MethodPackage;

@FunctionalInterface
interface First {
    void disp1();
}

class Second {
    void fun1() {
        System.out.println("Method fun1 from Second class");
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Second second = new Second();
        First first = second::fun1;
        first.disp1();
    }
}
