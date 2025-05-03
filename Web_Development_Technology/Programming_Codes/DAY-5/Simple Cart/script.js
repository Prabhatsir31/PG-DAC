let totalAmount = 0;

document.getElementById("productForm").addEventListener("submit", function(e) {
  e.preventDefault();

  const name = document.getElementById("pname").value;
  const price = parseFloat(document.getElementById("pprice").value);
  const qty = parseInt(document.getElementById("pqty").value);

  if (!name || isNaN(price) || isNaN(qty)) {
    alert("Please enter valid product details.");
    return;
  }

  const subtotal = price * qty;
  totalAmount += subtotal;

  const row = `
    <tr>
      <td>${name}</td>
      <td>₹${price.toFixed(2)}</td>
      <td>${qty}</td>
      <td>₹${subtotal.toFixed(2)}</td>
    </tr>
  `;

  document.querySelector("#cart tbody").innerHTML += row;
  document.getElementById("total").textContent = "Total: ₹" + totalAmount.toFixed(2);

  // Clear input fields
  document.getElementById("productForm").reset();
});
