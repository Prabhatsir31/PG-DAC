// 2) create a class "Vehicle", define a method "public void start()" in it. From this class 
// derive a class FourWheeler. How will u override "start()" method of parent class ?

package InheritanceAssignment;

//Parent class
class Vehicle {
 // Method to be overridden
 public void start() {
     System.out.println("Vehicle is starting");
 }
}

//Derived class
class FourWheeler extends Vehicle {
 // Overriding the start method
 @Override
 public void start() {
     System.out.println("FourWheeler is starting");
 }
}

//Class with main function
public class Ques2 {
 public static void main(String[] args) {
     // Create an instance of FourWheeler
     FourWheeler myCar = new FourWheeler();
     
     // Call the overridden start method
     myCar.start(); // Output: FourWheeler is starting
 }
}
