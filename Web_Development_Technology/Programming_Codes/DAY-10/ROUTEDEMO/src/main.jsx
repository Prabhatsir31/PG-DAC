import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import './index.css';
import App from "./App.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom"; 
import ContactUs from "./Components/ContactUs.jsx";
import Home from "./Components/Home.jsx";
import Example from "./Components/Example.jsx";
import Nopage from "./Components/Nopage.jsx";
import Listemployee from "./Components/Listemployee.jsx";
import Createemp from "./Components/Createemp.jsx";
import Employee from "./Components/Employee.jsx";
import Employeeup from "./Components/Employeeup.jsx";
import Employeedel from "./Components/Employeedel.jsx";
import Login from "./Components/Login.jsx";
import Signup from "./Components/Signup.jsx";
import About from "./Components/About.jsx";
import Dropdownemp from "./Components/Dropdownemp.jsx";
import StateCityDropdown from "./Components/StateCityDropdown.jsx";

// Use createRoot from 'react-dom/client'
const root = createRoot(document.getElementById("root")).render(
  <StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<App />}>
          <Route index element={<Home />} /> {/* Default route */}
          <Route path="Home" element={<Home />} />
          <Route path="About" element={<About />} />
          <Route path="Contactus" element={<ContactUs />} />
          <Route path="Listemployee" element={<Listemployee />} />
          <Route path="Example" element={<Example />} />
          <Route path="Createemp" element={<Createemp />} />
          <Route path="Employee/:id" element={<Employee />} />
          <Route path="Dropdoenemp" element={<Dropdownemp />} />
          <Route path="StateCityDropdown" element={<StateCityDropdown />} />
          <Route path="Employeeup/:id" element={<Employeeup />} />
          <Route path="Employeedel/:id" element={<Employeedel />} />
          <Route path="/Login" element={<Login />} />
          <Route path="/Signup" element={<Signup />} />
          <Route path="*" element={<Nopage />} />
        </Route>
      </Routes>
    </BrowserRouter>
  </StrictMode>
);
