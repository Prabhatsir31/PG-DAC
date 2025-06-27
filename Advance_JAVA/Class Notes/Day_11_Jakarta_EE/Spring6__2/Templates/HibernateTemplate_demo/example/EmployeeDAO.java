package mypack;

import java.util.*;
public interface EmployeeDAO 
{
	public void saveEmployee(Employee ref);
	public void updateEmployee(Employee ref);
	public void deleteEmployee(Employee ref);
	public Employee getById(int id);
	public List<Employee> getEmployees();
}
