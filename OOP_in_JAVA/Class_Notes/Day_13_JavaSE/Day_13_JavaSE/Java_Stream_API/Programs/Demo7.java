import java.util.ArrayList;
import java.util.List;

class Person
{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
public class Demo7
{
	public static void main(String[] args)
	{
		Person p1=new Person("lmn",21);
		Person p2=new Person("abc",25);
		List<Person> mylist=new ArrayList<>();
		mylist.add(p1);
		mylist.add(p2);
		System.out.println("original list is\t"+mylist);
		mylist.stream().sorted().forEach(System.out::println);
		
	}
}
