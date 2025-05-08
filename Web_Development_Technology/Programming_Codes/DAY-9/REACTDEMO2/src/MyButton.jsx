import React from "react";
import { useState } from "react";

function MyButton() {
  let [count, setCount] = useState(0);
  function handleClick() {
    setCount(count + 1);
  }
  function sub(){
    if(count > 0 )
    {
    setCount(count -1)
    }
    else
    alert("not less than -ve")

}
function reset(){
    setCount(count=0)
}
return (
    <>
         <button onClick={handleClick}> Clicked {count} times </button>{" "}
         <button onClick={sub} > sub - </button>{" "}
         <button onClick={reset}> Reset</button>{" "}
    </>
    );
}

export default MyButton;
