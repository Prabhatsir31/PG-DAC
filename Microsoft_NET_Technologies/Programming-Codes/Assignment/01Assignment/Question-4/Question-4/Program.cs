//Q4.Accept 10 element in an array and display it in descending order.

using System;

class Program
{
    static void Main()
    {
        int[] numbers = new int[10];
        Console.WriteLine("Enter 10 numbers:");
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = int.Parse(Console.ReadLine());
        }

        Array.Sort(numbers);
        Array.Reverse(numbers);

        Console.WriteLine("Numbers in descending order:");
        foreach (var number in numbers)
        {
            Console.WriteLine(number);
        }
    }
}