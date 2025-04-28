//Create class Employee wit member
//Id, name, salary, netsalary
//Create getter setter for salary 
//Create getter for Id

//Create 2 child class
//1 permanent emp and 
//2. contract emp

//In parent class declare  virtual method calaculate_netsal
//Let child class override calaculate_netsal()deduct salary-10% TDS in case of contract employee
//In case of permanent emp override calaculate_netsal()deduct salary-10% TDS and give HRA 20%
//Create array of employee class and store 5 object of both child.
//Write toString method to diplay sate of an object.

using System;

namespace EmployeeManagement
{
    class Employee
    {
        private static int counter = 0;
        private int id;
        private string name;
        protected double salary;
        protected double netSalary;

        public Employee(string name, double salary)
        {
            this.id = ++counter;
            this.name = name;
            this.salary = salary;
        }

        public int Id => id;

        public string Name
        {
            get => name;
            set => name = value;
        }

        public double Salary
        {
            get => salary;
            set => salary = value;
        }

        public double NetSalary => netSalary;

        public virtual void CalculateNetSalary()
        {
            Console.WriteLine("Base employee calculation – override in child.");
        }

        public override string ToString()
        {
            return $"ID: {id}, Name: {name}, Salary: Rs {salary}, Net Salary: Rs {netSalary}";
        }
    }

    class PermanentEmployee : Employee
    {
        public PermanentEmployee(string name, double salary) : base(name, salary) { }

        public override void CalculateNetSalary()
        {
            double tds = salary * 0.10;
            double hra = salary * 0.20;
            netSalary = salary - tds + hra;
        }
    }

    class ContractEmployee : Employee
    {
        public ContractEmployee(string name, double salary) : base(name, salary) { }

        public override void CalculateNetSalary()
        {
            double tds = salary * 0.10;
            netSalary = salary - tds;
        }
    }

    class Program
    {
        static void Main()
        {
            Employee[] employees = new Employee[5];

            employees[0] = new PermanentEmployee("Ravi", 50000);
            employees[1] = new ContractEmployee("Meena", 40000);
            employees[2] = new PermanentEmployee("Arun", 60000);
            employees[3] = new ContractEmployee("Sneha", 35000);
            employees[4] = new PermanentEmployee("Divya", 45000);

            Console.WriteLine("Employee Details:\n");

            foreach (var emp in employees)
            {
                emp.CalculateNetSalary();
                Console.WriteLine(emp);
            }
        }
    }
}
