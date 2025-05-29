
// 4) Define a class "DemoOb". 
// create an instance of it.
// now create a reference and assign the reference created in the above statement.
//	Discuss what happens?
// Now since u have 2 references, take one of the reference and assign a new instance of the class.
// 	Discuss what happens?
// (For ur discussion, write necessary comments in the program)


// Define the class DemoOb
class DemoOb {
    int value;

    // Constructor to initialize the value
    DemoOb(int value) {
        this.value = value;
    }

    // Method to display the value
    void display() {
        System.out.println("Value: " + value);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        // Step 1: Create an instance of DemoOb
        DemoOb obj1 = new DemoOb(10); 
        System.out.println("Initial object created:");
        obj1.display(); // Display the value of obj1

        // Step 2: Create a reference and assign the reference created above
        DemoOb obj2 = obj1; // obj2 now references the same object as obj1
        System.out.println("Reference obj2 assigned to obj1:");
        obj2.display(); // Display the value of obj2

        // Step 3: Modify the value using obj2
        obj2.value = 20; // Changing the value through obj2
        System.out.println("After modifying obj2:");
        obj1.display(); // Display the value of obj1 (should reflect the change)
        obj2.display(); // Display the value of obj2 (should reflect the change)

        // Step 4: Assign a new instance to one of the references
        obj2 = new DemoOb(30); // obj2 now references a new instance
        System.out.println("obj2 assigned a new instance:");
        obj1.display(); // Display the value of obj1 (should remain unchanged)
        obj2.display(); // Display the value of the new obj2
    }
}