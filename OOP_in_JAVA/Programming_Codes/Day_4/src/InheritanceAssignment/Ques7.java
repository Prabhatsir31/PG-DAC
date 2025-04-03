// 7) Define class "Parent1" with some data.
// Define interface "Parent2" with some methods.
// Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.

package InheritanceAssignment;

//Parent class
class Parent1 {
 // Some data in Parent1
 protected String name;

 // Constructor
 public Parent1(String name) {
     this.name = name;
 }

 // Method to display name
 public void display() {
     System.out.println("Name: " + name);
 }
}

//Interface Parent2
interface Parent2 {
 void method1(); // Method declaration
 void method2(); // Another method declaration
}

//Child class extending Parent1 and implementing Parent2
class Child extends Parent1 implements Parent2 {
 // Constructor for Child
 public Child(String name) {
     super(name); // Call the constructor of Parent1
 }

 // Implementing method1 from Parent2
 @Override
 public void method1() {
     System.out.println("Method1 from Parent2 implemented in Child");
 }

 // Implementing method2 from Parent2
 @Override
 public void method2() {
     System.out.println("Method2 from Parent2 implemented in Child");
 }
}

//Class with main function
public class Ques7 {
 public static void main(String[] args) {
     // Instantiate Child class
     Child child = new Child("John Doe");

     // Call members from Parent1
     child.display(); // Output: Name: John Doe

     // Call methods from Parent2
     child.method1(); // Output: Method1 from Parent2 implemented in Child
     child.method2(); // Output: Method2 from Parent2 implemented in Child
 }
}
