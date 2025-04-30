import { Account } from "./Account.mjs";

export class Savingaccount extends Account {
  type;

  constructor(acctype, fname, lname, amt) {
    super(fname, lname, amt);
    this.type = acctype;
  }

  withdraw(amt) {
    const minbal = 1000;
    if (amt > this._cbalance - minbal) {
      throw new TypeError("Withdrawal amount exceeds minimum balance.");
    }
    this._cbalance -= amt;
  }
}
