// Delegate Event 
using System;

namespace ConsoleApp1
{
    delegate void WithdrawHandler(double amount, double balance, string name);
    abstract class Account
    {
        public event WithdrawHandler withdrawEvent;
        private static int globalId = 0;
        private int accId;
        private string _name;
        private double _balance;
        protected const double min_balance = 1000;

        public Account(string name, double balance)
        {
            if (balance <= 0)
                throw new ArgumentException("Initial balance must be greater than 0");

            accId = ++globalId;
            this._name = name;
            this._balance = balance;
        }
        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }
        public double Balance
        {
            get { return _balance; }
            set { _balance = value; }
        }
        public void Deposit(double amount)
        {
            if (amount <= 0)
                throw new ArgumentException("Cannot deposit zero or negative amount");

            _balance += amount;
            Console.WriteLine($"Deposited {amount} to {_name}'s account. New balance: {_balance}");
        }
        public void OnWithdraw(double amount)
        {
            withdrawEvent?.Invoke(amount, _balance, _name);
        }
        public abstract void Withdraw(double amount);
    }

    class Saving : Account
    {
        public Saving(string name, double balance) : base(name, balance) { }

        public override void Withdraw(double amount)
        {
            if (amount <= 0)
                throw new ArgumentException("Withdraw amount must be positive");

            if (Balance - amount < min_balance)
                throw new InvalidOperationException("Cannot withdraw beyond minimum balance");

            Balance -= amount;
            Console.WriteLine($"{Name} withdrew {amount}. New balance: {Balance}");
            OnWithdraw(amount);
        }
    }

    class Current : Account
    {
        public Current(string name, double balance) : base(name, balance) { }
        public override void Withdraw(double amount)
        {
            if (amount <= 0)
                throw new ArgumentException("Withdraw amount must be positive");

            if (Balance - amount < min_balance)
                throw new InvalidOperationException("Cannot withdraw beyond minimum balance");

            Balance -= amount;
            Console.WriteLine($"{Name} withdrew {amount}. New balance: {Balance}");
            OnWithdraw(amount);
        }
    }

    class Message
    {
        public void Email(double amount, double balance, string name)
        {
            Console.WriteLine($"[Email] {name} withdrew {amount}. Remaining balance: {balance}");
        }
        public void Mobile(double amount, double balance, string name)
        {
            Console.WriteLine($"[SMS] {name} withdrew {amount}. Remaining balance: {balance}");
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            Message m = new Message();

            Account[] accounts = new Account[3];
            accounts[0] = new Saving("A", 35000);
            accounts[1] = new Saving("B", 18000);
            accounts[2] = new Current("C", 40000);

            foreach (var acc in accounts)
            {
                acc.withdrawEvent += m.Email;
                acc.withdrawEvent += m.Mobile;
            }

            accounts[0].Deposit(10000);
            accounts[1].Withdraw(1000);
            accounts[2].Withdraw(12000);

            Console.ReadLine();
        }
    }
}
