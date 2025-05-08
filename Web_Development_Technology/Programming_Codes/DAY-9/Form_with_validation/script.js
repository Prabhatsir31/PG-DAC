function validateForm() {  
    var fname = document.getElementById("fname").value;
    var email = document.getElementById("e-mail").value;
    var pwd = document.getElementById("passw").value;
    var confirmpwd = document.getElementById("confirmpwd").value;
    var add = document.getElementById("address").value;
    var mob = document.getElementById("mobile").value;
    var dob = document.getElementById("dob").value;


    if(fname == "") {
        document.getElementById("nameErr").innerHTML = "Name is required";
        return false;
    }
    if(fname.length < 3) {
        document.getElementById("nameErr").innerHTML = "Name must be at least 3 characters long";
        return false;
    }
    if(!isNaN(fname)) {
        document.getElementById("nameErr").innerHTML = "Name must contain only letters";
        return false;
    }

    if(email == "") {
        document.getElementById("emailErr").innerHTML = "Email is required";
        return false;
    }  
    

    if(pwd == "") {
        document.getElementById("pwdErr").innerHTML = "Password is required";
        return false;
    }
    if(pwd.length < 5 || pwd.length > 15) {
        document.getElementById("pwdErr").innerHTML = "Password must be at least 8 characters long";
        return false;
    }

    if(confirmpwd == "") {
        document.getElementById("confirmPwdErr").innerHTML = "Confirm Password is required";
        return false;   
    }
    if(pwd != confirmpwd) {
        document.getElementById("confirmPwdErr").innerHTML = "Passwords do not match";
        return false;
    }
    
    if(add == "") {
        document.getElementById("addrErr").innerHTML = "Address is required";
        return false;
    }
    if(add.length < 10|| add.length > 100) {
        document.getElementById("addrErr").innerHTML = "Address must be between 10 and 100 characters long";
        return false;
    }

    if(mob == "") {
        document.getElementById("mobErr").innerHTML = "Mobile Number is required";
        return false;
    } 
    if(!/^[0-9]{10}$/.test(mob)) {
        document.getElementById("mobErr").innerHTML = "Invalid Mobile Number";
        return false;
    }

    if(dob == "") {
        document.getElementById("dobErr").innerHTML = "Date of Birth is required";
        return false;
    }
    if(dob < 18 || dob > 80) {
        document.getElementById("dobErr").innerHTML = "Age must be between 18 and 80";
        return false;
    }
    

    return true;
}