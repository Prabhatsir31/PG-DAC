/*
define a class "Student" with name and age as member variables, parameterized constructor , 
setters , getters and "toString" method. 
define a functional interface "MyInterface" with an abstract method "void show(Student ref)"
inside main function 
a) create an instance of "Student" class by passing "Vijay" and '20' values.
b) create method reference for "MyInterface" and display the instance of "Student" class created above.
*/

package MethodPackage;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

@FunctionalInterface
interface MyInterface {
    void show(Student ref);
}

public class Ques7 {
    public static void main(String[] args) {
        Student student = new Student("Vijay", 20);
        MyInterface myInterface = System.out::println;
        myInterface.show(student);
    }
}
