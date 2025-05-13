// Login.js
import React, { useState } from 'react';
import './index.css';
import { useNavigate } from 'react-router-dom';
import { Link } from 'react-router-dom';

function Login() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const navigate = useNavigate();

  const handleLogin = (e) => {
    e.preventDefault();
    if (!email || !password) {
      setError("Please fill in both fields");
      return;
    }

    // Perform login logic here (e.g., API call)
    localStorage.setItem('loggedIn', true);
    navigate('/Home');
  };

  return (
    <div className="main-content-login">
      <div className="login-container">
        <h2>Login</h2>
        <form onSubmit={handleLogin}>
          <input
            type="text"
            placeholder="Enter your email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
          <input
            type="password"
            placeholder="Enter your password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          {error && <div className="error-message">{error}</div>}
          <input type="submit" value="Login" />
        </form>
        <p>
            Don't have an account? <Link to="/Signup" className="signup-link">Sign Up</Link>
        </p>
      </div>
    </div>
  );
}

export default Login;
