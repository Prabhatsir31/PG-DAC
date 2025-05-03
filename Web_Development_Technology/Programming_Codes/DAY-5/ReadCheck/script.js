// Book list
const books = [
    { id: 'b1', name: 'The Alchemist', price: 300 },
    { id: 'b2', name: 'Clean Code', price: 500 },
    { id: 'b3', name: 'JavaScript: The Good Parts', price: 450 }
  ];
  
  // Update cart preview live
  function updateCart() {
    let cartItems = [];
    let total = 0;
  
    for (let book of books) {
      let checkbox = document.getElementById(book.id);
      if (checkbox.checked) {
        cartItems.push(`<li>${book.name} - ₹${book.price}</li>`);
        total += book.price;
      }
    }
  
    document.getElementById("cart").innerHTML = `<ul>${cartItems.join('')}</ul>`;
    document.getElementById("total").innerHTML = `<strong>Total: ₹${total}</strong>`;
  }
  
  // On submit, show selected books in a message
  function finalizeCart() {
    let selectedBooks = [];
    let total = 0;
  
    for (let book of books) {
      let checkbox = document.getElementById(book.id);
      if (checkbox.checked) {
        selectedBooks.push(book.name);
        total += book.price;
      }
    }
  
    if (selectedBooks.length === 0) {
      alert("No books selected.");
    } else {
      alert("You have selected:\n- " + selectedBooks.join("\n- ") + `\nTotal Price: ₹${total}`);
    }
  }
  