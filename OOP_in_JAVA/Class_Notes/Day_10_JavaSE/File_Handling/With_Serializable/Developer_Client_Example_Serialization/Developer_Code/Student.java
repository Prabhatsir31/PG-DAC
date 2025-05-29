package pack1;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author Sriram
 *
 */
public class Student implements Serializable
{
	public Student()
	{
		System.out.println("inside Student default constructor");
	}
	
	static
	{
		System.out.println("inside Student class static block");
	}
	
	private int rollno,age;
	private String name;
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}
	
}
