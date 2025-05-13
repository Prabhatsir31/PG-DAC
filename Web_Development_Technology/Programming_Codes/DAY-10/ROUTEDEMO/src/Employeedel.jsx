import React from "react";
import { useState, useEffect } from "react";
import { useParams, useNavigate, Link } from "react-router-dom";
export function Employeedel() {
  const [employee, setEmployee] = useState({});
  const { id } = useParams();
  const navigate = useNavigate();
  useEffect(() => {
    fetch("https://localhost:7106/api/Employee/" + id)
      .then((res) => res.json())
      .then((result) => {
        setEmployee(result.value);
      });
  }, []);
  const handeldel = (event) => {
    fetch("https://localhost:7106/api/Employee/" + id, {
      method: "Delete",
    })
      .then((res) => res)
      .then((result) => {
        console.log(result);
      });
    event.preventDefault();
    navigate("/");
  };

  return (
    <div className="employeedel-container">
    <h1>Are you sure?</h1>
    <p><label>Id:</label>{employee.id}</p>
    <p><label>Name:</label>{employee.name}</p>
    <p><label>Email:</label>{employee.email}</p>
    <p><label>Department:</label>{employee.departmentId}</p>
    <form onSubmit={handeldel}>
      <input type="submit" value="Delete" />
      <Link to="/listemployee" className="back-button">Back to Employee List</Link>
    </form>

</div>

  );
}
export default Employeedel;
