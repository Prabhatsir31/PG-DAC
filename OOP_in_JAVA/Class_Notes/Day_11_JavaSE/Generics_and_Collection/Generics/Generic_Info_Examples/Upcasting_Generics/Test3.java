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
public class Test3
{
	static  void disp(List<? super Dog> arr)
	{
		arr.add(new Dog());
		arr.add(new Dog());
		for(Object d:arr)
		{
			if(d instanceof Dog)
			{
				((Dog)d).eat();
			}
			else if(d instanceof Cat)
			{
				((Cat)d).eat();
			}
		}
		System.out.println(arr);
	}
	public static void main(String args[])
	{
		Dog d[]={new Dog(),new Dog()};
		List<Animal>l=new ArrayList<Animal>();
		l.add(new Cat());
		disp(l);
		List<Dog>l1=new ArrayList<Dog>();
		l1.add(new Dog());	
		disp(l1);

	}
}