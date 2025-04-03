/*
define a functional interface "Fifth" with an abstract method "int add(int a,int b)"
define a class Math1 with a method "int calc(int a,int b)" 

inside main function invoke "calc" method with the help of
	a) lamdba expression
	b) method reference

*/
package MethodPackage;

@FunctionalInterface
interface Fifth {
    int add(int a, int b);
}

class Math1 {
    int calc(int a, int b) {
        return a + b;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Math1 math1 = new Math1();
        
        Fifth lambdaAdd = (a, b) -> math1.calc(a, b); // lambda 
        System.out.println("Result using lambda: " + lambdaAdd.add(10, 20));
        
        Fifth methodRefAdd = math1::calc; // method reference
        System.out.println("Result using method reference: " + methodRefAdd.add(30, 40));
    }
}