import React from "react";
import { useState,useEffect } from "react";

function Counter() {
  const [count, setCount] = useState(0);
  const [calculation, setCalculation] = useState(0);
  useEffect(() => {
    setCalculation(() => count * 2);
  }, [count]); // <- add the count variable here

  return(
  <div>
    <p>Count: {count}</p>{" "}
    <button onClick={() => setCount((c) => c + 1)}>Multiply by 2</button>{" "}
    <p>Calculation: {calculation}</p>
  </div>
  );
}

export default Counter;
