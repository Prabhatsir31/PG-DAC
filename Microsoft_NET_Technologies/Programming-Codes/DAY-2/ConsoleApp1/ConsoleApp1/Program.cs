//Create enum dep having value[MKT = 1, ADV = 2, ADMN = 3]
//Create a class Employee with instance member id, name, salary and enum dept d.
//Create 5 object of class Employee and put them into different department.
//Write a  sataic method which will display department wise total salary paid
//E.g.
//1, "Raj", 3000, dep.ADMN
//2, "Reena", 2000, dep.ADMN
// 3, "Geeta", 1000, dep.MKT

//O/p ADMN department spend 5000 on salary
//MKT department spend 1000 on salary


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System;

using System;

namespace Employee1
{
    public enum Dep
    {
        MKT = 1,
        ADV = 2,
        ADMN = 3
    }
    public class Employee1
    {
        public int Id;
        public string Name;
        public double Salary;
        public Dep Department;

        public Employee1(int id, string name, double salary, Dep department)
        {
            Id = id;
            Name = name;
            Salary = salary;
            Department = department;
        }
    }

    class Program1
    {
        static void Main(string[] args)
        {
            Employee1[] employees1 = {
                new Employee1(1, "Raj", 3000, Dep.ADMN),
                new Employee1(2, "Reena", 2000, Dep.ADMN),
                new Employee1(3, "Geeta", 1000, Dep.MKT),
                new Employee1(4, "Sam", 1500, Dep.ADV),
                new Employee1(5, "John", 2500, Dep.MKT)
            };

            DeptSal(employees1);
        }

        public static void DeptSal(Employee1[] employees1)
        {
            double totalMKT = 0, totalADV = 0, totalADMN = 0;

            foreach (var emp in employees1)
            {
                switch (emp.Department)
                {
                    case Dep.MKT: totalMKT += emp.Salary; break;
                    case Dep.ADV: totalADV += emp.Salary; break;
                    case Dep.ADMN: totalADMN += emp.Salary; break;
                }
            }

            Console.WriteLine($"ADMN department spent {totalADMN} on salary");
            Console.WriteLine($"MKT department spent {totalMKT} on salary");
            Console.WriteLine($"ADV department spent {totalADV} on salary");
        }
    }
}