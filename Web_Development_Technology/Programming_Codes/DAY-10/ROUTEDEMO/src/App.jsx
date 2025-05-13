import { Routes, Route, Link, useNavigate } from "react-router-dom";
import './index.css';
import Footer from './Footer';
import logo from './assets/react.svg';
import Createemp from './Createemp';
import Listemployee from './Listemployee';
import Home from './Home';
import Login from './Login';
import Signup from './Signup';
import ContactUs from './ContactUs';
import Nopage from './Nopage';
import Example from './Example';
import Employee from './Employee';
import Employeeup from './Employeeup';
import Employeedel from './Employeedel';
import About from "./About";


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
