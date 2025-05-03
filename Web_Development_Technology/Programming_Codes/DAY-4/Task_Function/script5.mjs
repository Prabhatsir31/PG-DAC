// Q5. Write a function to check entered data is even or odd

function checkEvenOdd(num) {
  if (num % 2 === 0) {
      return 'Even';
  } else {
      return 'Odd';
  }
}

// Take input from user at runtime using prompt()
let input = prompt("Enter a number:");
let num = parseInt(input);

if (!isNaN(num)) {
  console.log(`The number you entered is ${num} which is ${checkEvenOdd(num)}`);
} else {
  console.log("Invalid input. Please enter a valid number.");
}
