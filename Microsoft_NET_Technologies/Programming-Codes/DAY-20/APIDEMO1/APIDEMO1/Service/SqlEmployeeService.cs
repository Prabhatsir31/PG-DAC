using Microsoft.EntityFrameworkCore;
using APIDEMO1.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using WebApplication1.Models;

namespace APIDEMO1.Service
{
    public class SqlEmployeeService:IEmployeeService
    {
        //private readonly AppdbContextRepository context;
        //    public SqlEmployeeService(AppdbContextRepository context)
        //    {
        //        this.context = context;
        //    }
        //    public void Add(Employee employee)
        //    {
        //        context.Employee.Add(employee);
        //        context.SaveChanges();

        //    }
        //    public void Delete(int Id)
        //    {
        //        Employee? employee = context.Employee.Find(Id);
        //        if (employee != null)
        //        {
        //            context.Employee.Remove(employee);
        //            context.SaveChanges();
        //        }

        //    }
        //public IEnumerable<Department> GetAllDepartment()
        //{
        //    return context.Department;
        //}
        //public IEnumerable<Employee> GetAllEmployee()
        //{
        //    return context.Employee.Include<Employee>("Department");
        //}
        //public Employee? GetEmployee(int Id)
        //    {//context.Employee.Find(Id);
        //  Employee e= context.Employee.Include(e => e.Department).FirstOrDefault(m => m.Id == Id);

        //    return e;
        //}
        //public void Update(Employee employeeChanges)
        //    {
        //    context.Entry(employeeChanges).State = EntityState.Modified;
        //         context.Update(employeeChanges);
        //   // context.Update<Employee>(employeeChanges);
        //        context.SaveChanges();

        //    }



        private readonly AppdbContextRepository context;

        public SqlEmployeeService(AppdbContextRepository context)
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
