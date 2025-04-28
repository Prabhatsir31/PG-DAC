using Microsoft.EntityFrameworkCore;
using API1.Models;
using Microsoft.AspNetCore.Mvc;
using API1.Repository;

namespace API1.Service
{
    public class SqlAPIService : IAPIServices
    {

        private readonly AppdbContext context;

        public SqlAPIService(AppdbContext context)
        {
            this.context = context;
        }
        public async Task<ActionResult<Employee>> Add(Employee employee)
        {
            context.Employee.Add(employee);
            await context.SaveChangesAsync();
            return employee;
        }

        public async Task<Employee> Delete(int Id)
        {
            Employee employee = context.Employee.Find(Id);
            if (employee != null)
            {
                context.Employee.Remove(employee);
                await context.SaveChangesAsync();
            }
            return employee;
        }
        public async Task<ActionResult<IEnumerable<Employee>?>> GetAllEmployee()
        {
            if (context.Employee == null)
            {
                return null;
            }
            return await context.Employee.ToListAsync();

        }


        public async Task<ActionResult<Employee>?> GetEmployee(int Id)
        {
            if (context.Employee == null)
            {
                return null;
            }
            var employee = await context.Employee.FindAsync(Id);

            if (employee == null)
            {
                return null;
            }

            return employee;
        }

        public async Task<Employee?> Update(int id, Employee employee)
        {
            if (id != employee.Id)
            {
                return null;
            }

            context.Entry(employee).State = EntityState.Modified;

            try
            {
                await context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!EmployeeExists(id))
                {
                    return null;
                }
                else
                {
                    throw;
                }
            }
            return null;

        }

        private bool EmployeeExists(int id)
        {
            return (context.Employee?.Any(e => e.Id == id)).GetValueOrDefault();
        }
    }
}
