//Create abstract class Employee having member id, name, salary, netsalary
//It has method givebasic_salary which will set netsalary after deduction 10%TDS
//it has abstract method givebonus
//Id should be autoincrement and should be readonly property
//Write getter setter for name and salary
//Salary can be set only by child class
//Create two child class permanentEmp and tempEmp
//permanentEmp get bonus of 10%[declare this as static veriable ]
//const maxsalay= 150000.
//Ensure that you are not paying more then 150000 to any employee
//Bonus for tempEmp is 5% sal
//When you load application it should print name of company
//When you give salary it should give SMS and Email to the employee.
//Crate Array of Employee and store all child class object.



using System;

namespace EmployeeApp
{
    abstract class Employee
    {
        private static int idCounter = 1000;
        private readonly int id;
        private string name;
        private double salary;
        protected double netsalary;
        private const double TDS_PERCENT = 0.10;
        public const double MAX_SALARY = 150000;

        static Employee()
        {
            Console.WriteLine("Welcome to: Prabhat Corporation\n");
        }
        public Employee(string name, double salary)
        {
            id = idCounter++;
            Name = name;
            Salary = salary > MAX_SALARY ? MAX_SALARY : salary;
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
            protected set
            {
                if (value > MAX_SALARY)
                    salary = MAX_SALARY;
                else
                    salary = value;
            }
        }
        public double NetSalary => netsalary;
        public virtual void GiveBasicSalary()
        {
            netsalary = Salary - (Salary * TDS_PERCENT);
        }
        public abstract void GiveBonus();

        public void SendNotification()
        {
            Console.WriteLine($"[SMS] Salary processed for {Name}, Net Salary: Rs {netsalary}");
            Console.WriteLine($"[Email] Hello {Name}, your salary of Rs {netsalary} has been credited.\n");
        }
        public override string ToString()
        {
            return $"ID: {Id}, Name: {Name}, Gross Salary: Rs {Salary}, Net Salary: Rs {netsalary}";
        }
    }
    class PermanentEmp : Employee
    {
        public static double BONUS_PERCENT = 0.10;

        public PermanentEmp(string name, double salary)
            : base(name, salary) { }

        public override void GiveBonus()
        {
            netsalary += Salary * BONUS_PERCENT;
        }
    }
    class TempEmp : Employee
    {
        public TempEmp(string name, double salary)
            : base(name, salary) { }

        public override void GiveBonus()
        {
            netsalary += Salary * 0.05;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Employee[] employees = new Employee[4];
            employees[0] = new PermanentEmp("Ali", 140000);
            employees[1] = new TempEmp("Bobby", 90000);
            employees[2] = new PermanentEmp("Charlie", 155000); // Will cap to 150000
            employees[3] = new TempEmp("David", 40000);

            foreach (var emp in employees)
            {
                emp.GiveBasicSalary();
                emp.GiveBonus();
                emp.SendNotification();
                Console.WriteLine(emp);
                Console.WriteLine("--------------------------------------------------");
            }
        }
    }
}
