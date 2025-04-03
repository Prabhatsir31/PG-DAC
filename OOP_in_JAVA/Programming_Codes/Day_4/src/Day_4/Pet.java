// 5)	Show the example of multi-level inheritance with constructor invocation.

package Day_4;
// Base class (superclass)
public class Animal {
    // Member variable
    String name;

    // Constructor of the superclass
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called. Name: " + name);
    }

    // Method to display animal sound
    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}

// Intermediate class (subclass of Animal)
class Mammal extends Animal {
    // Constructor of the subclass
    public Mammal(String name) {
        // Call the constructor of the superclass
        super(name); // Invoking the Animal constructor
        System.out.println("Mammal constructor called. Name: " + name);
    }

    // Method to display mammal characteristics
    public void characteristics() {
        System.out.println(name + " is a mammal.");
    }
}

// Derived class (subclass of Mammal)
class Dog extends Mammal {
    // Constructor of the subclass
    public Dog(String name) {
        // Call the constructor of the superclass
        super(name); // Invoking the Mammal constructor
        System.out.println("Dog constructor called. Name: " + name);
    }

    // Method to display dog sound
    public void sound() {
        System.out.println(name + " barks.");
    }
}

// Class with main function
public class Pet {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog("Buddy");

        // Call the sound method
        dog.sound(); // Output: Buddy barks.
        dog.characteristics(); // Output: Buddy is a mammal.
    }
}