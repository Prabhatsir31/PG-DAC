// 10)	Define an interface “Vechicle” with “start()” function . Now derive  classes like 
// “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” 
// function. Define a class “VDemo” in which  write  main()  function. In the main function 
// create a reference to Vehicle  class referring to any of the sub class. Using this reference, 
// call “start" method.

package Day_4;
// Interface Vehicle
interface Vehicle {
    void start(); // Abstract method
}

// Class TwoWheeler implementing Vehicle
class TwoWheeler implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting a Two-Wheeler");
    }
}

// Class ThreeWheeler implementing Vehicle
class ThreeWheeler implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting a Three-Wheeler");
    }
}

// Class FourWheeler implementing Vehicle
class FourWheeler implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting a Four-Wheeler");
    }
}

// Class with main function
public class VDemo {
    public static void main(String[] args) {
        // Create a reference of Vehicle type referring to TwoWheeler
        Vehicle vehicle1 = new TwoWheeler();
        vehicle1.start(); // Output: Starting a Two-Wheeler

        // Create a reference of Vehicle type referring to ThreeWheeler
        Vehicle vehicle2 = new ThreeWheeler();
        vehicle2.start(); // Output: Starting a Three-Wheeler

        // Create a reference of Vehicle type referring to FourWheeler
        Vehicle vehicle3 = new FourWheeler();
        vehicle3.start(); // Output: Starting a Four-Wheeler
    }
}