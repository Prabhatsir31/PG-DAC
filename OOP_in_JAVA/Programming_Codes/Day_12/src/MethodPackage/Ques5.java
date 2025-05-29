/*
define a functional interface "Emp" with an abstract method "void show()".
define a class "MyClass" with default constructor with the message "inside default constructor of MyClass".
inside main function instantiate "MyClass" using method reference to "Emp"

*/
package MethodPackage;

@FunctionalInterface
interface Emp {
    void show();
}

class MyClass {
    MyClass() {
        System.out.println("Inside default constructor of MyClass");
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Emp emp = MyClass::new;
        emp.show();
    }
}