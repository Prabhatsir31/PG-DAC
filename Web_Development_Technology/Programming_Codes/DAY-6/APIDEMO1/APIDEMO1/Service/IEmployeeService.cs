using APIDEMO1.Models;
using Microsoft.AspNetCore.Mvc;

namespace APIDEMO1.Service
{
    public interface IEmployeeService
    {
        //Employee? GetEmployee(int Id);
        //IEnumerable<Employee> GetAllEmployee();
        //void Add(Employee employee);
        //void Update(Employee employeeChanges); // This is enough
        //void Delete(int Id);

        Task<ActionResult<Employee>?> GetEmployee(int Id);
        Task<ActionResult<IEnumerable<Employee>>> GetAllEmployee();
        Task<ActionResult<Employee>> Add(Employee employee);
        Task<Employee> Update(int id, Employee employeeChanges);
        Task<Employee> Delete(int Id);




    }
}
