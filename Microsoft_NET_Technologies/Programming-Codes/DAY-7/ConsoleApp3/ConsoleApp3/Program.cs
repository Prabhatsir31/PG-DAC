//Create interface Irepository
//List<Employee> display()
//void Add(Employee e)
//void remove(int id);//
//Employee Getemp(int Id);
//List<Employee> Getemp(string Name);
//Void update(int id, string name);
//Create class EmployeeService which will implement all the above method, This class has member
//Public static List<Employee> db = new List<Employee>();
//Create Employee class with member Id, Name, Salary, Gender . Id should be auto increment.
//Put employee class in folder Models
//Put Service and repository class in Folder Service

using System;

using Service;

namespace EmployeeApp
{
    class Program
    {
        static void Main(string[] args)
        {
            IRepository service = new EmployeeService();

            service.Add(new Employee { Name = "Mia", Salary = 50000, Gender = "Female" });
            service.Add(new Employee { Name = "Haan", Salary = 60000, Gender = "Male" });
            service.Add(new Employee { Name = "Dom", Salary = 55000, Gender = "Male" });

            Console.WriteLine("All Employees:");
            foreach (var emp in service.Display())
                Console.WriteLine(emp);

            Console.WriteLine("\nGet Employee with ID = 2:");
            var empById = service.GetEmp(2);
            Console.WriteLine(empById != null ? empById.ToString() : "Employee not found");

            Console.WriteLine("\nGet Employee by Name = 'Torato':");
            var empByName = service.GetEmp("Torato");
            foreach (var e in empByName)
                Console.WriteLine(e);

            Console.WriteLine("\nUpdating Employee ID = 1 to Name = 'Letty'");
            service.Update(1, "Letty");

            Console.WriteLine("\nRemoving Employee with ID = 3");
            service.Remove(3);

            Console.WriteLine("\nUpdated Employee List:");
            foreach (var emp in service.Display())
                Console.WriteLine(emp);

            Console.ReadLine();
        }
    }
}
