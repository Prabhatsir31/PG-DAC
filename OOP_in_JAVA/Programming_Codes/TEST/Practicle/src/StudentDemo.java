//create a class Student with name,age,marks
//create 4 objects, store them in ArrayList. store ArrayList inside the filesystem. 
//Read the file and display ArrayList using Iterator.

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


class Student implements Serializable {
	private String name;
	private int age;
	private double marks;
	
	public Student(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
		
}
	
	
public class StudentDemo {
	public static void main(String args[]) {
		ArrayList<Student> lists = new ArrayList<>();
		lists.add(new Student("Alice", 20, 85.5));
		lists.add(new Student("Bob", 22, 90.0));
		lists.add(new Student("Charlie", 21, 78.0));
		lists.add(new Student("Diana", 23, 88.5));
		
		
		// Store ArrayList in the file system
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.dat"))) {
			oos.writeObject(lists);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// Read the file and display ArrayList using Iterator
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.dat"))) {
			ArrayList<Student> readStudents = (ArrayList<Student>) ois.readObject();
			Iterator<Student> iterator = readStudents.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
