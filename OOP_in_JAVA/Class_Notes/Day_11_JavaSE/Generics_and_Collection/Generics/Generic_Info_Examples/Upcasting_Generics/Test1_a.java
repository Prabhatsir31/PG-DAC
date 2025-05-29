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
public class Test1_a
{
	static void disp(List<Animal> arr)
	{
		arr.add(new Dog());
		arr.add(new Cat());
		
		for(Animal ref:arr)  // programmer would like to do this
		{
			ref.eat();
		}
	}
	public static void main(String args[])
	{
	// why programmer wants to pass "list of Dog" to the method which accepts "list of Animal" ?
		// what is his intention ?

		disp(new ArrayList<Dog>());  // won't compile

	}
}