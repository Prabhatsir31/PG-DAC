// 3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

package InheritanceAssignment;

//Parent class
class Ani {
 // Constructor of the superclass
 public Ani() {
     System.out.println("Animal constructor called");
 }

 // Method to display animal sound
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class Dog
class Dogs extends Ani {
 // Constructor of the subclass
 public Dogs() {
     // Call the constructor of the superclass
     super(); // Invoking the Animal constructor
     System.out.println("Dog constructor called");
 }

 // Method to display dog sound
 public void sound() {
     System.out.println("Dog barks");
 }
}

//Child class Cat
class Cat extends Ani {
 // Constructor of the subclass
 public Cat() {
     // Call the constructor of the superclass
     super(); // Invoking the Animal constructor
     System.out.println("Cat constructor called");
 }

 // Method to display cat sound
 public void sound() {
     System.out.println("Cat meows");
 }
}

//Class with main function
public class Ques3 {
 public static void main(String[] args) {
     // Create an instance of Dog
     Dogs dog = new Dogs();
     dog.sound(); // Output: Dog barks

     // Create an instance of Cat
     Cat cat = new Cat();
     cat.sound(); // Output: Cat meows
 }
}