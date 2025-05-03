class Account {
    static counter = 1;
    #id;
    #balanceamt;

    constructor(name, balance) {
        if(new.target === Account) {
            throw new Error("Cannot instantiate directly from Account class.");
        }
        this.#id = Account.counter++;
        this.name = name;
        this.#balanceamt = balance;
    }
    get id() {
        return this.#id;
    }
    getBalance() {
        return this.#balanceamt;
    }
    setBalance(value) {
        this.#balanceamt = value;
    }
    get name() {
        return this._name;
    }
    set name(value) {
        if(value.length > 15) {
            throw new Error("Name should not exceed 15 characters.");
        }
        this._name = value;
    }
    deposit(amount) {
        this.#balanceamt += amount;
    }
    withdraw(amount) {
        if(amount > this.#balanceamt) {
            throw new Error("Insufficient balance.");
        }
        this.#balanceamt -= amount;
    }
    toString() {
        return `Account ID: ${this.#id}, Name: ${this._name}, Balance: ${this.#balanceamt}`;
    }
}


class SavingAccount extends Account {
    constructor(name, balanceamt) {
      super(name, balanceamt < 1000 ? 1000 : balanceamt);
    }
  
    withdraw(amount) {
      if (this.getBalance() - amount < 1000) {
        throw new Error("Minimum balance of 1000 must be maintained");
      }
      this.setBalance(this.getBalance() - amount);
    }
}


class CurrentAccount extends Account {
  constructor(name, balanceamt) {
    super(name, balanceamt);
  }

  withdraw(amount) {
    this.setBalance(this.getBalance() - amount);
  }
}  

document.getElementById("bankName").textContent = "Welcome to JavaScript Bank";

const accounts = [
  new SavingAccount("Brain", 5000),
  new SavingAccount("Dom", 1200),
  new CurrentAccount("Letty", 3000)
];

accounts[0].deposit(2000);
accounts[1].withdraw(100);
accounts[2].withdraw(5000); 

const output = accounts.map(acc => acc.toString()).join("\n");
document.getElementById("output").textContent = output;  
