/*
write a program to display the method names inside the class which is passed as a command 
line argument.
*/
package Revision;

import java.lang.reflect.Method;

public class Ques6 {
    public static void main(String[] args) {
        // Check if a class name is provided
        if (args.length == 0) {
            System.out.println("Please provide a class name as a command line argument.");
            return;
        }

        try {
            // Load the class using the provided class name
            Class<?> cls = Class.forName(args[0]);

            // Get all declared methods of the class
            Method[] methods = cls.getDeclaredMethods();

            // Display the method names
            System.out.println("Methods of class " + cls.getName() + ":");
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + args[0]);
        }
    }
}