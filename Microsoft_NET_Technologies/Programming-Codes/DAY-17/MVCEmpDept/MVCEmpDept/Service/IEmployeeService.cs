using MVCEmpDept.Models;

namespace MVCEmpDept.Service
{
    public interface IEmployeeService
    {
        Employee? GetEmployee(int Id);
        IEnumerable<Employee> GetAllEmployee();
        Employee Add(Employee employee);
        Employee Update(Employee employeeChanges);
        Employee? Delete(int Id);
        IEnumerable<Department> GetAllDepartment();

    }
}
