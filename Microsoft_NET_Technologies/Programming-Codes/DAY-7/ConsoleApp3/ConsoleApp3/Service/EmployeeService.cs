using System.Collections.Generic;
using System.Linq;


namespace Service
{
    public class EmployeeService : IRepository
    {
        public static List<Employee> db = new List<Employee>();

        public List<Employee> Display() => db;

        public void Add(Employee e) => db.Add(e);

        public void Remove(int id)
        {
            var emp = db.FirstOrDefault(x => x.Id == id);
            if (emp != null)
                db.Remove(emp);
        }

        public Employee GetEmp(int id) => db.FirstOrDefault(x => x.Id == id);

        public List<Employee> GetEmp(string name) => db.Where(x => x.Name.ToLower().Contains(name.ToLower())).ToList();

        public void Update(int id, string name)
        {
            var emp = db.FirstOrDefault(x => x.Id == id);
            if (emp != null)
                emp.Name = name;
        }
    }
}
