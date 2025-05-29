import java.util.*;
class Employee implements Comparable<Employee>
{
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Employee e)
    {
        if(age>e.age)
	{
		return 1;
	}
	else if(age<e.age)
	{
		return -1;
	}
	else
	{
		return 0;
	}
    }
   /* public int compareTo(Employee e)
    {
    	return name.compareTo(e.name);
    }*/
    public String toString()
    {
	return "["+name+"\t"+age+"]";		
    }
}
public class ComparableDemo1
{
    public static void main(String[] args)
    {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Tim", 23));
        employeeList.add(new Employee("Rolvin",11));
        employeeList.add(new Employee("Gerald",12));
	System.out.println("Before sort");
	System.out.println(employeeList);
        Collections.sort(employeeList);
	System.out.println("After sort");
	System.out.println(employeeList);
     
    }
}






