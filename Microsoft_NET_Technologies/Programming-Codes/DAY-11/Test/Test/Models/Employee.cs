using System;

namespace EmployeeCrud.Models
{
    public class Employee
    {
        private static int counter = 1;
        public int Id { get; private set; }
        public string Name { get; set; }
        public double Salary { get; set; }

        public Employee(string name, double salary)
        {
            Id = counter++;
            Name = name;
            Salary = salary;
        }

        public override string ToString()
        {
            return ($"Id: {Id}, Name: {Name}, Salary: {Salary}");
        }
    }
}