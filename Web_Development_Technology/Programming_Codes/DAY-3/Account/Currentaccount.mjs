import { Account } from "./Account.mjs";

export class Currentaccount extends Account {
  type;

  constructor(acctype, fname, lname, amt) {
    super(fname, lname, amt);
    this.type = acctype;
  }

  withdraw(amt) {
    if (amt > this._cbalance) {
      throw new TypeError("Insufficient balance");
    }
    this._cbalance -= amt;
  }
}
