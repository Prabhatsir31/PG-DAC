using System.Collections.Generic;


namespace Service
{
    public interface IRepository
    {
        List<Employee> Display();
        void Add(Employee e);
        void Remove(int id);
        Employee GetEmp(int id);
        List<Employee> GetEmp(string name);
        void Update(int id, string name);
    }
}
