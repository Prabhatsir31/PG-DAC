/*
 *  if the mapping function (in our example "getDesig") returns 
 *  an Optional, (in our example Optional<String>)
 *  use flatMap() instead of map() to get the 
 *  flattened result from your Optional
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

class Employee
{
	private int id;
	private String name;
	private String desig;
	
	/**
	 * @param id
	 * @param name
	 * @param desig
	 */
	public Employee(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the desig
	 */
	public Optional<String> getDesig() {
		return Optional.ofNullable(desig);
	}
	/**
	 * @param desig the desig to set
	 */
	public void setDesig(String desig) {
		this.desig = desig;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + "]";
	}
}
public class Demo5 {
	private static List<Employee> mylist;
	static
	{
		mylist=new ArrayList<Employee>();
		mylist.add(new Employee(1,"abc","officer"));
		mylist.add(new Employee(2,"xyz","clerk"));
		mylist.add(new Employee(3,"pqr","accountant"));
	}

	static Optional<Employee> getEmployee(int id)
	{
		boolean flag=false;
		Employee ref=null;
		Iterator<Employee>itr=mylist.iterator();
		while(itr.hasNext())
		{
			ref=itr.next();
			if(ref.getId()==id)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			return Optional.ofNullable(ref);
		else
			return Optional.empty();
	}
	public static void main(String[] args) 
	{
		 /* here client program is forced to write 
		  "Optional<Employee> op" because getEmployee() 
		  return type is Optional<Employee>*/
		
		Optional<Employee> op=getEmployee(3);
		
		
		System.out.println(op.map(Employee::getName));
		
		System.out.println(op.map(Employee::getDesig));
		
		Optional<String> op1=op.map(Employee::getName);
		
			// here returntype of "op.map(Employee::getName)" is
		//Optional<String>
		
		System.out.println(op1);
		
		// Optional<String> op2=op.map(Employee::getDesig); error
		//because return type of "op.map(Employee::getDesig)"
		//is "Optional<Optional<String>>"
		
		Optional<Optional<String>> op3=op.map(Employee::getDesig);
		System.out.println("using nested map\t"+op3);
		
		// if you don't want to use nested Optional use "flatmap"
		// instead of "map"
		
		Optional<String> op4=op.flatMap(Employee::getDesig);
		System.out.println("using flatmap\t"+op4);
		
	}
}