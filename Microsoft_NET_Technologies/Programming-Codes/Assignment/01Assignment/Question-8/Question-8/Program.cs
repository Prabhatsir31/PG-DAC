//Q8.Accept a 2 string from user and check if both are same or not .
//if it is different the print message “password and reenter password has to be same” and
//if it is same print message “password updated successfully”.
//Give use 2 more chance if password and reenter password
//Is not same.

using System;

class Program
{
    static void Main()
    {
        int attempts = 0;
        while (attempts < 2)
        {
            Console.WriteLine("Enter password:");
            string password = Console.ReadLine();
            Console.WriteLine("Re-enter password:");
            string rePassword = Console.ReadLine();

            if (password == rePassword)
            {
                Console.WriteLine("Password updated successfully.");
                break;
            }
            else
            {
                Console.WriteLine("Password and re-enter password have to be the same.");
                attempts++;
            }
        }
    }
}