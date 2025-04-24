using System;
using Calculator;

namespace CalcDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Calc c1 = new Calc();
            c1.sqr("13");

            c1.cube("7");

            c1.round("35.7657834");
        }
    }
}
