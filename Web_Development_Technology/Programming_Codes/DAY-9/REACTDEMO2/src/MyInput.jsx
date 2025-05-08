import { useState } from "react";

function MyInput() {
  const [text, setText] = useState("");
  function handleChange(e) {
    setText(e.target.value);
  }
  return (
    <>
      <input value={text} onChange={handleChange} placeholder="Hello" />{" "}
      <p>You typed: {text}</p>{" "}
      <button onClick={() => setText("hello")}> Reset </button>{" "}
    </>
  );
}

export default MyInput;