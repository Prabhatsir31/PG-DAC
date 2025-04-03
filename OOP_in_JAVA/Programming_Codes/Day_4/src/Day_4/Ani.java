package Day_4;

// Base class (superclass)
class Hie {
    // Member variable
    String name;

    // Constructor of the superclass
    public Hie(String name) {
        this.name = name;
        System.out.println("Animal constructor called. Name: " + name);
    }

    // Method to display animal sound
    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}

// Derived class (subclass of Hie)
class Dog extends Hie {
    // Constructor of the subclass
    public Dog(String name) {
        // Call the constructor of the superclass
        super(name); // Invoking the Hie constructor
        System.out.println("Dog constructor called. Name: " + name);
    }

    // Method to display dog sound
    public void sound() {
        System.out.println(name + " barks.");
    }
}

// Another derived class (subclass of Hie)
class Cat extends Hie {
    // Constructor of the subclass
    public Cat(String name) {
        // Call the constructor of the superclass
        super(name); // Invoking the Hie constructor
        System.out.println("Cat constructor called. Name: " + name);
    }

    // Method to display cat sound
    public void sound() {
        System.out.println(name + " meows.");
    }
}

// Class with main function
public class Ani {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Call the sound method for both animals
        dog.sound(); // Output: Buddy barks.
        cat.sound(); // Output: Whiskers meows.
    }
}