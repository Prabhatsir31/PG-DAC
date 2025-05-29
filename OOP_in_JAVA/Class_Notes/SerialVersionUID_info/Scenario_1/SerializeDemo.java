import java.io.*;

class Employee implements Serializable {
    private String name;
    private int age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
	public String toString()
	{
		return name+"\t"+age;
	}
}

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee("John", 30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        oos.writeObject(emp);
        oos.close();
        System.out.println("Object Serialized.");
    }
}
