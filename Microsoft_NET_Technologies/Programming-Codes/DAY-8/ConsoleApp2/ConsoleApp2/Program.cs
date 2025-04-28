using System;
using System.Linq;

class ProductInfo
{
    public string Name { get; set; }
    public string Description { get; set; }
    public int NumberInStock { get; set; }

    public override string ToString()
    {
        return string.Format("Name={0}, Description={1}, Number in Stock={2}",
        Name, Description, NumberInStock);
    }
}

class Entry
{
    static void Main(string[] args)
    {
        Console.WriteLine("***** Fun with Query Expressions *****\n");

        // This array will be the basis of our testing...
        ProductInfo[] itemsInStock = new[]
        {
            new ProductInfo{ Name = "Mac's Coffee", Description = "Coffee with TEETH", NumberInStock = 24},
                        new ProductInfo { Name = "Milk Maid Milk", Description = "Milk cow's love", NumberInStock = 100},
            new ProductInfo{ Name = "Pure Silk Tofu",  Description = "Bland as Possible", NumberInStock = 120},
            new ProductInfo{ Name = "Crunchy Pops",  Description = "Cheezy, peppery goodness", NumberInStock = 2},
            new ProductInfo{ Name = "RipOff Water",   Description = "From the tap to your wallet", NumberInStock = 100},
            new ProductInfo{ Name = "Classic Valpo Pizza", Description = "Everyone loves pizza!", NumberInStock = 73}
        };

        // Q1. Display all product details
        var r1 = from g in itemsInStock select g;

        // Q2. Display all product names
        var r2 = from g in itemsInStock select g.Name;

        // Q3. All product part of data as anonymous object
        var b = from r in itemsInStock select new { name = r.Name, des = r.Description };

        // Q4. Display all product Name and Description where NumberInStock = 100 as anonymous object
        var r4 = from r in itemsInStock where r.NumberInStock == 100 select new { r.Name, r.Description };

        // Q5. Display all product names having letter ‘s’ in its name in ascending order
        var r5 = from r in itemsInStock where r.Name.Contains('s') orderby r.Name ascending select r.Name;

        // Q6. Display all product names having letter ‘s’ in its name in descending order
        var r6 = from r in itemsInStock where r.Name.Contains('s') orderby r.Name descending select r.Name;

        var r61 = itemsInStock.Where(g => g.Name.Contains('s')).OrderByDescending(G => G.Name).Select(g => g);


        // Q7. Count all products whose stock is < 100
        var r7 = itemsInStock.Count(r => r.NumberInStock < 100);

        // Q8. Show max, min, and average value of NumberInStock
        var maxStock = itemsInStock.Max(r => r.NumberInStock);
        var minStock = itemsInStock.Min(r => r.NumberInStock);
        var avgStock = itemsInStock.Average(r => r.NumberInStock);

        Console.WriteLine("\n************************ Q1 - Q3 **************************\n");
        foreach (var item in r1) // Use r1 instead of r
        {
            Console.WriteLine(item); // This will call ToString() method
        }
        Console.WriteLine("\n************************ Q4 - Q8 **************************\n");
        // Display results for Q4 to Q8
        Console.WriteLine("\nProducts with 100 in stock:");
        foreach (var item in r4)
        {
            Console.WriteLine(item);
        }

        Console.WriteLine("\n************************ Q5 **************************\n");
        Console.WriteLine("\nProduct names containing 's' (ascending):");
        foreach (var name in r5)
        {
            Console.WriteLine(name);
        }

        Console.WriteLine("\n************************ Q6 **************************\n");
        Console.WriteLine("\nProduct names containing 's' (descending):");
        foreach (var name in r6)
        {
            Console.WriteLine(name);
        }
        Console.WriteLine("\nProduct names containing 's' (descending):");
        foreach (var name in r61)
        {
            Console.WriteLine(name);
        }
            
        Console.WriteLine("\n************************ Q7 **************************\n");
        Console.WriteLine($"\nCount of products with stock < 100: {r7}");

        Console.WriteLine("\n************************ Q8 **************************\n");
        Console.WriteLine($"Max stock: {maxStock}");
        Console.WriteLine($"Min stock: {minStock}");
        Console.WriteLine($"Avg stock: {avgStock}");
    }
}