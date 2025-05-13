import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import "./index.css";

function Listemployee() {
  const [employee, setEmployee] = useState([]);

  useEffect(() => {
    fetch("https://localhost:7106/api/Employee")
      .then((res) => res.json())
      .then((result) => {
        console.log(result.value);
        setEmployee(result.value);
      })
      .catch((error) => console.error("Fetch error:", error));
  }, []);

  return (
    <>
      <div className="main-content">
        <div className="listemployee-container">
          <div className="header">
            <h4>
              <Link to="/Createemp" className="create-link">Create New Employee</Link>
            </h4>
            <h2>Employee Data</h2>
          </div>
          <table className="employee-table">
            <thead>
              <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Department</th>
                <th>Department Name</th>
                <th colSpan="3">Actions</th>
              </tr>
            </thead>
            <tbody>
              {employee.map((emp) => (
                <tr key={emp.id}>
                  <td>{emp.id}</td>
                  <td>{emp.name}</td>
                  <td>{emp.email}</td>
                  <td style={{ textAlign: "center" }}>{emp.departmentId}</td>
                  <td>{emp.departmentName}</td>
                  <td><Link to={`/Employee/${emp.id}`} className="action-link display">Display</Link></td>
                  <td><Link to={`/Employeeup/${emp.id}`} className="action-link edit">Edit</Link></td>
                  <td><Link to={`/Employeedel/${emp.id}`} className="action-link delete">Delete</Link></td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>

    </>
  );
}

export default Listemployee;
