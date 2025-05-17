// PrivateRoute.js
import React from 'react';
import { Navigate } from 'react-router-dom';

const PrivateRoute = ({ children }) => {
  const isLoggedIn = localStorage.getItem('loggedIn');
  return isLoggedIn ? children : <Navigate to="/Login" />;
};

export default PrivateRoute;
