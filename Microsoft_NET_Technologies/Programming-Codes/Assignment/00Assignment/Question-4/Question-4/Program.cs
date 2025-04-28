//Q4.Create class  Employee with member variable id, name, salary .
//Write parameterized constructor and initialized instance member.
//Write public static void PayTDS(Employee obj) which will deduct 10% TDS for all employee and reduce the salary.
//Create 3 object and print Id and Salary using ToString method.

using System;

namespace EmployeeManagement
{
    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public decimal Salary { get; set; }

        public Employee(int id, string name, decimal salary)
        {
            Id = id;
            Name = name;
            Salary = salary;
        }

        public static void PayTDS(Employee obj)
        {
            obj.Salary -= obj.Salary * 0.10m; // Deduct 10% TDS
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
            Employee emp1 = new Employee(1, "Ali", 50000);
            Employee emp2 = new Employee(2, "Bob", 60000);
            Employee emp3 = new Employee(3, "Charlie", 70000);

            Employee.PayTDS(emp1);
            Employee.PayTDS(emp2);
            Employee.PayTDS(emp3);

            Console.WriteLine(emp1);
            Console.WriteLine(emp2);
            Console.WriteLine(emp3);
        }
    }
}