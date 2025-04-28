using API1.Models;
using Microsoft.AspNetCore.Mvc;

namespace API1.Service
{
    public interface IAPIServices
    {
        Task<ActionResult<Employee>?> GetEmployee(int Id);
        Task<ActionResult<IEnumerable<Employee>>> GetAllEmployee();
        Task<ActionResult<Employee>> Add(Employee employee);
        Task<Employee> Update(int id, Employee employeeChanges);
        Task<Employee> Delete(int id);
    }
}
