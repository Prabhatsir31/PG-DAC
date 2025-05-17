import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { useNavigate, useParams } from "react-router-dom"

function Employeeup() {

    const [employee, setEmployee] = useState([]);

    const { id } = useParams();

    let navigate = useNavigate();

    useEffect(() => {
        fetch("https://localhost:7106/api/Employee/" + id)
            .then(res => res.json())
            .then((result) => {
                setEmployee(result.value);
            }
            ).catch((e)=>console.log(e));
    }, []);

    const handleChange = (event) => {
        const name = event.target.name;

        const value = event.target.value;

        setEmployee(values => ({ ...values, [name]: value }))
    }

    const handleSubmit = (event) => {
        let demo = JSON.stringify(employee);
         
        fetch("https://localhost:7106/api/Employee/" + id, {
            method: 'PUT',
            headers: { 'Content-type': 'application/json' },
            body: demo
        }).then(r => { console.log(r) })

        event.preventDefault();
        navigate('/');      
    }

    return (
            <form onSubmit={handleSubmit} className="employee-updation">

                <h2><u>Employee Updation</u></h2><br />
                <label>Id:</label>
                <input
                    type="text"
                    name="id"
                    value= {employee?.id ?? ""}
                    disabled={true}
                    onChange={handleChange}
                />
                <br />            <label>Name:</label>
                <input
                    type="text"
                    name="name"
                    value= {employee?.name ?? ""}
                    onChange={handleChange}
                />
                <br />            <label>Email:</label>
                <input
                    type="text"
                    name="email"
                    value= {employee?.email ?? ""}
                    onChange={handleChange}
                />
                <br />            <label>Department:</label>
                <input
                    type="text"
                    name="departmentId"
                    value={employee?.departmentId ?? ""}
                    onChange={handleChange}
                />
                <br />      
                <input type="submit" />
                <Link to="/listemployee" className="back-button">Back to Employee List</Link>
            </form>
        );
    } 
    
    export default Employeeup;
    