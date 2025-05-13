import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom"; 
import ContactUs from "./ContactUs.jsx";
import Home from "./Home.jsx";
import Example from "./Example.jsx";
import Nopage from "./Nopage.jsx";
import Listemployee from "./Listemployee.jsx";
import Createemp from "./Createemp.jsx";
import Employee from "./Employee.jsx";
import Employeeup from "./Employeeup.jsx";
import Employeedel from "./Employeedel.jsx";
import Login from "./Login.jsx";
import Signup from "./Signup.jsx";
import About from "./About.jsx";

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
