export class Account {
  #firstname;
  #lastname;
  #balance;
  #id;
  static #aid = 0;

  constructor(fname, lname, amt) {
    this.firstname = fname;
    this.lastname = lname;
    this._cbalance = amt;
    this.#id = ++Account.#aid;
  }

  set firstname(value) {
    this.#firstname = value;
  }
  get firstname() {
    return this.#firstname;
  }

  set lastname(value) {
    this.#lastname = value;
  }
  get lastname() {
    return this.#lastname;
  }

  set _cbalance(value) {
    this.#balance = value;
  }
  get _cbalance() {
    return this.#balance;
  }

  get gid() {
    return this.#id;
  }

  deposit(amt) {
    this._cbalance += amt;
  }

  toString() {
    return `${this.gid} ${this.firstname} ${this.lastname} ${this._cbalance}`;
  }
}
