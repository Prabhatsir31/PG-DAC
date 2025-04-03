// 4) Create a class "Top1" with "disp1()" method.
// From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
// Now show how will u achieve dynamic polymorphism. 

package InheritanceAssignment;

//Base class
class Top1 {
 // Method to be overridden
 public void disp1() {
     System.out.println("Display from Top1");
 }
}

//Derived class Bottom1
class Bottom1 extends Top1 {
 @Override
 public void disp1() {
     System.out.println("Display from Bottom1");
 }
}

//Derived class Bottom2
class Bottom2 extends Top1 {
 @Override
 public void disp1() {
     System.out.println("Display from Bottom2");
 }
}

//Derived class Bottom3
class Bottom3 extends Top1 {
 @Override
 public void disp1() {
     System.out.println("Display from Bottom3");
 }
}

//Class with main function
public class Ques4 {
 public static void main(String[] args) {
     // Create references of Top1 type
     Top1 obj1 = new Bottom1();
     Top1 obj2 = new Bottom2();
     Top1 obj3 = new Bottom3();

     // Call the disp1 method on each reference
     obj1.disp1(); // Output: Display from Bottom1
     obj2.disp1(); // Output: Display from Bottom2
     obj3.disp1(); // Output: Display from Bottom3
 }
}

