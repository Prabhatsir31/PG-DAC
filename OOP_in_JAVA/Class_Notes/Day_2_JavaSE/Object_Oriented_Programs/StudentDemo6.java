// constructor discussion


class Student
{
	// member variables or instance variables

	public final static int centercode=445;
	private int rollno,age;
	private String name;

	// parameterized constructor

	public Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}

	// default or no-arg constructor
	public Student()
	{
	}

	// member functions

	public void setRollno(int rollno)
	{
		
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return this.rollno;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}

public class StudentDemo6
{
	public static void main(String args[])
	{
		// this statement won't compile as we don't have
		// default constructor
		Student s1=new Student();  // object or instance creation
		//s1.rollno=1; // not possible , data security
		s1.setRollno(1);    
		s1.setName("Abc");
		s1.setAge(21);

		System.out.println("My First student is\t"+s1.getRollno() +"\t"+s1.getName()+"\t"+ s1.getAge());

	// this statement won't compile as we don't have
		// default constructor
		Student s2=new Student();  // object or instance creation
		
		s2.setRollno(2);    
		s2.setName("Amar");
		s2.setAge(23);
		

		System.out.println("My Second student is\t"+s2.getRollno() +"\t"+s2.getName()+"\t"+ s2.getAge());

		Student s3=new Student(3,"Vishal",25);

		System.out.println("My Third student is\t"+s3.getRollno() +"\t"+s3.getName()+"\t"+ s3.getAge());

		System.out.println("Center code for these students is\t"+ Student.centercode);
		
	}
}





