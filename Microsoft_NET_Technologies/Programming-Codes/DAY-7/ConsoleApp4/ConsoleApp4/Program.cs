// store all the emp in the list collection class and solve following ques:
//    display emp name ascending order
//    display emp whose name is raj
//    display all emp whose salary is greater than 8000

using System;
using System.Collections.Generic;
using System.Linq;

namespace EmployeeManagement
{
    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public decimal Salary { get; set; }
        public string Gender { get; set; }

        public Employee(int id, string name, decimal salary, string gender)
        {
            Id = id;
            Name = name;
            Salary = salary;
            Gender = gender;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Create a list of employees
            List<Employee> employees = new List<Employee>
            {
                new Employee(1, "Raj", 9000, "Male"),
                new Employee(2, "Alice", 8500, "Female"),
                new Employee(3, "Bob", 7000, "Male"),
                new Employee(4, "Rajesh", 9500, "Male"),
                new Employee(5, "Charlie", 8000, "Male"),
                new Employee(6, "Eve", 10000, "Female")
            };

            // Display employee names in ascending order
            Console.WriteLine("Employees in Ascending Order:");
            var sortedEmployees = employees.OrderBy(emp => emp.Name).ToList();
            foreach (var emp in sortedEmployees)
            {
                Console.WriteLine(emp.Name);
            }

            // Display employees whose name is "Raj"
            Console.WriteLine("\nEmployees named 'Raj':");
            var rajEmployees = employees.Where(emp => emp.Name.Equals("Raj", StringComparison.OrdinalIgnoreCase)).ToList();
            foreach (var emp in rajEmployees)
            {
                Console.WriteLine(emp.Name);
            }

            // Display all employees whose salary is greater than 8000
            Console.WriteLine("\nEmployees with Salary Greater than 8000:");
            var highSalaryEmployees = employees.Where(emp => emp.Salary > 8000).ToList();
            foreach (var emp in highSalaryEmployees)
            {
                Console.WriteLine($"{emp.Name} - Salary: {emp.Salary}");
            }
        }
    }
}