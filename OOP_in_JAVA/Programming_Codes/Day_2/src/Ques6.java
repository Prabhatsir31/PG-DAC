// 6) define static initializers in the above A,B and C classes and check the order of their execution.


// Class A
class A {
    // Static variable
    static int staticVarA = 10;

    // Static initializer
    static {
        System.out.println("Static Initializer in Class A");
        staticVarA += 5; // Modify static variable
    }

    // Non-static variable
    int nonStaticVarA;

    // Constructor
    A(int value) {
        this.nonStaticVarA = value;
    }

    // Static method
    static void staticMethodA() {
        System.out.println("Static Method in Class A: " + staticVarA);
    }

    // Non-static method
    void nonStaticMethodA() {
        System.out.println("Non-Static Method in Class A: " + nonStaticVarA);
    }
}

// Class B
class B {
    // Static variable
    static int staticVarB = 20;

    // Static initializer
    static {
        System.out.println("Static Initializer in Class B");
        staticVarB += 10; // Modify static variable
    }

    // Non-static variable
    int nonStaticVarB;

    // Constructor
    B(int value) {
        this.nonStaticVarB = value;
    }

    // Static method
    static void staticMethodB() {
        System.out.println("Static Method in Class B: " + staticVarB);
    }

    // Non-static method
    void nonStaticMethodB() {
        System.out.println("Non-Static Method in Class B: " + nonStaticVarB);
    }
}

// Class C
class C {
    // Static variable
    static int staticVarC = 30;

    // Static initializer
    static {
        System.out.println("Static Initializer in Class C");
        staticVarC += 15; // Modify static variable
    }

    // Non-static variable
    int nonStaticVarC;

    // Constructor
    C(int value) {
        this.nonStaticVarC = value;
    }

    // Static method
    static void staticMethodC() {
        System.out.println("Static Method in Class C: " + staticVarC);
    }

    // Non-static method
    void nonStaticMethodC() {
        System.out.println("Non-Static Method in Class C: " + nonStaticVarC);
    }
}

// Main class to demonstrate the functionality
public class Ques6 {
    public static void main(String[] args) {
        // Accessing static methods and variables
        A.staticMethodA(); // Calls static method from class A
        B.staticMethodB(); // Calls static method from class B
        C.staticMethodC(); // Calls static method from class C

        // Creating instances of classes A, B, and C
        A objA = new A(100); // Creates an instance of A with non-static value 100
        B objB = new B(200); // Creates an instance of B with non-static value 200
        C objC = new C(300); // Creates an instance of C with non-static value 300

        // Accessing non-static methods and variables
        objA.nonStaticMethodA(); // Calls non-static method from class A
        objB.nonStaticMethodB(); // Calls non-static method from class B
        objC.nonStaticMethodC(); // Calls non-static method from class C
    }
}

}
