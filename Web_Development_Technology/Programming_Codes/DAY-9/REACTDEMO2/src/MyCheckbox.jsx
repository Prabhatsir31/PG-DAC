import React from "react";
import { useState } from "react";

function MyCheckbox() {
  const [liked, setLiked] = useState(true);
  function handleChange(e) {
    setLiked(e.target.checked);
  }
  return (
    <>
      {" "}
      <label>{" "}
        <input type="checkbox" checked={liked} onChange={handleChange} />I liked this{" "}
      </label>
      <p>You {liked ? "liked" : "did not like"} this.</p>{" "}
    </>
  );
}


export default MyCheckbox;