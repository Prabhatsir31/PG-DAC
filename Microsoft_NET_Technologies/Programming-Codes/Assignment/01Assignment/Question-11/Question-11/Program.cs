//Q11.Create class logic demo which has method public int[] findfactor(int no) which will return all factor of that number as array.
//It should also return total count of factor. Let entry class print all factors of a number.

using System;

class LogicDemo
{
    public int[] FindFactors(int no)
    {
        int[] factors = new int[no];
        int count = 0;

        for (int i = 1; i <= no; i++)
        {
            if (no % i == 0)
            {
                factors[count] = i;
                count++;
            }
        }

        Array.Resize(ref factors, count);
        return factors;
    }
}

class Program
{
    static void Main()
    {
        LogicDemo logicDemo = new LogicDemo();
        Console.WriteLine("Enter a number to find its factors:");
        int number = int.Parse(Console.ReadLine());

        int[] factors = logicDemo.FindFactors(number);
        Console.WriteLine($"Factors of {number}: {string.Join(", ", factors)}");
        Console.WriteLine($"Total count of factors: {factors.Length}");
    }
}