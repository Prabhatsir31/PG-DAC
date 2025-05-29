// 1) Create a multi-level inheritance , instantiate the child class and observe constructor
// invocation.Also show, if needed how will u invoke parent class constructor from child class ?

package InheritanceAssignment;

//Base class (superclass)
class Animal {
 // Constructor of the superclass
 public Animal() {
     System.out.println("Animal constructor called");
 }

 // Method to display animal sound
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Intermediate class (subclass of Animal)
class Mammal extends Animal {
 // Constructor of the subclass
 public Mammal() {
     // Call the constructor of the superclass
     super(); // Invoking the Animal constructor
     System.out.println("Mammal constructor called");
 }

 // Method to display mammal characteristics
 public void characteristics() {
     System.out.println("Mammal is warm-blooded");
 }
}

//Derived class (subclass of Mammal)
class Dog extends Mammal {
 // Constructor of the subclass
 public Dog() {
     // Call the constructor of the superclass
     super(); // Invoking the Mammal constructor
     System.out.println("Dog constructor called");
 }

 // Method to display dog sound
 public void sound() {
     System.out.println("Dog barks");
 }
}

//Class with main function
public class Ques1 {
 public static void main(String[] args) {
     // Create an instance of Dog
     Dog dog = new Dog();

     // Call the sound method
     dog.sound(); // Output: Dog barks
     dog.characteristics(); // Output: Mammal is warm-blooded
 }
}
