// 7)	Define a parent and a child class . Now explain function overriding with Example.

package Day_4;
// Parent class
class Over {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Doggy extends Over {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Class with main function
public class FunctionOverridingExample {
    public static void main(String[] args) {
        // Creating an object of the parent class
        Over myAnimal = new Over();
        myAnimal.sound(); // Output: Animal makes a sound

        // Creating an object of the child class
        Doggy myDog = new Doggy();
        myDog.sound(); // Output: Dog barks

        // Using a parent class reference to a child class object
        Over anotherAnimal = new Doggy();
        anotherAnimal.sound(); // Output: Dog barks
    }
}