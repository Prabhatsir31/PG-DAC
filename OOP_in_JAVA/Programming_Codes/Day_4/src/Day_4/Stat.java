

/* 2)	Create a class with static and non-static member variables. Define static and non-static member functions. Create instance of this class and call both static and non-static member functions.
*/
package Day_4;
import java.util.*;
import java.lang.*;

public class Stat {
    // Static member variable
    public static int staticVar = 10;
    
    // Non-static member variable
    public int nonStaticVar = 20;

    // Static member function
    public static void staticFunc() {
        System.out.println("Static function called");
        System.out.println("Static variable value: " + staticVar); // Accessing static variable
    }

    // Non-static member function
    public void nonStaticFunc() {
        System.out.println("Non-static function called");
        System.out.println("Non-static variable value: " + nonStaticVar); // Accessing non-static variable
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Stat obj = new Stat();
        
        // Call static member function
        staticFunc(); // Static function can be called without an instance
        
        // Call non-static member function
        obj.nonStaticFunc(); // Non-static function must be called on an instance
    }
}