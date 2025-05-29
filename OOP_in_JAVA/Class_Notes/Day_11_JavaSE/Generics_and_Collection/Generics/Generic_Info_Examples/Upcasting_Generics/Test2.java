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
public class Test2
{
	static  void disp(List<? extends Animal> arr)
	{
		for(Animal l:arr)
		{
			l.eat();
		}
	}
	public static void main(String args[])
	{
		Dog d[]={new Dog(),new Dog()};
		List<Dog>l=new ArrayList<Dog>();
		l.add(d[0]);
		l.add(d[1]);
		disp(l);

// now with cat
	Cat c[]={new Cat(),new Cat()};
		List<Cat>l1=new ArrayList<Cat>();
		l1.add(c[0]);
		l1.add(c[1]);
		disp(l1);
	}
}