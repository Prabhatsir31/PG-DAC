function generateBoxes() {
    const count = parseInt(document.getElementById('boxCount').value);
    const container = document.getElementById('boxContainer');
    container.innerHTML = ''; // Clear existing boxes

    if (isNaN(count) || count < 1) {
      alert("Please enter a valid number greater than 0.");
      return;
    }

    for (let i = 1; i <= count; i++) {
      const box = document.createElement('div');
      box.className = 'box';
      box.textContent = i;
      container.appendChild(box);
    }
  }