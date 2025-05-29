/*
Create a base class Animal with makeSound().

Create subclasses Dog and Cat, each overriding makeSound().

Store objects of Dog and Cat in an ArrayList<Animal>.
Now traverse the ArrayList using iterator and call makeSound() dynamically.
*/
package Generic;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Ques12 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            animal.makeSound();
        }
    }
}