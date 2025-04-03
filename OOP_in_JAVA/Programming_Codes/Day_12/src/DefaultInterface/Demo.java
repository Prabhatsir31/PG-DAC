/*
define interface "First" with "static void disp1()" method.
class "Base" with "static void disp2()" method.
derive a class "Sub" from "Base" and "First"
now define a class Demo in which define "main" method.
inside main show how many ways you can invoke "disp1" and "disp2" methods.
*/

package DefaultInterface;

interface First {
    static void disp1() {
        System.out.println("Static method disp1 from First interface");
    }
}

class Base {
    static void disp2() {
        System.out.println("Static method disp2 from Base class");
    }
}

class Sub extends Base implements First {
    
}

public class Demo {
    public static void main(String[] args) {
        First.disp1(); 
        Base.disp2(); 
        Sub sub = new Sub();
        System.out.println("Sub is an instance of Base: " + (sub instanceof Base));
        System.out.println("Sub is an instance of First: " + (sub instanceof First));
    }
}