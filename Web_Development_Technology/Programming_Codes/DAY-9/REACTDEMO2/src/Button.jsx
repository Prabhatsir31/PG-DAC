import React from "react";

// function Button({onClick, children}) {
//   return (
//     <div>
//         <button onClick={onClick}>{children}</button>
//     </div>
//   )
// }

function Button(obj) {
  // console.log(obj);
  return <button onClick={obj.onClick}>{obj.children}</button>;
}

export default Button;
