// Accept 5 element in an array and check entered data is in ascending , descending or not sorted
// Accept 5 name from user, accept a name from user and check if that name is there in an array or not
// Accept a sentence from user accept a word from user and count occurrence of that word
// string[] s={ “vidya”, “vita”, “vina” }
// Check repetition of sub string
// vi




using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {

        static void Main(string[] args)
        {
            // 1. Accept 5 elements and check order
            int[] arr = new int[5];
            Console.WriteLine("Enter 5 Numbers: ");
            for (int i = 0; i < 5; i++)
            {
                arr[i] = int.Parse(Console.ReadLine());
            }

            bool ascending=true, descending=true;
            for (int i = 0; i < arr.Length - 1; i++)
            {
                if (arr[i] < arr[i + 1])
                    descending = false;
                else if (arr[i]> arr[i + 1])
                    ascending = false;
            }
            if (ascending)
            {
                Console.WriteLine("Array is in Ascending Order");
            }
            else if (descending)
            {
                Console.WriteLine("Array is in Descending Order");
            }
            else
            {
                Console.WriteLine("Array is Not Sorted");
            }

            // 2. Accept names and search
            string[] names = new string[5];
            Console.WriteLine("\nEnter 5 names:");
            for (int i = 0; i < 5; i++)
                names[i] = Console.ReadLine();

            Console.Write("Enter a name to search: ");
            string search = Console.ReadLine();

            bool found = false;
            foreach (var name in names)
            {
                if (name.Equals(search, StringComparison.OrdinalIgnoreCase))
                {
                    found = true;
                    break;
                }
            }
            Console.WriteLine(found ? "Name found." : "Name not found.");

            // 3. Count word occurrences
            Console.Write("\nEnter a sentence: ");
            string sentence = Console.ReadLine();

            Console.Write("Enter word to count: ");
            string word = Console.ReadLine();

            string[] words = sentence.Split(new[] { ' ', ',', '.', '!', '?' }, StringSplitOptions.RemoveEmptyEntries);
            int count = 0;
            foreach (string w in words)
            {
                if (w.Equals(word, StringComparison.OrdinalIgnoreCase))
                    count++;
            }

            Console.WriteLine($"The word '{word}' occurred {count} times.");


            // 4. Check repetition of substring "vi"
            string[] s = { "vidya", "vita", "vina", "divya", "vinay" };
            string sub = "vi";
            int subCount = 0;

            foreach (var str in s)
            {
                if (str.Contains(sub))
                    subCount++;
            }

            Console.WriteLine($"\nSubstring '{sub}' found in {subCount} strings.");

        }
    }
}
