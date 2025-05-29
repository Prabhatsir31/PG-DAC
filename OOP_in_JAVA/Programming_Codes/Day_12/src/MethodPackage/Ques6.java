/*
define a functional interface "Seventh" with an abstract method "void fun(int k)".
define a class "Sample" with parameterized constructor with the message "inside parameterized 
constructor of Sample\t"+k .
inside main function instantiate "Sample" by passing value "200" using method reference to "Seventh"

*/
package MethodPackage;

@FunctionalInterface
interface Seventh {
    void fun(int k);
}

class Sample1 {
    Sample1(int k) {
        System.out.println("Inside parameterized constructor of Sample: " + k);
    }
}

public class Ques6 {
    public static void main(String[] args) {
        Seventh seven = Sample1::new;
        seven.fun(200);
    }
}