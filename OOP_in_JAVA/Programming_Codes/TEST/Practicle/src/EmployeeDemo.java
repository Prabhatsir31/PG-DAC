//create a class Employee with empid,name,salary as fields , setters , getters and toString methods
//create 3 objects
//create HashMap with Integer as key and Employee as value
//new HashMap<Integer,Employee>
//store above created 3 objects inside the map.
//write Map inside the file system.
//read Map from the file and iterate it using iterator.

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee implements Serializable {
	private int empid;
	private String name;
	private double salary;
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid = " + empid + ", name = " + name + ", salary = " + salary + "]";
	}
}


public class EmployeeDemo {
	public static void main(String args[]) {
		HashMap<Integer, Employee> employeemap = new HashMap<>();
		employeemap.put(1, new Employee(1, "Alice", 85000));
		employeemap.put(2, new Employee(2, "Bob", 60000));
        employeemap.put(3, new Employee(3, "Charlie", 70000));
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employee.dat"))) {
        	oos.writeObject(employeemap);
        } catch(IOException e) {
        	e.printStackTrace();
        }
        
     
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.dat"))) {
            HashMap<Integer, Employee> readMap = (HashMap<Integer, Employee>) ois.readObject();
            
            // Iterating using Iterator
            Iterator<Map.Entry<Integer, Employee>> iterator = readMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Employee> entry = iterator.next();
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please ensure the file exists.");
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
