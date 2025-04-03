/*
create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.
*/
package Generic;

import java.io.*;
import java.util.ArrayList;

class MyClass implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String toString() {
        return "MyClass{name='" + name + "'}";
    }
}

public class Ques8 {
    public static void main(String[] args) {
        ArrayList<MyClass> myClassList = new ArrayList<>();
        myClassList.add(new MyClass("Object 1"));
        myClassList.add(new MyClass("Object 2"));
        myClassList.add(new MyClass("Object 3"));
        myClassList.add(new MyClass("Object 4"));
        myClassList.add(new MyClass("Object 5"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myClassList.txt"))) {
            oos.writeObject(myClassList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myClassList.txt"))) {
            ArrayList<MyClass> deserializedList = (ArrayList<MyClass>) ois.readObject();
            for (MyClass obj : deserializedList) {
                System.out.println(obj);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}