import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import "../index.css";

function Listemployee() {
  const [employees, setEmployees] = useState([]);
  const [filteredEmployees, setFilteredEmployees] = useState([]);
  const [departmentId, setDepartmentId] = useState("0");

  useEffect(() => {
    fetch("https://localhost:7106/api/Employee")
      .then((res) => res.json())
      .then((result) => {
        console.log(result.value || result); // Adjust based on actual API shape
        const data = result.value || result;
        setEmployees(data);
        setFilteredEmployees(data);
      })
      .catch((error) => console.error("Fetch error:", error));
  }, []);

  const getDeptName = (id) => {
    switch (id) {
      case 1: return "Finance";
      case 2: return "Sales";
      case 3: return "Marketing";
      case 4: return "HR";
      case 5: return "Psycology";
      case 6: return "Accounting";
      case 7: return "Statics"
      default: return "Unknown";
    }
  };

  const handleDepartmentChange = (event) => {
    const selectedId = event.target.value;
    setDepartmentId(selectedId);

    if (selectedId === "0") {
      setFilteredEmployees(employees);
    } else {
      const filtered = employees.filter(
        (emp) => emp.departmentId === parseInt(selectedId)
      );
      setFilteredEmployees(filtered);
    }
  };

  return (
    <div className="main-content">
      <div className="listemployee-container">
        <div className="header">
          <h4>
            <Link to="/Createemp" className="create-link">Create New Employee</Link>
          </h4>
          <h2>Employee Detail Record...</h2>

          <div className="filter-section"><br />
            <label htmlFor="dept-filter">Filter by Department:</label><br /><br />
            <select className="dept-filter" value={departmentId} onChange={handleDepartmentChange}>
              <option value="0">All</option>
              <option value="1">Finance</option>
              <option value="2">Sales</option>
              <option value="3">Marketing</option>
              <option value="4">HR</option>
              <option value="5">Psycology</option>
              <option value="6">Accounting</option>
              <option value="7">Statics</option>
            </select>
          </div>
        </div>

        <table className="employee-table">
          <thead>
            <tr>
              <th>Id</th>
              <th>Name</th>
              <th>Email</th>
              <th>DepartmentName</th>
              <th colSpan="3">Actions</th>
            </tr>
          </thead>
          <tbody>
            {filteredEmployees.map((emp) => (
              <tr key={emp.id}>
                <td>{emp.id}</td>
                <td>{emp.name}</td>
                <td>{emp.email}</td>
                <td>{getDeptName(emp.departmentId)}</td>
                <td><Link to={`/Employee/${emp.id}`} className="action-link display">Display</Link></td>
                <td><Link to={`/Employeeup/${emp.id}`} className="action-link edit">Edit</Link></td>
                <td><Link to={`/Employeedel/${emp.id}`} className="action-link delete">Delete</Link></td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default Listemployee;
