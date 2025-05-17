import React, { useEffect, useState } from "react";
import "../index.css";

function StateDropdown() {
  const [states, setStates] = useState([]);
  const [error, setError] = useState(null);
  const [isOpen, setIsOpen] = useState(false);
  const [selectedState, setSelectedState] = useState(null);
  const [selectedCity, setSelectedCity] = useState(null);
  const [expandedStateId, setExpandedStateId] = useState(null);

  useEffect(() => {
    fetch("./ejson.json")
      .then((res) => {
        if (!res.ok) throw new Error("Failed to fetch states.");
        return res.json();
      })
      .then((data) => setStates(data.states))
      .catch((err) => setError(err.message));
  }, []);

  const toggleDropdown = () => {
    setIsOpen(!isOpen);
    setExpandedStateId(null); // Reset expanded city list when opening/closing
  };

  const toggleStateCities = (id) => {
    setExpandedStateId(expandedStateId === id ? null : id);
  };

  const selectCity = (state, city) => {
    setSelectedState(state);
    setSelectedCity(city);
    setIsOpen(false);
    setExpandedStateId(null);
  };

  return (
    <div className="listdown-container">
      {error && <p style={{ color: "red" }}>{error}</p>}

      <div className="listdown">
        <button className="dropbtn" onClick={toggleDropdown}>
          Select State
        </button>

        {isOpen && (
          <div className="dropdown-content">
            {states.map((state) => (
              <div key={state.id} className="nested-dropdown">
                <span
                  className={`state-name ${
                    expandedStateId === state.id ? "expanded" : ""
                  }`}
                  onClick={() => toggleStateCities(state.id)}
                >
                  {state.name}
                </span>

                {expandedStateId === state.id && (
                  <div className="nested-dropdown-content">
                    {state.cities.map((city, index) => (
                      <span
                        key={index}
                        className="city-name"
                        onClick={() => selectCity(state, city)}
                      >
                        {city}
                      </span>
                    ))}
                  </div>
                )}
              </div>
            ))}
          </div>
        )}
      </div>

      {/* Display selected state and city info */}
      {selectedState && selectedCity && (
        <div style={{ marginTop: "20px", textAlign: "center" }}>
          <h2>
            {selectedCity}, {selectedState.name}
          </h2>
          <p>
            You have selected {selectedCity} city in {selectedState.name} state.
          </p>
        </div>
      )}
    </div>
  );
}

export default StateDropdown;
