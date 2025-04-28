using Microsoft.EntityFrameworkCore;
using MVC.Models;
using MVC.Repository;

namespace MVC.Services
{
    public class SQLEmployeeRepository : IEmployeeRepository
    {
        private readonly Appdbcontext context;

        public SQLEmployeeRepository(Appdbcontext context)
        {
            this.context = context;
        }
        public Employee Add(Employee employee)
        {
            context.Employees.Add(employee);
            context.SaveChanges();
            return employee;
        }

        public Employee Delete(int Id)
        {
            Employee employee = context.Employees.Find(Id);
            if (employee != null)
            {
                context.Employees.Remove(employee);
                context.SaveChanges();
            }
            return employee;
        }
        public IEnumerable<Employee> GetAllEmployee()
        {
            return context.Employees;
        }

        public Employee GetEmployee(int Id)
        {
            context.Employees.SingleOrDefault(data => data.Id == Id);
            return context.Employees.Find(Id);
        }

        public Employee Update(Employee employeeChanges)
        {
            context.Entry(employeeChanges).State = EntityState.Modified;
            context.Update(employeeChanges);
            context.SaveChanges();
            return employeeChanges;
        }
    }
}
