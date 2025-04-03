// 2) Define a class "MyClass" and make sure clients can instantiate it , 
// a) without any argument
// b) with one int argument
// c) with two int arguments

class MyClass{

	MyClass() {
		System.out.println("Without Any Argument");
	}
	MyClass(int num) {
		System.out.println("With One Argument " + num);
	}
	MyClass(int x, int y) {
		System.out.println("With Two Argument " + x + ", " + y);
	}
}


public class Ques2 {
    public static void main(String[] args) {
        // Instantiate MyClass using different constructors
    	MyClass cons1 = new MyClass();          // Calls the constructor without arguments
        MyClass cons2 = new MyClass(10);        // Calls the constructor with one argument
    	MyClass cons3 = new MyClass(20, 30);    // Calls the constructor with two arguments
    }
}
