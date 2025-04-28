//Q1.Create class Customer with member variable Id, Name, MobileNo., Address.
//Write  Getter setter for all member except Id, Id is auto increment.
//Use object initializer syntax to initialise member variable.
//Create Array of Customer class and store 5 object into it.
//Display all customer detail name wise ascending order.


using System;
using System.Linq;

public class Customer
{
    private static int _idCounter = 1;
    public int Id { get; private set; }
    public string Name { get; set; }
    public string MobileNo { get; set; }
    public string Address { get; set; }

    public Customer()
    {
        Id = _idCounter++;
    }
}

class Program
{
    static void Main()
    {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer { Name = "Dlice", MobileNo = "1234567890", Address = "123 Main St" };
        customers[1] = new Customer { Name = "Bob", MobileNo = "2345678901", Address = "234 Main St" };
        customers[2] = new Customer { Name = "Charlie", MobileNo = "3456789012", Address = "345 Main St" };
        customers[3] = new Customer { Name = "David", MobileNo = "4567890123", Address = "456 Main St" };
        customers[4] = new Customer { Name = "Eve", MobileNo = "5678901234", Address = "567 Main St" };

        var sortedCustomers = customers.OrderBy(c => c.Name);

        foreach (var customer in sortedCustomers)
        {
            Console.WriteLine($"Id: {customer.Id}, Name: {customer.Name}, Mobile: {customer.MobileNo}, Address: {customer.Address}");
        }
    }
}