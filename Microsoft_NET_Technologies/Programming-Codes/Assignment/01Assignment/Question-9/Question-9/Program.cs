//Q9.Create Console Appplication for Capgemini_HR._DEPT
//Create an  abstract class Employee having member
//a. Id [Let your application generate id, it is readonly]
//b.Name[write getter, setter Method Give Validation Length of  name can not be less then 2 and greater then 15]
//c.Salary[write getter, setter, you can not set value  outside class other than child class]
//d.NetSalary[write getter, setter, you can not set value  outside class other than child class]
//It has two methods
//1. public abstract double GiveBonus(double amt);
//2. public void CalculateSalary(double amt) { }
//This method will deduct 10% TDS and retun tax amount and set NetSalary
//Create two child class permanentemployee  and Contractemployee.
//When user get bonus they should get SMS and EMAIL about bonus given  and final mount of  salary. 
//When you run application it should display name of Company.
//Create Array of Employee class and store child Object All employee will have initial salary 20000.
//DO Transaction.  Call method CalculateSalary and deduct 10% of salary and set netsalary.
//Call givebounus method ensure no one will get bonus more then 5000/-
//Permanent employee get bonus plus 3% incentive. Let this method return amount of bonus and also increase NetSalary
//Declare TDS as public static
//Where ever data is not valid throw exception.
//Ensure your application handle all necessary exception


using System;

public abstract class Employee
{
    private static int _idCounter = 1;
    public int Id { get; private set; }
    public string Name { get; set; }
    public double Salary { get; set; }
    public double NetSalary { get; set; }
    public static double TDS = 0.10;

    public Employee(string name, double salary)
    {
        Id = _idCounter++;
        Name = name;
        Salary = salary;
    }

    public abstract double GiveBonus(double amt);

    public void CalculateSalary()
    {
        double tax = Salary * TDS;
        NetSalary = Salary - tax;
    }
}

public class PermanentEmployee : Employee
{
    public PermanentEmployee(string name, double salary) : base(name, salary) { }

    public override double GiveBonus(double amt)
    {
        double bonus = Math.Min(amt + (Salary * 0.03), 5000);
        NetSalary += bonus;
        Console.WriteLine($"Bonus given: {bonus}");
        return bonus;
    }
}

public class ContractEmployee : Employee
{
    public ContractEmployee(string name, double salary) : base(name, salary) { }

    public override double GiveBonus(double amt)
    {
        double bonus = Math.Min(amt, 5000);
        NetSalary += bonus;
        Console.WriteLine($"Bonus given: {bonus}");
        return bonus;
    }
}

class Program
{
    static void Main()
    {
        Console.WriteLine("Welcome to Capgemini HR Department");
        Employee[] employees = new Employee[3];
        employees[0] = new PermanentEmployee("John", 20000);
        employees[1] = new ContractEmployee("Jane", 20000);
        employees[2] = new PermanentEmployee("Alice", 20000);

        foreach (var employee in employees)
        {
            employee.CalculateSalary();
            employee.GiveBonus(4000);
            Console.WriteLine($"Id: {employee.Id}, Name: {employee.Name}, Net Salary: {employee.NetSalary}");
        }
    }
}