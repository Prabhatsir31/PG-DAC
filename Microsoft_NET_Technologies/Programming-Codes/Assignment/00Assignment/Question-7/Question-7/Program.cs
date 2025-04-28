//Q7. Create class Employee with member variable Id, name, salary.
//Write parameterized constructor and initialized instance member.
//Create static constructor which will print name of company.
//Write Tostring method to display Id and Salary.
//Create 2 object and print it’s state.

using System;

namespace EmployeeManagement
{
    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public decimal Salary { get; set; } 

        static Employee()
        {
            Console.WriteLine("Welcome to Prabhu Company");
        }

        public Employee(int id, string name, decimal salary)
        {
            Id = id;
            Name = name;
            Salary = salary;
        }

        public override string ToString()
        {
            return $"Id: {Id}, Salary: {Salary}";
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Employee emp1 = new Employee(1, "Alice", 50000);
            Employee emp2 = new Employee(2, "Bob", 60000);

            Console.WriteLine(emp1);
            Console.WriteLine(emp2);
        }
    }
}