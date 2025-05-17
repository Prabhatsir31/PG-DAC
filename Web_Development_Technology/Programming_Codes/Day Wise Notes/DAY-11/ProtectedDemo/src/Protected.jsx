import React, { useEffect } from "react";
import { useNavigate } from "react-router-dom";

function Protected({ isSignedIn, children }) {
  const navigate = useNavigate();

  useEffect(() => {
    if (!isSignedIn) {
      navigate("/"); // ✅ navigate safely after render
    }
  }, [isSignedIn, navigate]);

  if (!isSignedIn) return null; // Don't render children while redirecting

  return children;
}

export default Protected;
