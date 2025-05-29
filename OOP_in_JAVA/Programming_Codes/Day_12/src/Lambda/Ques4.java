/*
define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
define a class "CalcDemo" with main method.
inside main using lambda create an implementation of "Calculator" , invoke "multiply()" 
method and display its result.

*/
package Lambda;

@FunctionalInterface
interface Calculator {
    int multiply(int a, int b);
}

public class Ques4 {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a * b; // Lambda expression for multiply
        int result = calculator.multiply(5, 10); // Invoke multiply method
        System.out.println("Result of multiplication: " + result);
    }
}