// 4)	Show the example of single level inheritance with constructor invocation.


package Day_4;
// Base class (superclass)
class Animal {
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

// Derived class (subclass)
class Dog extends Animal {
    // Constructor of the subclass
    public Dog(String name) {
        // Call the constructor of the superclass
        super(name); // Invoking the superclass constructor
        System.out.println("Dog constructor called. Name: " + name);
    }

    // Method to display dog sound
    public void sound() {
        System.out.println(name + " barks.");
    }
}

// Class with main function
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog("Buddy");

        // Call the sound method
        dog.sound(); // Output: Buddy barks.
    }
}