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
public class Test1
{
	static void disp(List<Animal> arr)
	{
		arr.add(new Dog());
		arr.add(new Cat());
		System.out.println(arr);
	}
	public static void main(String args[])
	{
		disp(new ArrayList<Animal>());
	}
}