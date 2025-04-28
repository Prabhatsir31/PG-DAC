//Create class mymath having instance member a, b
//Create two instance method
// a.  Public int add() ==return sum of two number
// b. .  Public int product()==return a*b;

//Declare delegate which can point to this method.
//Using reference of delegate call this method and print result

using System;

namespace DelegateExample
{
    // Declare delegate
    public delegate int MyDelegate();

    // Define MyMath class
    class MyMath
    {
        private int a, b;

        // Constructor to initialize a and b
        public MyMath(int x, int y)
        {
            a = x;
            b = y;
        }

        // Instance method: Add
        public int Add()
        {
            return a + b;
        }

        // Instance method: Product
        public int Product()
        {
            return a * b;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Create object
            MyMath obj = new MyMath(10, 5);

            // Delegate instance pointing to Add method
            MyDelegate d1 = obj.Add;
            Console.WriteLine("Sum = " + d1());

            // Delegate instance pointing to Product method
            MyDelegate d2 = obj.Product;
            Console.WriteLine("Product = " + d2());
        }
    }
}
