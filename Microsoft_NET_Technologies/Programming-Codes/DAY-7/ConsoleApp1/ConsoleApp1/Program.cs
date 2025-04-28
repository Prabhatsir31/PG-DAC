// Q) write a arrow fun which return fact of a number 
// Q) write a lambda expression which will accept two string and return concatenated string.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace arrowfun
{
    class program
    {
        static void Main(string[] args)
        {
            Func <int , int> fa = new Func<int , int>(Fact);
            int r = fa(5);
            Console.WriteLine(r);
            Func<String, String, String> str = (s, s1) => (s + s1);
            Predicate<int> isodd = (n) => (n % 2 != 0);
            bool b = isodd(5);

            Action<int> sqr = (n) => Console.WriteLine(n * n);

            string rs = str("hello", "hii");
            Console.WriteLine(rs);
        }

        static int Fact(int x) {
            int f = 1;
            for (int i = 1; i <= x; i++)
            {
                f = f * i;
            }
            return f;

    }
}
