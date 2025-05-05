"use script";
var myMap = new Map();
myMap.set(0, "zero");
myMap.set(1, "one");
for (var [key, value] of myMap) {
  console.log(key + " = " + value);
} // Will show 2 logs; first with "0 = zero" and second with "1 = one"
for (var key of myMap.keys()) {
  console.log(key);
} // Will show 2 logs; first with "0" and second with "1"
for (var value of myMap.values()) {
  console.log(value);
} // Will show 2 logs; first with "zero" and second with "one"
for (var [key, value] of myMap.entries()) {
  console.log(key + " = " + value);
}
