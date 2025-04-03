/*
define a functional interface "Second" with an abstract method "void disp4()".
define a class Demo with main function.
inside main function create two implementations of "Second" using lambda expression and display their names.

*/
package Lambda;

@FunctionalInterface
interface Second {
    void disp4();
}

public class Ques2 {
    public static void main(String[] args) {
        Second imple1 = () -> System.out.println("Implementation 1 of disp4");
        Second imple2 = () -> System.out.println("Implementation 2 of disp4");

        imple1.disp4(); 
        imple2.disp4(); 
    }
}