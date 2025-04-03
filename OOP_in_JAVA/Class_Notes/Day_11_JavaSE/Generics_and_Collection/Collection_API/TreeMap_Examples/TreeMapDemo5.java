import java.util.*;
class Person 
{
	private String name;
	private int age;
	public Person(String name,int age)
	{
		this.name = name;
		this.age=age;
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
class NameComparator implements Comparator<Person>
{
	public int compare(Person ref1,Person ref2)
	{
		return ref1.getName().compareTo(ref2.getName());
	}
}
public class TreeMapDemo5
{
	public static void main(String[] args)
	{
		 Person p1=new Person("abc",20);
		 Person p2=new Person("xyz",17);
		 TreeMap<Person,Integer>ref1=new TreeMap<Person,Integer>(new NameComparator());
		 ref1.put(p1, 100);
		 ref1.put(p2, 200);
		 System.out.println(ref1);
	}
}







