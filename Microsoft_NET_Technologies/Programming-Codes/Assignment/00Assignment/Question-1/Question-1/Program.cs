//Q1.Create class student with private member variable Prn_no, (subjects) Java, c#, Html ,Total, Percentage. 
//Write parameterized constructor and initialized instance member. Write method public void get_total() which 
//will set Total Percentage variable Write method public void get_percentage() which will set Percentage variable 
//Write method public string display() which will display Prn_no ,total and percentage Create 2 object of a class and display record.

using System;

namespace StudentManagement
{
    public class Student
    {
        private int Prn_no;
        private float Java, CSharp, Html; 
        private float Total;
        private float Percentage;

        public Student(int prn, float java, float csharp, float html)
        {
            Prn_no = prn;
            Java = java;
            CSharp = csharp;
            Html = html;
        }

        public void GetTotal()
        {
            Total = Java + CSharp + Html;
        }

        public void GetPercentage()
        {
            Percentage = (Total / 300) * 100; // Assuming each subject is out of 100
        }

        public string Display()
        {
            return $"PRN: {Prn_no}, Total: {Total}, Percentage: {Percentage}%";
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Student student1 = new Student(1, 85, 90, 80);
            student1.GetTotal();
            student1.GetPercentage();

            Student student2 = new Student(2, 75, 80, 65);
            student2.GetTotal();
            student2.GetPercentage();

            Console.WriteLine(student1.Display());
            Console.WriteLine(student2.Display());
        }
    }
}