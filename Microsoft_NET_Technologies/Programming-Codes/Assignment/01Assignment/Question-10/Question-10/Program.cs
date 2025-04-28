//Q10.Create class Mycalculator with method Add(). Write this method in such a way that when user enter 2 int then it should return
//sum of 2 number , if user enter 3 number the it should return sum of 3 number. Ie. User may enter any number of parameter in all
//situation Add method should work and return sum of the parameter.

using System;

class MyCalculator
{
    public int Add(params int[] numbers)
    {
        int sum = 0;
        foreach (var number in numbers)
        {
            sum += number;
        }
        return sum;
    }
}

class Program
{
    static void Main()
    {
        MyCalculator calculator = new MyCalculator();
        Console.WriteLine("Sum of 2 numbers: " + calculator.Add(5, 10));
        Console.WriteLine("Sum of 3 numbers: " + calculator.Add(1, 2, 3));
        Console.WriteLine("Sum of 4 numbers: " + calculator.Add(1, 2, 3, 4));
    }
}