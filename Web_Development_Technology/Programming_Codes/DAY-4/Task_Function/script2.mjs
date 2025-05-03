// Q2. Write function fact(){} which will accept a number and return factorial of a number.

function fact(num) {
    if (num === 0 || num === 1) {
        return 1;  // ✅ Base case to stop recursion
    }
    return num * fact(num - 1);  // Recursive call
}

// Example usage:
//console.log(fact(5)); // Output: 120



console.log("Factorial of 5 is " + fact(5)); // Output: 120

console.log("Factorial of 0 is " + fact(0)); // Output: 1

console.log("Factorial of 1 is " + fact(1)); // Output: 1

// console.log("Factorial of -5 is " + fact(-5)); // Output: Error: Factorial is not defined for negative numbers.