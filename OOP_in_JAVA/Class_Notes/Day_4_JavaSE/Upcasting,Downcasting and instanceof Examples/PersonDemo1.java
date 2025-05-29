abstract class Person
{
	// concrete behaviour
	void walk()
	{
		System.out.println("walking");
	}
	void talk()
	{
		System.out.println("talking");
	}
	void eat()
	{
		System.out.println("eating");
	}
	void sleep()
	{
		System.out.println("sleeping");
	}
	abstract void performDuties();  // contract
}
class HouseWife extends Person
{
	void performDuties()
	{
		System.out.println("take care of family");
	}
}
class Soldier extends Person
{
	void performDuties()
	{
		System.out.println("take care of Border");
	}
	void sleep()
	{
		System.out.println("I hardly sleep");
	}
}
public class PersonDemo1
{
	static void perform(Person ref)
	{
		ref.walk();
		ref.talk();
		ref.eat();
		ref.sleep();
		ref.performDuties();
	}
	public static void main(String args[])
	{
		perform(new HouseWife());
		perform(new Soldier());
		// perform(new Person()); // abstract class cannot be instatiated
	}
}
		