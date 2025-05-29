/*
define interface "Base1" with "default void fun1()".
derive an interface "Sub1" from "Base1" with "default void fun2()"
derive a class "Sub2" from "Sub1". It should have only "public void fun3()" method.
inside main function, create an object of "Sub2" and make sure when u invoke "fun3", 
it should call "Sub1's fun2" which should call "Base1's fun1" method.
*/
package DefaultInterface;

interface base {
    default void fun1() {
        System.out.println("Default method fun1 from Base1 interface");
    }
}

interface sub1 extends base {
    default void fun2() {
        System.out.println("Default method fun2 from Sub1 interface");
        fun1(); 
    }
}

class sub2 implements sub1 {
    public void fun3() {
        System.out.println("Method fun3 from Sub2 class");
        fun2(); 
    }
}

public class Ques4 {
    public static void main(String[] args) {
        sub2 su = new sub2();
        su.fun3();
    }
}