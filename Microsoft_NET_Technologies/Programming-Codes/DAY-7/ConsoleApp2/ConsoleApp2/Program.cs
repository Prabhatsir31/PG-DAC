//Create class employee with member Id , EmpName salary and DetId
//Create class Department with member DetId  DeptName[ADV, HR, ADMIN]
//Create array of each class and store 6 object
//Write query and display EmpName and name of Department

using System;
class Employee
{
    public int Id { get; set; }
    public string EmpName { get; set; }
    public decimal Salary { get; set; }
    public int DetId { get; set; } // Foreign key to Department
}

class Department
{
    public int DetId { get; set; }
    public string DeptName { get; set; }
}

class Program
{
    static void Main(string[] args)
    {
        // Create an array of Departments
        Department[] departments = new Department[]
        {
            new Department { DetId = 1, DeptName = "ADV" },
            new Department { DetId = 2, DeptName = "HR" },
            new Department { DetId = 3, DeptName = "ADMIN" }
        };

        // Create an array of Employees
        Employee[] employees = new Employee[]
        {
            new Employee { Id = 1, EmpName = "Honey", Salary = 50000, DetId = 1 },
            new Employee { Id = 2, EmpName = "Bee", Salary = 60000, DetId = 2 },
            new Employee { Id = 3, EmpName = "Marco", Salary = 55000, DetId = 1 },
            new Employee { Id = 4, EmpName = "Yonis", Salary = 70000, DetId = 3 },
            new Employee { Id = 5, EmpName = "Evil", Salary = 65000, DetId = 2 },
            new Employee { Id = 6, EmpName = "Dyna", Salary = 72000, DetId = 3 }
        };

        // Display EmpName and corresponding DeptName
        Console.WriteLine("Employee Name\tDepartment Name");
        Console.WriteLine("--------------------------------");

        foreach (var employee in employees)
        {
            // Find the corresponding department
            var department = Array.Find(departments, d => d.DetId == employee.DetId);
            if (department != null)
            {
                Console.WriteLine($"{employee.EmpName}\t\t{department.DeptName}");
            }
        }
    }
}