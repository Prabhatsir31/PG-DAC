/*
define interface "Fourth" with "default void disp3()" method.
define a class "Base1" with "public void disp3()" method,
now derive a class Sub1 from "Base1" and "Fourth". Sub1 class should have only "public void myfun()" method.
inside main create an object of "Sub1" and invoke "disp3".
once you get the result, also try to invoke "disp3" of "Fourth"
*/
package DefaultInterface;

interface Fourth {
	default void disp3() {
		System.out.println("Default method disp3 from Fourth interface");
	}
}

class Base1 {
	public void disp3() {
		System.out.println("Public method disp3 from Base1 method");
	}
}

class Sub1 extends Base1 implements Fourth {
    public void myfun() {
        System.out.println("Method myfun from Sub1 class");
    }
}

public class Ques3 {
	public static void main(String args[]) {
		Sub1 sub1 = new Sub1();
		sub1.disp3();
		sub1.myfun();
		
		Fourth fourth = sub1;
		fourth.disp3();
	}
}
