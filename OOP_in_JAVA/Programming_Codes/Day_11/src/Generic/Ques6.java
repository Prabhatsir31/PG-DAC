/*
Create a Student class with fields:

id (int)
name (String)
age (int)
marks (double)
Constructor & toString() method

Use an ArrayList<Student> to store student records.

Implement the following operations in the main function.

Add a student
Display all students
Search for a student by ID

*/
package Generic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }

    public int getId() {
        return id;
    }
}

public class Ques6 {
    public static void main(String[] args) {
        List<Student> mylist = new ArrayList<>();

        Student s1 = new Student(101, "Vin Diesel", 56, 96.0);
        Student s2 = new Student(102, "Paul Walker", 50, 97.0);
        Student s3 = new Student(103, "Jordana Brewster", 36, 98.0);
        Student s4 = new Student(104, "Roman Pearce", 45, 94.0);

        mylist.add(s1);
        mylist.add(s2);
        mylist.add(s3);
        mylist.add(s4);

        try {
            FileOutputStream fos = new FileOutputStream("contain.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mylist);
            oos.close();

            FileInputStream fis = new FileInputStream("contain.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Student> deser = (List<Student>) ois.readObject();
            ois.close();

            System.out.println("File is deserializable:");
            for (Student student : deser) {
                System.out.println(student);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the student ID to search: ");
            int userInput = scanner.nextInt();
            boolean found = false;

            for (Student student : deser) {
                if (student.getId() == userInput) {
                    System.out.println("Student found: " + student);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student with ID " + userInput + " not found.");
            }
            scanner.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}