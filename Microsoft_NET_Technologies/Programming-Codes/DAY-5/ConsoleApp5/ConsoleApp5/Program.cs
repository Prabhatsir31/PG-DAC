
//1.Create a delegate
//Delegate int calculator(int);
//Create two static method which will return factorial of a number 
//And 2nd method will return sum of digit 
//Use multicast delegate and print returned value

//2. Create delegate
//delegate bool numbertype(int n);
//Create two static method
//1. bool isodd(int n) { }
//which will print entered number is odd or even and return bool value
//2. bool  isPrime(int n){}
//Which will print entered number is prime or not and return bool value
//Use multicast delegate


using System;


// Task 1: Multicast Delegate for Factorial and Sum of Digits

namespace MulticastDelegateExample
{
    // Step 1: Declare delegate
    public delegate int Calculator(int n);

    class Program
    {
        // Static method: Factorial
        public static int Factorial(int n)
        {
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            Console.WriteLine("Factorial: " + fact);
            return fact;
        }

        // Static method: Sum of digits
        public static int SumOfDigits(int n)
        {
            int sum = 0;
            while (n > 0)
            {
                sum += n % 10;
                n /= 10;
            }
            Console.WriteLine("Sum of Digits: " + sum);
            return sum;
        }

        static void Main(string[] args)
        {
            int num = 5;

            // Create delegate instance and attach methods
            Calculator calc = new Calculator(Factorial);
            calc += SumOfDigits;

            // Only last return value is available in multicast
            int result = calc(num);
            Console.WriteLine("Returned by last delegate method: " + result);
        }
    }
}





// Task 2: Multicast Delegate for isOdd and isPrime


//namespace NumberTypeDelegate
//{
//    // Step 2: Declare delegate
//    public delegate bool NumberType(int n);

//    class Program
//    {
//        // Check if number is odd
//        public static bool IsOdd(int n)
//        {
//            bool result = n % 2 != 0;
//            Console.WriteLine(n + (result ? " is Odd" : " is Even"));
//            return result;
//        }

//        // Check if number is prime
//        public static bool IsPrime(int n)
//        {
//            if (n <= 1) { Console.WriteLine(n + " is not Prime"); return false; }
//            for (int i = 2; i <= Math.Sqrt(n); i++)
//            {
//                if (n % i == 0) { Console.WriteLine(n + " is not Prime"); return false; }
//            }
//            Console.WriteLine(n + " is Prime");
//            return true;
//        }

//        static void Main(string[] args)
//        {
//            int num = 7;

//            // Multicast delegate
//            NumberType typeCheck = new NumberType(IsOdd);
//            typeCheck += IsPrime;

//            // Only last return value will be captured
//            bool finalResult = typeCheck(num);
//            Console.WriteLine("Final return value of delegate: " + finalResult);
//        }
//    }
//}
