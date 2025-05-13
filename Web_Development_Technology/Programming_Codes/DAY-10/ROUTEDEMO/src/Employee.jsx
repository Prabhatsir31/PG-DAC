import React, { useState, useEffect } from "react";
import { useParams, Link } from "react-router-dom";
import "./index.css"; // Import the CSS file for styling

export function Employee() {
  const [employee, setEmployee] = useState({});
  const { id } = useParams();
  
  useEffect(() => {
    fetch("https://localhost:7106/api/Employee/" + id)
      .then((res) => res.json())
      .then((result) => {
        setEmployee(result.value);
      });
  }, [id]);

  return (
    <div className="employee-container">
      <div className="employee-header">
        <h2>Employee Details</h2>
      </div>

      <div className="employee-detail">
        <label>Id:</label>
        <div className="value">{employee.id}</div>
      </div>

      <div className="employee-detail">
        <label>Name:</label>
        <div className="value">{employee.name}</div>
      </div>

      <div className="employee-detail">
        <label>Email:</label>
        <div className="value">{employee.email}</div>
      </div>

      <div className="employee-detail">
        <label>Department-Id:</label>
        <div className="value">{employee.departmentId}</div>
      </div>

      <Link to="/listemployee" className="back-button">Back to Employee List</Link>
    </div>
  );
}

export default Employee;
