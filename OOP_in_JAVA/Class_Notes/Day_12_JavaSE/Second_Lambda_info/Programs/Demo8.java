import java.util.*;
class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public String toString()
	{
		return name+"\t"+age;
	}
}	 

class NameSorter implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

class AgeSorter implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return ((Integer)o1.getAge()).compareTo((Integer)o2.getAge());
	}
	
}




public class Demo8 
{
	public static void main(String args[])
	{
		Person p1=new Person("abc",25);
		Person p2=new Person("pqr",18);
		List<Person>mylist=new ArrayList<Person>();
		mylist.add(p1);
		mylist.add(p2);
		
		System.out.println("Without Lambda");
		System.out.println();
		
		Collections.sort(mylist,new NameSorter());
		System.out.println("Namewise sorting\t"+mylist);
		
		Collections.sort(mylist,new AgeSorter());
		System.out.println("Agewise sorting\t"+mylist);
		
		System.out.println();




		System.out.println("Using Lambda");
		System.out.println();
		//Comparator<Person> namestrategy=(Person a,Person b)->{return a.getName().compareTo(b.getName());};
		Collections.sort(mylist,(a,b)->{return a.getName().compareTo(b.getName());});
		System.out.println("Name sorting\t"+mylist);

		/*Comparator<Person> agestrategy=(Person a,Person b)->{ Integer x=a.getAge(); 
	Integer y=b.getAge();
	return x.compareTo(y);};*/
		Collections.sort(mylist,(a,b)->{ Integer x=a.getAge(); 
	Integer y=b.getAge();
	return x.compareTo(y);});
		System.out.println("Age sorting\t"+mylist);		
	}
}








