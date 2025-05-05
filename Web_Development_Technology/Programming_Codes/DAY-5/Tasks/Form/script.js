function calculateAge(dob) {
  const birthDate = new Date(dob);
  const today = new Date();
  let age = today.getFullYear() - birthDate.getFullYear();
  const m = today.getMonth() - birthDate.getMonth();
  if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
    age--;
  }
  return age;
}
 
function validateForm() {
  const name = document.getElementById("name").value.trim();
  const password = document.getElementById("password").value.trim();
  const email = document.getElementById("email").value.trim();
  const address = document.getElementById("address").value.trim();
  const dob = document.getElementById("dob").value;
  const mobile = document.getElementById("mobile").value.trim();
  const education = document.getElementById("education").value;
  const gender = document.querySelector('input[name="gender"]:checked');

  const emailRegex = /^[^\s@]+@[^\s@]+\.[a-zA-Z]{2,3}$/;
  const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,15}$/;

  let error = "";

  if (name.length < 5 || name.length > 15) {
    error = "Name must be 5-15 characters.";
  } else if (!passwordRegex.test(password)) {
    error = "Password must be 8-15 characters and include letters, numbers, and symbols.";
  } else if (!emailRegex.test(email)) {
    error = "Enter a valid email (e.g., name@example.com).";
  } else if (address.length < 10 || address.length > 35) {
    error = "Address must be 10-35 characters.";
  } else if (!dob) {
    error = "Date of Birth is required.";
  } else {
    const age = calculateAge(dob);
    if (age < 18 || age > 80) {
      error = "Age must be between 18 and 80.";
    } else if (!/^\d{10}$/.test(mobile)) {
      error = "Mobile must be a 10-digit number.";
    } else if (!education) {
      error = "Please select education.";
    } else if (!gender) {
      error = "Please select gender.";
    }
  }

  const errorMsg = document.getElementById("errorMsg");
  if (error) {
    errorMsg.textContent = error;
    return false;
  } else {
    errorMsg.textContent = "";
    alert("Form submitted successfully!");
    return true;
  }
}
