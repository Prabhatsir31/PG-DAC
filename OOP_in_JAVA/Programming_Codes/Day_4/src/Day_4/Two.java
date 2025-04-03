
// 1)	Define 2 classes “First” and “Second” with member variables , member functions and 
// constructors of  your choice. Now define a class “Two” in which define main function . 
// In main function create various instances of First and Second  and call their individual member functions.
package Day_4;

// Class First
class First {
    private String name;
    private int value;

    // Constructor
    public First(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Member function to display details
    public void display() {
        System.out.println("Name: " + name + ", Value: " + value);
    }

    // Member function to increment value
    public void incrementValue() {
        value++;
        System.out.println("Value incremented in First Class: " + value);
    }
}

// Class Second
class Second {
    private String description;
    private double amount;

    // Constructor
    public Second(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Member function to display details
    public void display() {
        System.out.println("Description: " + description + ", Amount: " + amount);
    }

    // Member function to double the amount
    public void doubleAmount() {
        amount *= 2;
        System.out.println("Amount doubled in Second Class: " + amount);
    }
}

// Class Two with main function
public class Two {
    public static void main(String[] args) {
        // Create instances of First
        First first1 = new First("John", 10);
        First first2 = new First("Honey", 20);
        
        // Calling member functions of First
        first1.display();
        first1.incrementValue();
        first2.display();
        first2.incrementValue();

        // Creating instances of Second
        Second second1 = new Second("Car", 1000.50);
        Second second2 = new Second("Bike", 500.25);
        
        // Calling member functions of Second
        second1.display();
        second1.doubleAmount();
        second2.display();
        second2.doubleAmount();
    }
}