// Define a parent class with one function. Define child class with the function having 
// same name as of parent class function, but having different argument.

package Day_4;
// Parent class
//Parent class
class Parent {
 // Method in the parent class
 public void display() {
     System.out.println("Display method in Parent class");
 }
}

//Child class
class Child extends Parent {
 // Overloaded method in the child class with an integer parameter
 public void display(int number) {
     System.out.println("Display method in Child class with number: " + number);
 }

 // Overloaded method in the child class with a string parameter
 public void display(String message) {
     System.out.println("Display method in Child class with message: " + message);
 }
}

//Class with main function
public class MethodOverloading {
 public static void main(String[] args) {
     // Create an instance of the Child class
     Child child = new Child();

     // Call the display method from the Parent class
     child.display(); // Output: Display method in Parent class

     // Call the overloaded display method with an integer argument
     child.display(10); // Output: Display method in Child class with number: 10

     // Call the overloaded display method with a string argument
     child.display("Hello"); // Output: Display method in Child class with message: Hello
 }
}