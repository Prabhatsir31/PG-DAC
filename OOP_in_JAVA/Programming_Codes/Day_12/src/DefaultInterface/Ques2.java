/*
define interface "Third" with "default void dis1()" and "static void disp2()" methods.
derive a class "Sub" from "Third" ( do not override "disp1")
inside main function invoke "disp1" and "disp2" methods.
*/
package DefaultInterface;

interface Third {
	default void dis1() {
		System.out.println("DEfault method dis1 from Third interface");
	}
	
	static void disp2() {
		System.out.println("DEfault method disp2 from Third interface");
	}
}

class Su implements Third {
	
}

public class Ques2 {
	public static void main(String args[]) {
		Su sub = new Su();
		sub.dis1();
		Third.disp2();
	}
}
