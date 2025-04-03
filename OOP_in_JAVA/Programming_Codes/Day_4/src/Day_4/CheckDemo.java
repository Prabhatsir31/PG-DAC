/* 3)	Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.  <default>, private ,public and protected.   Define a function “disp”  which should be public.  Define a class “CheckDemo” in which you will write “main()” function. Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.
*/

package Day_4;

// Class Check
class Check {
    // Default member variable (package-private)
    int defaultVar = 10;

    // Private member variable
    private int privateVar = 20;

    // Public member variable
    public int publicVar = 30;

    // Protected member variable
    protected int protectedVar = 40;

    // Public method to display values
    public void disp() {
        System.out.println("Inside disp() method:");
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
    }
}

// Class CheckDemo with main function
public class CheckDemo {
    public static void main(String[] args) {
        // Create an instance of Check
        Check check = new Check();

        // Accessing member variables directly
        System.out.println("Accessing member variables directly:");
        System.out.println("Default Variable: " + check.defaultVar); // Accessible
        System.out.println("Public Variable: " + check.publicVar);   // Accessible
        // System.out.println("Private Variable: " + check.privateVar); // Not accessible (will cause an error)
        // System.out.println("Protected Variable: " + check.protectedVar); // Not accessible (will cause an error)

        // Accessing member variables indirectly through the disp() method
        System.out.println("\nAccessing member variables indirectly through disp() method:");
        check.disp(); // This will display all variables
    }
}