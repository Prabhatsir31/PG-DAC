/*
define a functional interface "Third" with an abstract method "void show(int num)".
define a class "Sample" with a method "void disp(int num)"
inside main function create a method reference for "Third" and invoke "disp" of "Sample" 
by passing a value "500".

*/
package MethodPackage;

@FunctionalInterface
interface Third {
    void show(int num);
}

class Sample {
    void disp(int num) {
        System.out.println("Value: " + num);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Sample sample = new Sample();
        Third third = sample::disp;
        third.show(500);
    }
}