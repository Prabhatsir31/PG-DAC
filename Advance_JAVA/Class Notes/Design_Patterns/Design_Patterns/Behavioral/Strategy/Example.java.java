import java.util.*;
class Employee
{
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
	return "["+name+"\t"+age+"]";		
    }
    public String getName()
    {
	return name;
    }
    public int getAge()
    {
        return age;
    }
}
class SortByName implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
         return e1.getName().compareTo(e2.getName());
    }
}

class SortByAge implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
         if(e1.getAge()>e2.getAge())
	 {
		return 1;
	 }
	 else if(e1.getAge()<e2.getAge())
	 {
		return -1;
	 }
	 else
	 {
		return 0;
	 }
    }
}

public class Example
{
	public static void main(String[] args)
	{
	List<Employee> employeeList = new ArrayList<Employee>();
    employeeList.add( new Employee("Tim", 23) );
    employeeList.add( new Employee("Rolvin", 11) );
    employeeList.add( new Employee("Gerald", 32) );
 System.out.println("Sort by name");
    Collections.sort(employeeList, new SortByName() );//sort by name;
	System.out.println(employeeList);
	System.out.println("sort by age");
    Collections.sort(employeeList, new SortByAge() );//sort by age;        
	System.out.println(employeeList);     
	}
}




















