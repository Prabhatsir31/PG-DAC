import React, { useState, useEffect } from 'react';
import '../index.css'; // Use the correct relative path to your CSS file

function Dropdownemp() {
    const [employees, setEmployees] = useState([]);
    const [selectedId, setSelectedId] = useState('');
    const [selectedEmail, setSelectedEmail] = useState('');
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch("https://localhost:7106/api/Employee")
            .then(res => {
                if (!res.ok) {
                    throw new Error("Failed to fetch employee data.");
                }
                return res.json();
            })
            .then((data) => {
                setEmployees(data.value); // adjust this based on your actual API response
                setLoading(false);
            })
            .catch((err) => {
                setError(err.message);
                setLoading(false);
            });
    }, []);

    const handleSelectChange = (e) => {
        const id = e.target.value;
        setSelectedId(id);
        const selectedEmp = employees.find(emp => emp.id === parseInt(id));
        if (selectedEmp) {
            setSelectedEmail(selectedEmp.email || 'No email available');
        } else {
            setSelectedEmail('');
        }
    };

    return (
        <div className="dropdown-container">
            <h2>Select Employee</h2>

            {loading && <p className="loader">Loading employees...</p>}
            {error && <p className="error">{error}</p>}

            {!loading && !error && (
                <select id='dropdown' onChange={handleSelectChange} value={selectedId}>
                    <option value=''>-- Select an employee --</option>
                    {Array.isArray(employees) && employees.map(emp => (
                        <option key={emp.id} value={emp.id}>
                            {emp.name}
                        </option>
                    ))}
                </select>
            )}

            {selectedId && selectedEmail && (
                <div className="email-box">
                    <h3>Email:</h3>
                    <p>{selectedEmail}</p>
                </div>
            )}

            <hr />
        </div>
    );
}

export default Dropdownemp;
