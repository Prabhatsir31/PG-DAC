package trial1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	public String getDesig() {
		return desig;
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
public class Demo1 {
	private static List<Employee> mylist;
	static
	{
		mylist=new ArrayList<Employee>();
		mylist.add(new Employee(1,"abc","officer"));
		mylist.add(new Employee(2,"xyz","clerk"));
		mylist.add(new Employee(3,"pqr","accountant"));
	}

	static Employee getEmployee(int id)
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
			return ref;
		else
			return null;
	}
	public static void main(String[] args) 
	{
		Employee e1=getEmployee(3);
		System.out.println(e1.getDesig());
	}
}
