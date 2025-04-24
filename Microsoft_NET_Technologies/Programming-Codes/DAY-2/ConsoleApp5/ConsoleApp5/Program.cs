using System;

namespace Employee5
{
    public class Employee
    {
        private int id;
        private string name;
        private double salary;
        private double netSalary;

        public Employee(int id, string name, double salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        public double CalculateSal()
        {
            netSalary = salary - (salary * 0.10);
            return netSalary;
        }
        public void Display()
        {
            Console.WriteLine($"Name: {name}, Net Salary: {CalculateSal()}");
        }
    }

    class Program5
    {
        static void Main(string[] args)
        {
            Employee emp1 = new Employee(1, "Ali", 5000);
            Employee emp2 = new Employee(2, "Bobby", 6000);
            Employee emp3 = new Employee(3, "Charlie", 7000);

            emp1.Display();
            emp2.Display();
            emp3.Display();
        }
    }
}
