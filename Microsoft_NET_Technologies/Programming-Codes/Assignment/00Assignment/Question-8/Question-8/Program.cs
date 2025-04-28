//Q8.Create class Employee with private member Id, name, salary.
//Write parameterized constructor in this constructor
//call setter method. Write getter setter for id, name and salary. Write validation for name, length of name can not be < then 3.
//You will be writing validation in setter method of name.
//Create 3 object and print Id, name and salary in entry point class by calling getter method.
//Update one employee name by calling setter method of name.

using System;

namespace EmployeeManagement
{
    public class Employee
    {
        private int Id;
        private string Name;
        private decimal Salary;

        public Employee(int id, string name, decimal salary)
        {
            Id = id;
            SetName(name); // Validation occurs here
            Salary = salary;
        }

        public void SetName(string name)
        {
            if (name.Length < 3)
                throw new ArgumentException("Name must be at least 3 characters long.");
            this.Name = name; // now correctly assigning to the private field
        }


        public string GetName() => Name;
        public int GetId() => Id;
        public decimal GetSalary() => Salary;
    }

    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Employee emp1 = new Employee(1, "John", 50000);
                Employee emp2 = new Employee(2, "Alice", 60000);
                Employee emp3 = new Employee(3, "Mark", 55000);

                Console.WriteLine($"Id: {emp1.GetId()}, Name: {emp1.GetName()}, Salary: {emp1.GetSalary()}");
                Console.WriteLine($"Id: {emp2.GetId()}, Name: {emp2.GetName()}, Salary: {emp2.GetSalary()}");
                Console.WriteLine($"Id: {emp3.GetId()}, Name: {emp3.GetName()}, Salary: {emp3.GetSalary()}");

                // Update emp3's name
                emp3.SetName("Michael");

                Console.WriteLine("\nAfter updating emp3's name:");
                Console.WriteLine($"Id: {emp3.GetId()}, Name: {emp3.GetName()}, Salary: {emp3.GetSalary()}");
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine("Error: " + ex.Message);
            }
        }
    }
}
