class Animal
{
	void makeSound()
	{
	}
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("roar");
	}
	void hunting()
	{
		System.out.println("hunt");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("bark");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("meow");
	}
}
public class AnimalDemo2
{
	static void perform(Animal ref)  // upcasting
	{
		ref.makeSound();  // polymorphic invocation
		//ref.hunting();  // compile-time error
		
		/*   logically incorrect
		Tiger temp=new Tiger();
		temp.hunting();
		*/
		if(ref instanceof Tiger)
		{
			Tiger temp=(Tiger)ref;  // downcasting
			temp.hunting();
		}

	}
	public static void main(String args[])
	{
		perform(new Tiger());
		perform(new Dog());
		//perform(new Cat());
	}
}



