
//Create class Account having member id, name, balance.
//Id autoincrement write read only property
//Write getter setter for name and balance.
//Balance can be modified only by child class.
//This has virtual void withdraw method which will  display “I don’t know how to withdraw”.
//It has deposit method.
//Create two child class current and saving and override withdraw method.
//In Savin account minimum balance of 1000 need to maintain. 
//Create reference of Account class and point to saving account
//and  current account. Using parent’s reference call withdraw method and deposit method.
//Use ToString method to display status of the object [id name balance]
//Create Array of account class and store child class object and using parent reference call withdraw and deposit method
//Also create Array of Account class and store 3 child object in array.
//Call deiposit and withdraw using array reference. 


using System;

namespace BankSystem
{
    class Account
    {
        private static int counter = 0;
        private int id;
        private string name;
        protected double balance;

        public Account(string name, double balance)
        {
            this.id = ++counter;
            this.name = name;
            this.balance = balance;
        }

        public int Id => id;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public double Balance => balance; // Only child classes can modify

        public virtual void Withdraw(double amount)
        {
            Console.WriteLine("I don’t know how to withdraw.");
        }

        public void Deposit(double amount)
        {
            if (amount > 0)
                balance += amount;
        }

        public override string ToString()
        {
            return $"ID: {id}, Name: {name}, Balance: Rs {balance}";
        }
    }

    class SavingAccount : Account
    {
        private const double minBalance = 1000;
        public SavingAccount(string name, double balance) : base(name, balance) { }
        public override void Withdraw(double amount)
        {
            if (amount > 0 && balance - amount >= minBalance)
            {
                balance -= amount;
            }
            else
            {
                Console.WriteLine("Cannot withdraw. Minimum balance of Rs. 1000 must be maintained.");
            }
        }
    }

    class CurrentAccount : Account
    {
        public CurrentAccount(string name, double balance) : base(name, balance) { }

        public override void Withdraw(double amount)
        {
            if (amount > 0)
            {
                balance -= amount; // Negative allowed
            }
        }
    }

    class Program
    {
        static void Main()
        {
            Account acc1 = new SavingAccount("Amit", 5000);
            Account acc2 = new CurrentAccount("Priya", 4000);

            acc1.Deposit(1000);
            acc1.Withdraw(2000);

            acc2.Deposit(2000);
            acc2.Withdraw(7000); // Allowed in current

            Console.WriteLine("\n--- Account Details ---");
            Console.WriteLine(acc1);
            Console.WriteLine(acc2);

            // Array of Account holding child objects
            Account[] accounts = new Account[3];
            accounts[0] = new SavingAccount("Ravi", 7000);
            accounts[1] = new CurrentAccount("Meena", 6000);
            accounts[2] = new SavingAccount("John", 3000);

            Console.WriteLine("\n--- Using Array Reference ---");
            foreach (var acc in accounts)
            {
                acc.Deposit(1000);
                acc.Withdraw(2000);
                Console.WriteLine(acc);
            }
        }
    }
}

