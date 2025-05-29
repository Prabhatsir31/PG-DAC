-

// 6) Define interface "A" with "disp1()" method.
// Derive from "A", interface "B" with "disp2" method.
// Derive class "C" , from "B".
// Instantiate class "C" and call its members as well as derived from parent interfaces.

package InheritanceAssignment;

//Interface A
interface A {
 void disp1(); // Method in interface A
}

//Interface B derived from A
interface B extends A {
 void disp2(); // Method in interface B
}

//Class C implementing interface B
class C implements B {
 // Implementing disp1() from interface A
 @Override
 public void disp1() {
     System.out.println("Display from interface A (disp1)");
 }

 // Implementing disp2() from interface B
 @Override
 public void disp2() {
     System.out.println("Display from interface B (disp2)");
 }
}

//Class with main function
public class Ques6 {
 public static void main(String[] args) {
     // Instantiate class C
     C obj = new C();

     // Call methods from class C
     obj.disp1(); // Output: Display from interface A (disp1)
     obj.disp2(); // Output: Display from interface B (disp2)
 }
}
