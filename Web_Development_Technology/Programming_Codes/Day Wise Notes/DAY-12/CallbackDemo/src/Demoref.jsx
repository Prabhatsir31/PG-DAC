import React, { useEffect, useRef, useState } from "react";


function Demoref() {
  const [inputValue, setInputValue] = useState("");
  const previousInputValue = useRef("");
  const inputElement = useRef();
  const boxref = useRef(null);

  const count = useRef(0);


  const changeColor = () => {
    console.log("boxref", boxref.current);
    if (boxref.current) {
      boxref.current.style.backgroundColor = "lightblue";
    }
  };

  useEffect(() => {
    count.current = count.current + 1;
  });

  const focusInput = () => {
    inputElement.current.focus();
  };

  useEffect(() => {
    previousInputValue.current = inputValue;
  }, [inputValue]);
  return (
    <>
      <input
        type="text"
        value={inputValue}
        ref={inputElement}
        onChange={(e) => setInputValue(e.target.value)}
      />
      <button onClick={focusInput}>Focus Input</button>

      <h2>Render Count: {count.current}</h2>

      <h2>Current Value: {inputValue}</h2>
      <h2>Previous Value: {previousInputValue.current}</h2>

      <hr />  

      <div
        ref={boxref}
        style={{
          width: "100px",
          height: "100px",
          backgroundColor: "gray",
          marginBottom: "10px",
        }}
      ></div>
      <button onClick={changeColor}>Change Color</button>
    </>
  );
}

export default Demoref;
