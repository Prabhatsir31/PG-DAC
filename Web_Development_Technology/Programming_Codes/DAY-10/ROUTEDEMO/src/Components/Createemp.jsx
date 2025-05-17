import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

function Createemp() {
  const [employee, setEmployee] = useState({});
  let navigate = useNavigate();

  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    setEmployee((values) => ({ ...values, [name]: value }));
  };

  const handleSubmit = (event) => {
    let demo = JSON.stringify(employee);
    fetch("https://localhost:7106/api/Employee", {
      method: "POST",
      headers: { "Content-type": "application/json" },
      body: demo,
    }).then((r) => {
      console.log(r);
    });

    event.preventDefault();
    navigate("/Listemployee"); // Redirect to Listemployee page after successful submission
  };

  return (

    
    <form onSubmit={handleSubmit} className="Createemp-main">
      <h2><u>New Employee Record</u></h2><br />
      <label>Name:</label>
      <input type="text" name="name" onChange={handleChange} />
      <br />
      <label>Email:</label>
      <input type="text" name="email" onChange={handleChange} />
      <br />
      <label>Department-ID:</label>
      <input type="text" name="departmentId" onChange={handleChange} />
      <br />
      <input type="submit" value="Submit" />
    </form>
  );
}

export default Createemp;
