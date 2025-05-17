import { Routes, Route, Link, useNavigate } from "react-router-dom";
import './index.css';
import Footer from './Components/Footer';
import logo from './assets/react.svg';
import Createemp from './Components/Createemp';
import Listemployee from './Components/Listemployee';
import Home from './Components/Home';
import Login from './Components/Login';
import Signup from './Components/Signup';
import ContactUs from './Components/ContactUs';
import Nopage from './Components/Nopage';
import Example from './Components/Example';
import Employee from './Components/Employee';
import Employeeup from './Components/Employeeup';
import Employeedel from './Components/Employeedel';
import About from "./Components/About";
import Formyup from "./Components/Formyup";
import FormFinal from "./Components/FormFinal";
import FormReducer from "./Components/FormReducer";
import Dropdownemp from "./Components/Dropdownemp";
import StateCityDropdown from "./Components/StateCityDropdown";


function App() {
  const navigate = useNavigate();
  const isLoggedIn = localStorage.getItem('loggedIn');

  const handleLogout = () => {
    localStorage.removeItem('loggedIn');
    navigate('/Login');
    window.location.reload(); // Optional: to force UI refresh
  };

  const ProtectedRoute = ({ children }) => {
    if (!isLoggedIn) {
      navigate('/Login');
      return null;
    }
    return children;
  };

  return (
    <div className="app-container">
      <nav className="navbar">
        <div className="logo">
          <img src={logo} alt="Logo" className="logo-img" />
          <span className="site-title">
            <Link to="/Home" style={{ textDecoration: 'none', color: 'white' }}>My Company</Link>
          </span>
        </div>
        <ul className="nav-links">
          <li><Link to="/Home">Home</Link></li>
          <li><Link to="/About">About</Link></li>
          <li><Link to="/ContactUs">Contact Us</Link></li>
          <li><Link to="/Dropdownemp">Emp_Dropdown</Link></li>
          <li><Link to="/StateCityDropdown">State_Dropdown</Link></li>
          <li><Link to="/Formyup">Form</Link></li>
          <li><Link to="/FormyFinal">FormFinal</Link></li>
          <li><Link to="/FormReducer">FormReducer</Link></li>
          <li>
            {isLoggedIn ? (
              <Link to="/Listemployee">List Employee</Link>
            ) : (
              <span>List Employee (Login required)</span>
            )}
          </li>
          {!isLoggedIn ? (
            <li><Link to="/Login">Login</Link></li>
          ) : (
            <li><button onClick={handleLogout} className="logout-btn">Logout</button></li>
          )}
        </ul>
      </nav>

      <main className="main-content">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/Home" element={<Home />} />
          <Route path="/About" element={<About />} />
          <Route path="/ContactUs" element={<ContactUs />} />
          <Route path="/Createemp" element={<Createemp />} />
          <Route path="/Listemployee" element={<ProtectedRoute><Listemployee /></ProtectedRoute>} />
          <Route path="/Example" element={<Example />} />
          <Route path="/Formyup" element={<Formyup />} />
          <Route path="/Dropdownemp" element={<Dropdownemp />} />
          <Route path="/StateCityDropdown" element={<StateCityDropdown />} />
          <Route path="/FormyFinal" element={<FormFinal />} />
          <Route path="/FormReducer" element={<FormReducer />} />
          <Route path="/Employee/:id" element={<Employee />} />
          <Route path="/Employeeup/:id" element={<Employeeup />} />
          <Route path="/Employeedel/:id" element={<Employeedel />} />
          <Route path="/Login" element={<Login />} />
          <Route path="/Signup" element={<Signup />} />
          <Route path="*" element={<Nopage />} />
        </Routes>
      </main>

      <Footer />
    </div>
  );
}

export default App;



