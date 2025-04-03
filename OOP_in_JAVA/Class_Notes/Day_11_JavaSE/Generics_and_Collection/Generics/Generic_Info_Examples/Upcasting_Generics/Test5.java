import java.util.*;
class Animal
{
	void eat()
	{
	}
	public String toString()
	{
		return getClass().getName();
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eat");
	}
	public String toString()
	{
		return getClass().getName();
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("Cat eat");
	}
	public String toString()
	{
		return getClass().getName();
	}
}
public class Test5
{
	static  void disp(List<?> arr)
	{
		System.out.println(arr);
		//arr.add(new Dog()); can't add
	}
	public static void main(String args[])
	{
	List<String>l=new ArrayList<String>();
		l.add("hello");
		disp(l);
	List<Dog>l1=new ArrayList<Dog>();
		l1.add(new Dog());	
		disp(l1);
	List<Integer>ob=new ArrayList<Integer>();
		ob.add(100);
		disp(ob);

	}
}