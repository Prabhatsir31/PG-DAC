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
}
public class TreeMapDemo2
{
	public static void main(String[] args)
	{
		 Person p1=new Person("abc",20);
		 Person p2=new Person("xyz",17);
		 TreeMap<Person,Integer>ref1=new TreeMap<Person,Integer>();
		 ref1.put(p1, 100);
		 ref1.put(p2, 200);
		 System.out.println(ref1);
	}
}
