//Q1. Write function bigno(){} which will accept 5 number and return max value. This function should work even if you pass different number of argument.
//[solve above code using argument and rest parameter]

const bigno = (...nums) => {
  if (nums.length === 0) {
    return undefined;
  }

  let max = nums[0];

  for (let i = 1; i < nums.length; i++) {
    if (nums[i] > max) {
      max = nums[i];
    }
  }

  return max;
}

// Test cases
console.log(`Greater Number is ${bigno(12, 15, 27, 39, 45)}`);       // Output: 45
//console.log(`Greater Number is ${bigno(7, 8, 9, 10)}`);              // Output: 10
//console.log(`Greater Number is ${bigno(1, 2, 3, 4, 5)}`);            // Output: 5
//console.log(`Greater Number is ${bigno(99, 88, 77, 66, 55)}`);       // Output: 99
//console.log(`Greater Number is ${bigno(100, 100, 100, 100, 100)}`);  // Output: 100
//console.log(`Greater Number is ${bigno(34, 43, 11, 76, 99)}`);       // Output: 99
console.log(`Number is ${bigno()}`);                         // Output: undefined
