using Microsoft.EntityFrameworkCore;
using MVCEmpDept.Models;
using MVCEmpDept.Repository;

namespace MVCEmpDept.Service
{
    public class SqlEmployeeService:IEmployeeService
    {
        private readonly AppdbContextRepository context;
            public SqlEmployeeService(AppdbContextRepository context)
            {
                this.context = context;
            }
            public Employee Add(Employee employee)
            {
                context.Employee.Add(employee);
                context.SaveChanges();
                return employee;
            }
            public Employee? Delete(int Id)
            {
                Employee? employee = context.Employee.Find(Id);
                if (employee != null)
                {
                    context.Employee.Remove(employee);
                    context.SaveChanges();
                }
                return employee;
            }
        public IEnumerable<Department> GetAllDepartment()
        {
            return context.Department;
        }
        public IEnumerable<Employee> GetAllEmployee()
        {
            return context.Employee.Include<Employee>("Department");
        }
        public Employee? GetEmployee(int Id)
            {//context.Employee.Find(Id);
          Employee e= context.Employee.Include(e => e.Department).FirstOrDefault(m => m.Id == Id);

            return e;
        }
        public Employee Update(Employee employeeChanges)
            {
            context.Entry(employeeChanges).State = EntityState.Modified;
                 context.Update(employeeChanges);
           // context.Update<Employee>(employeeChanges);
                context.SaveChanges();
                return employeeChanges;
            }
        
    }
}
