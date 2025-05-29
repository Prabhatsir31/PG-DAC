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
public class Test6
{
	static void disp(List<Object> arr)
	{
		arr.add(new Dog());   // allowed
		arr.add(200);      // allowed
		System.out.println(arr);
	}
	public static void main(String args[])
	{
	List<Object>ob=new ArrayList<Object>();
		disp(ob);
	List<Integer>ob1=new ArrayList<Integer>();
		// disp(ob1); // error, not allowed
	}
}