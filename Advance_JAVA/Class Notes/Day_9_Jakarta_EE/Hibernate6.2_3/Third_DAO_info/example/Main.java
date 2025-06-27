package mypack;


public class Main 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setName("Sachin");
		e1.setDesig("officer");
		e1.setSalary(25000.00);
		EmployeeDAOFileImpl empfile=new EmployeeDAOFileImpl();
		EmployeeDAODatabaseImpl empdata=new EmployeeDAODatabaseImpl();
		//EmployeeBO empbo=new EmployeeBO(empfile);
		EmployeeBO empbo=new EmployeeBO(empdata);
	    empbo.add(e1);
	    System.out.println(empbo.get());
	    System.out.println("Done with Employee");

	}

}









