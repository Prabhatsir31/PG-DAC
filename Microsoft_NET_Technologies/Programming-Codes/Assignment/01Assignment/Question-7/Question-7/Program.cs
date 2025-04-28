//Q7.Create enum dep having value[MKT = 1, ADV = 2, ADMN = 3]
//Create a class Employee with instance member id, name, salary and enum dept d.
//Create 5 object of class Employee and put them into different department.
//Write a  sataic method which will display department wise total salary paid
//E.g.
//1, "Raj", 3000, dep.ADMN
//2, "Reena", 2000, dep.ADMN
//3, "Geeta", 1000, dep.MKT
//O/p ADMN department spend 5000 on salary
//MKT department spend 1000 on salary

using System;

public enum Department
{
    MKT = 1,
    ADV = 2,
    ADMN = 3,
    ADNM = 4
}

public class Employee
{
    public int Id { get; private set; }
    public string Name { get; set; }
    public double Salary { get; set; }
    public Department Dept { get; set; }

    private static int _idCounter = 1;

    public Employee(string name, double salary, Department dept)
    {
        Id = _idCounter++;
        Name = name;
        Salary = salary;
        Dept = dept;
    }
}

class Program
{
    static void Main()
    {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Raj", 3000, Department.ADNM);
        employees[1] = new Employee("Reena", 2000, Department.ADNM);
        employees[2] = new Employee("Geeta", 1000, Department.MKT);
        employees[3] = new Employee("Sam", 1500, Department.ADV);
        employees[4] = new Employee("Tina", 2500, Department.MKT);

        double totalAdmn = 0, totalMkt = 0, totalAdv = 0;

        foreach (var employee in employees)
        {
            switch (employee.Dept)
            {
                case Department.ADNM:
                    totalAdmn += employee.Salary;
                    break;
                case Department.MKT:
                    totalMkt += employee.Salary;
                    break;
                case Department.ADV:
                    totalAdv += employee.Salary;
                    break;
            }
        }

        Console.WriteLine($"ADMN department spent {totalAdmn} on salary");
        Console.WriteLine($"MKT department spent {totalMkt} on salary");
        Console.WriteLine($"ADV department spent {totalAdv} on salary");
    }
}