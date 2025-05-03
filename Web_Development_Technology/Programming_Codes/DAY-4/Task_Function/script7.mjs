// Q7. Solve Q2, Q3 , Q6 using lambda

// Q2. Write function fact(){} which will accept a number and return factorial of a number using lambda 
// 
// // Q3. Using java script print your name in bold. Put your name in a variable and then print it using lambda.

// Q6. Write a function which has 3 parameter and returning sum of it. Call this function with 2 para meter
// Factorial Function
const fact = (n) => {
    if (n === 0 || n === 1) {
        return 1;
    } else {
        return n * fact(n - 1);
    }
};

const n = 5;
console.log(`Factorial of ${n} is ${fact(n)}`); // Output: 120

// Bold Print Function (Console)
const name = "Prabhat Srivastava";

const boldPrint = (text) => {
    console.log("%c" + text, "font-weight: bold; font-size: 16px;");
};

boldPrint(name); // Prints name in bold

// Sum Function with 3 parameters (c is optional)
const sum = (a, b, c = 0) => a + b + c;

console.log(`Sum of two Elements ${sum(2, 3)}`);    // Output: 5
console.log(`Sum of three Elements ${sum(2, 3, 4)}`); // Output: 9
