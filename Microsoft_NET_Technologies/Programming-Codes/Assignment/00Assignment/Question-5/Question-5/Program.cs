//Q5. Create class  Employee with member variable id, firstname,lastname, middlename.
//Create 2 constructor 1. Which will initialised all member and 2. Which will initialised only  id, firstname,
//lastname. Create 2 object with different parameter. Print state of object using Tostring method.



using System;

namespace EmployeeManagement
{
    public class Employee
    {
        private int Id;
        private string FirstName;
        private string LastName;
        private string MiddleName;

        public Employee(int id, string firstName, string lastName, string middleName)
        {
            Id = id;
            FirstName = firstName;
            LastName = lastName;
            MiddleName = middleName;
        }

        public Employee(int id, string firstName, string lastName)
        {
            Id = id;
            FirstName = firstName;
            LastName = lastName;
            MiddleName = string.Empty; // Default value
        }

        public override string ToString()
        {
            return $"Id: {Id}, Name: {FirstName} {MiddleName} {LastName}";
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Employee emp1 = new Employee(1, "John", "Doe", "A.");
            Employee emp2 = new Employee(2, "Jane", "Smith");

            Console.WriteLine(emp1);
            Console.WriteLine(emp2);
        }
    }
}