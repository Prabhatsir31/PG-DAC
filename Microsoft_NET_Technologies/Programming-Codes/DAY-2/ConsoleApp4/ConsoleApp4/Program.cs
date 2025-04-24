using System;

namespace Program4
{
    public class Student4
    {
        private string name;
        private double maths;
        private double science;
        private double english;

        public Student4(string name, double maths, double science, double english)
        {
            this.name = name;
            this.maths = maths;
            this.science = science;
            this.english = english;
        }
        public double GetTotalMarks()
        {
            return maths + science + english;
        }
        public void Display()
        {
            Console.WriteLine($"Name: {name}, Total Marks: {GetTotalMarks()}");
        }
    }

    class Program4
    {
        static void Main(string[] args)
        {
            Student4 student1 = new Student4("Alice", 85, 90, 80);
            Student4 student2 = new Student4("Bob", 75, 85, 95);

            student1.Display();
            student2.Display();
        }
    }
}
