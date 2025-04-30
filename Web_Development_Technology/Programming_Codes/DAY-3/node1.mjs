console.log("Hello");

'use strict'
class Account
{ 
   constructor(name,amt)
  {
  this.name=name;
  this.balance=amt;
  alert(typeof this.constructor)
    }
}
var obj1=new Account("raj",20000);
console.log(obj1);
document.write(obj1 instanceof Account);//true
document.write(obj1 instanceof Object);//true
obj1.name="geeta";
console.log(obj1);
document.write(obj1); //object Object 
var obj2=new Account("Mona",50000);
document.write(obj2.name);
console.log(new Object());
