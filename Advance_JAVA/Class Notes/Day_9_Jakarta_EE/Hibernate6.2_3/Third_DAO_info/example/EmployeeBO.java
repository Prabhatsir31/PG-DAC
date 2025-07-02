package mypack;
public class EmployeeBO   // business layer loosely coupled with a specific persistence mechanism
{
	public EmployeeBO(EmployeeDAO employeedao) {
		this.employeedao = employeedao;
	}
	EmployeeDAO employeedao;
	void add(Employee emp)
	{
		employeedao.insertEmployee(emp);
	}
	Employee get()
	{
		return employeedao.getEmployee();
	}
}
