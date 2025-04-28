using System.Collections.Generic;
using System.Linq;
using EmployeeCrud.Models;

namespace EmployeeCrud.Services
{
    public class EmployeeService
    {
        private List<Employee> db = new List<Employee>();

        public void Add(string name, double salary)
        {
            db.Add(new Employee(name, salary));
        }

        public List<Employee> GetAll()
        {
            return db;
        }

        public Employee GetById(int id)
        {
            return db.FirstOrDefault(e => e.Id == id);
        }

        public bool Update(int id, string newName, double newSalary)
        {
            var emp = GetById(id);
            if (emp != null)
            {
                emp.Name = newName;
                emp.Salary = newSalary;
                return true;
            }
            return false;
        }

        public bool Delete(int id)
        {
            var emp = GetById(id);
            if (emp != null)
            {
                db.Remove(emp);
                return true;
            }
            return false;
        }
    }
}
