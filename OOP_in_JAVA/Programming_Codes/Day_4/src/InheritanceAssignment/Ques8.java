// 8) Define a class "base1" with only parameterized constructor.
// Derive a class "sub1" from "base1". This class should have following constructors
//	a) Default
//	b) one parameter
//	c) two parameter
// Now try to instantiate "sub1" , using any of the above mentioned constructors.

package InheritanceAssignment;

//Base class
class base1 {
 // Parameterized constructor
 public base1(int value) {
     System.out.println("Base1 constructor called with value: " + value);
 }
}

//Derived class
class sub1 extends base1 {
 // Default constructor
 public sub1() {
     // Call the parameterized constructor of base1 with a default value
     super(0); // You can choose any default value
     System.out.println("Sub1 default constructor called");
 }

 // One-parameter constructor
 public sub1(int value) {
     // Call the parameterized constructor of base1
     super(value);
     System.out.println("Sub1 one-parameter constructor called with value: " + value);
 }

 // Two-parameter constructor
 public sub1(int value1, int value2) {
     // Call the parameterized constructor of base1
     super(value1);
     System.out.println("Sub1 two-parameter constructor called with values: " + value1 + " and " + value2);
 }
}

//Class with main function
public class Ques8 {
 public static void main(String[] args) {
     // Instantiate sub1 using the default constructor
     sub1 obj1 = new sub1(); // Calls default constructor

     // Instantiate sub1 using the one-parameter constructor
     sub1 obj2 = new sub1(10); // Calls one-parameter constructor

     // Instantiate sub1 using the two-parameter constructor
     sub1 obj3 = new sub1(20, 30); // Calls two-parameter constructor
 }
}
