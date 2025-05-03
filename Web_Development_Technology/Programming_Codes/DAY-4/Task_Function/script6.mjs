// Q6. Write a function which has 3 parameter and returning sum of it. Call this function with 2 para meter

function sum(a, b, c=0) {
    return a + b + c;
}

let sumResult = sum(5, 10);

console.log(sumResult); // Output: 15