//Create a/c class having name and bal which will increase the bal write display method which will display name and bal 

class Account {
    constructor(name, initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    increaseBalance(amount) {
        if (amount > 0) {
            this.balance += amount;
            console.log(`Balance increased by ${amount}. New balance: ${this.balance}`);
        } else {
            console.log("Invalid amount. Please provide a positive number.");
        }
    }

    display() {
        console.log(`Account Holder: ${this.name}`);
        console.log(`Current Balance: ${this.balance}`);
    }
}

// Example usage:
const myAccount = new Account("Raj", 20000);
myAccount.display();
myAccount.increaseBalance(500);
myAccount.display();

// const myAccount1 = new Account("Mona", 20000);
// myAccount1.display();
// myAccount1.increaseBalance(5000);
// myAccount1.display();