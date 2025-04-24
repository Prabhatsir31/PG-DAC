using System;

namespace demo2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string x, y;
            float f, g;
            Console.WriteLine("enter 2 numbers");
            x = Console.ReadLine();
            y = Console.ReadLine();

            //bool a1= float .TryParse(x, out f);
            //bool a2= float .TryParse(y, out g);

            if (float.TryParse(x, out f) == true && float.TryParse(y, out g) == true)
            {
                Console.WriteLine(f + g);
            }
        }
    }
}
