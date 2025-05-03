// Q4. Print your name on page as soon as page get loaded using function[self invoking]

(function() {
    let myName = "Prabhat Srivastava"; // You can change your name here
    document.getElementById("output").innerHTML = "<b>" + myName + "</b>";
})();