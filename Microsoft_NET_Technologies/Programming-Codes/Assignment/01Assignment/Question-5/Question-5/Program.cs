//Q5.Accept 10 name in array , accept a name to be searched. If name is there in an array print message name is in list.

using System;

class Program
{
    static void Main()
    {
        string[] names = new string[10];
        Console.WriteLine("Enter 10 names:");
        for (int i = 0; i < 10; i++)
        {
            names[i] = Console.ReadLine();
        }

        Console.WriteLine("Enter a name to search:");
        string searchName = Console.ReadLine();

        if (Array.Exists(names, name => name.Equals(searchName, StringComparison.OrdinalIgnoreCase)))
        {
            Console.WriteLine("Name is in the list.");
        }
        else
        {
            Console.WriteLine("Name is not in the list.");
        }
    }
}