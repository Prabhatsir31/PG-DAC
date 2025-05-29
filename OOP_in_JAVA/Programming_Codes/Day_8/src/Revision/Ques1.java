/*
Define a class “MyClass”. Define a class “Everything” and define a member function with variable 
no. of argument inside it. Define  a class Demo1  and define main function in it. From main function , 
call the function of class Everything and make sure you can pass any arguments , it will take and display. 
It should even take instance of “MyClass” and display.
 
*/
package Revision;

class MyClass {
 private String name;

 public MyClass(String name) {
     this.name = name;
 }

 @Override
 public String toString() {
     return "MyClass{name='" + name + "'}";
 }
}

class Everything {
 // Method to accept a variable number of arguments
 public void display(Object... args) {
     for (Object arg : args) {
         System.out.println(arg); // Display each argument
     }
 }
}

public class Ques1 {
 public static void main(String[] args) {
     Everything everything = new Everything();

     // Call the display method with different types of arguments
     everything.display(1, 2, 3.5, "Hello", new MyClass("Instance of MyClass"));

     // You can also pass an array of arguments
     MyClass myClassInstance = new MyClass("Another Instance");
     everything.display(42, "World", myClassInstance);
 }
}