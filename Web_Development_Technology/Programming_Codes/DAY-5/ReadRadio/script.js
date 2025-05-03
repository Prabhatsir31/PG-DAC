function readradio() {
    let text1 = document.getElementById("t1").value;
    let text2 = document.getElementById("t2").value;
    let text3 = document.getElementById("t3");
    let radios = document.frm.rd;
    let isValid = true;
  
    // Validation
    if (text1.trim() === "") {
      document.getElementById("e1").innerHTML = "Please enter a number";
      isValid = false;
    } else {
      document.getElementById("e1").innerHTML = "";
    }
  
    if (text2.trim() === "") {
      document.getElementById("e2").innerHTML = "Please enter a number";
      isValid = false;
    } else {
      document.getElementById("e2").innerHTML = "";
    }
  
    if (!isValid) return;
  
    // Operation check
    for (let i = 0; i < radios.length; i++) {
      if (radios[i].checked) {
        document.getElementById("pp").innerHTML = "You have selected: " + radios[i].value;
        if (radios[i].value === "+") {
          text3.value = Number(text1) + Number(text2);
        } else {
          text3.value = Number(text1) - Number(text2);
        }
      }
    }
  }
  
  function cc() {
    document.frm.rd[0].checked = true;
  }
  
  // Optional: Prevent default form submission
  document.addEventListener('DOMContentLoaded', function () {
    document.getElementById("calcForm").addEventListener("submit", function (e) {
      e.preventDefault();
      alert("Form Submitted Successfully!");
    });
  });
  