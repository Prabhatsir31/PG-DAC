//package datatypes_pro;


// when u call get, the sequence is "hashCode()","==" 
// if == returns false , it checks "equals"
import java.util.*;
class Employee
{
	private String empid;
	private int deptcode;
	private int citycode;

	public Employee(String empid,int deptcode,int citycode)
	{
		this.empid=empid;
		this.deptcode=deptcode;
		this.citycode=citycode;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashcode");
		return deptcode;
	}
	@Override
	public boolean equals(Object ref)
	{
		boolean flag=citycode==((Employee)ref).citycode;
		System.out.println("in equals\t"+flag);
		return flag;
	}
	@Override
	public String toString()
	{
		
		return empid+"\t"+deptcode+"\t"+citycode;
	}
}
public class HashMapDemo1_a
{
	public static void main(String args[])
	{
		Employee e1=new Employee("e001",1,10);
		Employee e2=new Employee("e002",1,12);
		Employee e3=new Employee("e003",2,10);
		Employee e4=new Employee("e004",1,13);
		Employee e5=new Employee("e004",1,12);
		Employee e6=e3;

		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(e1,"first");
		map.put(e2,"second");
		map.put(e3,"third");
		map.put(e4,"fourth");
		map.put(e5,"fifth");
		map.put(e6,"sixth");
		System.out.println(map);

		String val=map.get(e2); 
		System.out.println(val);

		val=map.get(e3); 
		System.out.println(val);
	}
}








