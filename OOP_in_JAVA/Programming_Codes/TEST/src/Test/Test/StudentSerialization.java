import java.io.*;
import java.util.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    private String name;
    private int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Marks: " + marks;
    }
}

class StudentSerialization {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rohit", 20, 85.5));
        studentList.add(new Student("Virat", 22, 90.0));
        studentList.add(new Student("Rahul", 21, 88.2));
        studentList.add(new Student("Sachin", 23, 95.4));

        // File name
        // String fileName = "students.txt";

        // Serialization: Writing ArrayList to file
        try (FileOutputStream fos = new FileOutputStream("student.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(studentList);
            System.out.println("Student list saved successfully.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization: Reading ArrayList from file
        try (FileInputStream fis = new FileInputStream("student.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            @SuppressWarnings("unchecked")
            List<?> readList = (List<?>) ois.readObject();

            // Displaying students using Iterator
            System.out.println("Students read from the file:");
            Iterator<?> itr = readList.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
