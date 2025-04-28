// Create class Account having member variable id, name, balance
// Id is autoincrement it has getter property
// Name and balance need getter setter property
// Declare static double intrate = 0.07; 
// It has deposit method who’s job is to increase balance.Create two child class Savingaccount, Currentaccount
// It has fields typeofaccount.In Savingaccount, child class it has withdraw method who’s job is to reduce balance. It is a rule to maintain minimum balance of rs1000 so declare
// const int minbal=1000 In Currentaccount, child class it has withdraw method who’s job is to reduce balance here –ve balance is allowed.
// Create object of two child class and do the transaction
// In Account class write public override string ToString() { }
// which will display id name balance.

using System;

namespace BankApp
{
    class Account
    {
        private static int idCounter = 0;
        private int id;
        private string name;
        private double balance;
        public static double intrate = 0.07;

        public Account(string name, double balance)
        {
            id = ++idCounter;
            this.name = name;
            this.balance = balance;
        }

        public int Id => id; 

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public double Balance
        {
            get { return balance; }
            set { balance = value; }
        }

        public void Deposit(double amount)
        {
            if (amount > 0)
                balance += amount;
            else
                Console.WriteLine("Deposit amount must be greater than 0.");
        }

        public override string ToString()
        {
            return $"ID: {id}, Name: {name}, Balance: Rs {balance}";
        }
    }

    class SavingAccount : Account
    {
        public const int minbal = 1000;
        public string TypeOfAccount { get; set; }

        public SavingAccount(string name, double balance) : base(name, balance)
        {
            TypeOfAccount = "Saving";
        }

        public void Withdraw(double amount)
        {
            if (amount > 0 && Balance - amount >= minbal)
                Balance -= amount;
            else
                Console.WriteLine("Insufficient balance. Minimum balance of 1000 must be maintained.");
        }
    }

    class CurrentAccount : Account
    {
        public string TypeOfAccount { get; set; }

        public CurrentAccount(string name, double balance) : base(name, balance)
        {
            TypeOfAccount = "Current";
        }

        public void Withdraw(double amount)
        {
            if (amount > 0)
                Balance -= amount;
            else
                Console.WriteLine("Withdraw amount must be greater than 0.");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            SavingAccount s1 = new SavingAccount("Ravi", 5000);
            CurrentAccount c1 = new CurrentAccount("Priya", 3000);

            s1.Deposit(2000);
            c1.Deposit(1000);

            s1.Withdraw(2500);  
            c1.Withdraw(5000);  

            Console.WriteLine("\n--- Account Details ---");
            Console.WriteLine(s1);
            Console.WriteLine(c1);
        }
    }
}
