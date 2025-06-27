package mypack;

import org.springframework.stereotype.Component;

@Component(value="sample")
public class Sample 
{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("inside getName of Sample");
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println("inside setName of Sample");
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		System.out.println("inside toString of Sample class");
		return "Sample [name=" + name + ", age=" + age + "]";
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		System.out.println("inside getAge of Sample");
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
		System.out.println("inside setAge of Sample");
	}
	
	
}
