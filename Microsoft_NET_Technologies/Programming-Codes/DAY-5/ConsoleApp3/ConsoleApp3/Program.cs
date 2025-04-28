// Solve above program by making above method as instance method.
// Public static int add() { a + b; }
// Public static int product() { a* b}

using System;

namespace DelegateInstanceMethod
{
    // Declare a delegate
    public delegate int OperationDelegate(int a, int b);

    // Class with instance methods
    class Calculator
    {
        public int Add(int a, int b)
        {
            return a + b;
        }

        public int Product(int a, int b)
        {
            return a * b;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Calculator calc = new Calculator();

            // Delegate pointing to instance methods
            OperationDelegate delAdd = calc.Add;
            OperationDelegate delProduct = calc.Product;

            // Call using delegate
            Console.WriteLine("Addition: " + delAdd(5, 3));
            Console.WriteLine("Product: " + delProduct(5, 3));
        }
    }
}

