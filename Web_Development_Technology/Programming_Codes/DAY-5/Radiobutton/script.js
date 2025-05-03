document.addEventListener('DOMContentLoaded', function () {
  document.getElementById('calcForm').addEventListener('submit', function (event) {
    event.preventDefault();
    
    // Get the values of num1 and num2
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);

    // Check if the numbers are valid
    if (isNaN(num1) || isNaN(num2)) {
      document.getElementById('result').innerHTML = "Please enter valid numbers!";
      return;
    }

    // Perform calculations
    const addition = num1 + num2;
    const subtraction = num1 - num2;

    // Display the result
    document.getElementById('result').innerHTML =
      "➕ Addition: " + addition + "<br>➖ Subtraction: " + subtraction;
  });
});
