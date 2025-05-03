document.getElementById("userForm").onsubmit = function (e) {
    e.preventDefault();
    const name = document.getElementById("name").value.trim();
    const password = document.getElementById("password").value.trim();
    const email = document.getElementById("email").value.trim();
    const address = document.getElementById("address").value.trim();
    const dob = document.getElementById("dob").value;
    const mobile = document.getElementById("mobile").value.trim();
    const education = document.getElementById("education").value;
    const gender = document.querySelector('input[name="gender"]:checked');
    const errorMsg = document.getElementById("errorMsg");
  
    // Name: 5–15 characters
    if (name.length < 5 || name.length > 15) {
      return errorMsg.textContent = "Name must be 5 to 15 characters.";
    }
  
    // Password: min 8 max 15, must contain letter, number and special char
    const passRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[\W_]).{8,15}$/;
    if (!passRegex.test(password)) {
      return errorMsg.textContent = "Password must be 8–15 characters with letters, numbers & symbols.";
    }
  
    // Email: must have @ and . , domain min 2 or max 3
    const emailRegex = /^[^@]+@[^@]+\.[a-zA-Z]{2,3}$/;
    if (!emailRegex.test(email)) {
      return errorMsg.textContent = "Enter a valid email (e.g., abc@xyz.com)";
    }
  
    // Address: 10–35 characters
    if (address.length < 10 || address.length > 35) {
      return errorMsg.textContent = "Address must be between 10 and 35 characters.";
    }
  
    // DOB: Age between 18 and 80
    const birthYear = new Date(dob).getFullYear();
    const age = new Date().getFullYear() - birthYear;
    if (age < 18 || age > 80) {
      return errorMsg.textContent = "Age must be between 18 and 80.";
    }
  
    // Mobile: exactly 10 digits
    if (!/^\d{10}$/.test(mobile)) {
      return errorMsg.textContent = "Mobile number must be exactly 10 digits.";
    }
  
    // Education: must be selected
    if (!education) {
      return errorMsg.textContent = "Please select an education level.";
    }
  
    // Gender: must be selected
    if (!gender) {
      return errorMsg.textContent = "Please select gender.";
    }
  
    errorMsg.textContent = "";
    alert("Form submitted successfully!");
  };
   