//.int a, b;
//a = 5;
//b = a;

//Create class student with private member variable
//Prn_no,
//(subjects)
//Java, c#, Html
//Total
//Percentage

using System;

namespace Student
{
    public class Student
    {
        int prnNo;
        double javaScore;
        double cSharpScore;
        double htmlScore;
        double total;
        double percentage;

        public Student(int prnNo, double javaScore, double cSharpScore, double htmlScore)
        {
            this.prnNo = prnNo;
            this.javaScore = javaScore;
            this.cSharpScore = cSharpScore;
            this.htmlScore = htmlScore;
            CalculateTotalAndPercentage();
        }

        private void CalculateTotalAndPercentage()
        {
            total = javaScore + cSharpScore + htmlScore;
            percentage = (total / 300) * 100;
        }
        public int getPrnNo()
        {
            return prnNo;
        }

        public double getJavaScore()
        {
            return javaScore;
        }

        public double getCSharpScore()
        {
            return cSharpScore;
        }

        public double getHtmlScore()
        {
            return htmlScore;
        }

        public double getTotal()
        {
            return total;
        }

        public double getPercentage()
        {
            return percentage;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Student student1 = new Student(101, 85, 90, 80);

            Console.WriteLine($"PRN No: {student1.getPrnNo()}");
            Console.WriteLine($"Java Score: {student1.getJavaScore()}");
            Console.WriteLine($"C# Score: {student1.getCSharpScore()}");
            Console.WriteLine($"HTML Score: {student1.getHtmlScore()}");
            Console.WriteLine($"Total: {student1.getTotal()}");
            Console.WriteLine($"Percentage: {student1.getPercentage()}%");
        }
    }
}
