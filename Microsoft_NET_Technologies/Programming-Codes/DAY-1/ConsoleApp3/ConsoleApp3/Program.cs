using System;


namespace Calculator
{
    public class Calc
    {
        float a;
        public void sqr(string s)
        {
            bool a1 = float.TryParse(s, out a);
            if (a1 = true)
            {
                Console.WriteLine(a * a);
            }
        }

        public void cube(string s)
        {
            bool a1 = float.TryParse(s, out a);
            if (a1 = true)
            {
                Console.WriteLine(a * a * a);
            }
        }

        public void round(string s)
        {
            bool a1 = float.TryParse(s, out a);
            if (a1 = true)
            {
                int b = (int)a;
                Console.WriteLine(b);
            }

        }
    }
}
