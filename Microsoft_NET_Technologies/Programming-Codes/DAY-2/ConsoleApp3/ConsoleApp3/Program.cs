using System;

namespace Program3
{
    public class Student3
    {
        private int prnNo;
        private double javaScore;
        private double cSharpScore;
        private double htmlScore;
        private double total;
        private double percentage;

        public Student3(int prnNo, double javaScore, double cSharpScore, double htmlScore)
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
        public void get_total()
        {
            Console.WriteLine($"Total: {total}");
        }
        public void get_percentage()
        {
            Console.WriteLine($"Percentage: {percentage}%");
        }
        public string display()
        {
            return $"PRN No: {prnNo}, Total: {total}, Percentage: {percentage}%";
        }
    }

    class Program3
    {
        static void Main(string[] args)
        {
            Student3 student1 = new Student3(101, 85, 90, 80);
            Student3 student2 = new Student3(102, 75, 85, 95);

            Console.WriteLine(student1.display());
            Console.WriteLine(student2.display());
        }
    }
}