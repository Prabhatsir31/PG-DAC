//2.Create class library calculator it has all static method
//a.printfactoorial(int a) which will return factorial of a number
//b.Power(int n, int p)  which will return power of a number ie np
//c.Create a console application and use this library , display result


using System;

namespace CalculatorLibrary
{
    public static class Calculator
    {
        public static int PrintFactorial(int a)
        {
            return a == 0 ? 1 : a * PrintFactorial(a - 1);
        }

        public static double Power(int n, int p)
        {
            return Math.Pow(n, p);
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Factorial of 5: " + Calculator.PrintFactorial(5));
            Console.WriteLine("2 to the power of 3: " + Calculator.Power(2, 3));
        }
    }
}
