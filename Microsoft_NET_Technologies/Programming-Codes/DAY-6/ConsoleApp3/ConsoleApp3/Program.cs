// Factorial Program using Lambda

using System;

class Program
{
    static int Factorial(int number)
    {
        int result = 1;
        for (int i = 1; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }

    static void Main(string[] args)
    {
        int num = 5;
        int fact = Factorial(num);
        Console.WriteLine("Factorial of " + num + " is: " + fact);
    }
}
