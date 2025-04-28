using System;
using EmployeeCrud.Services;

namespace EmployeeCrud
{
    class Program
    {
        static void Main()
        {
            EmployeeService service = new EmployeeService();
            bool exit = false;

            while (!exit)
            {
                Console.WriteLine("\n===== Employee Management System =====");
                Console.WriteLine("1. Add Employee");
                Console.WriteLine("2. View All Employees");
                Console.WriteLine("3. Update Employee");
                Console.WriteLine("4. Delete Employee");
                Console.WriteLine("5. Get Employee by ID");
                Console.WriteLine("6. Exit");
                Console.Write("Choose an option: ");

                switch (Console.ReadLine())
                {
                    case "1":
                        Console.Write("Enter name: ");
                        string name = Console.ReadLine();
                        Console.Write("Enter salary: ");
                        if (double.TryParse(Console.ReadLine(), out double salary))
                        {
                            service.Add(name, salary);
                            Console.WriteLine("Employee added.");
                        }
                        else
                        {
                            Console.WriteLine("Invalid salary.");
                        }
                        break;

                    case "2":
                        Console.WriteLine("\n--- All Employees ---");
                        foreach (var emp in service.GetAll())
                            Console.WriteLine(emp);
                        break;

                    case "3":
                        Console.Write("Enter ID to update: ");
                        if (int.TryParse(Console.ReadLine(), out int updateId))
                        {
                            Console.Write("New Name: ");
                            string newName = Console.ReadLine();
                            Console.Write("New Salary: ");
                            if (double.TryParse(Console.ReadLine(), out double newSalary))
                            {
                                bool updated = service.Update(updateId, newName, newSalary);
                                Console.WriteLine(updated ? "Updated." : "Employee not found.");
                            }
                            else Console.WriteLine("Invalid salary.");
                        }
                        else Console.WriteLine("Invalid ID.");
                        break;

                    case "4":
                        Console.Write("Enter ID to delete: ");
                        if (int.TryParse(Console.ReadLine(), out int deleteId))
                        {
                            bool deleted = service.Delete(deleteId);
                            Console.WriteLine(deleted ? "Deleted." : "Employee not found.");
                        }
                        else Console.WriteLine("Invalid ID.");
                        break;

                    case "5":
                        Console.Write("Enter ID to search: ");
                        if (int.TryParse(Console.ReadLine(), out int searchId))
                        {
                            var emp = service.GetById(searchId);
                            Console.WriteLine(emp != null ? emp.ToString() : "Not found.");
                        }
                        else Console.WriteLine("Invalid ID.");
                        break;

                    case "6":
                        exit = true;
                        break;

                    default:
                        Console.WriteLine("Invalid option. Try again.");
                        break;
                }
            }

            Console.WriteLine("Exiting...");
        }
    }
}
