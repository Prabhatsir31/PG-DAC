"use strict";
var mySet = new Set();
mySet.add(1);
mySet.add(5);
mySet.add("1");
mySet.add("some text");
var o = { a: 1, b: 2 };
mySet.add(o);
mySet.has(1); // true
mySet.has(3); // false, 3 has not been added to the set
mySet.has(5); // true
mySet.has(Math.sqrt(25)); // true
mySet.has("Some Text".toLowerCase()); // true
mySet.has(o); // true
mySet.size; // 5

mySet.delete(5); // removes 5 from the set
mySet.has(5); // false, 5 has been removed
mySet.size; // 4, we just removed one value
for (let item of mySet) console.log(item); // logs the items in the order: 1, "some text"
for (let item of mySet.keys()) console.log(item); // logs the items in the order: 1, "some text"
for (let item of mySet.values()) console.log(item); // Alternative (with Array.from)
var myarray = Array.from(mySet); // [1, "some text"]
console.log(myarray);
