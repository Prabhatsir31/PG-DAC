import React from "react";
function Search({ onQuery }) {
  function handelInput(e) {
    onQuery(e.target.value);
  }
  return (
    <div>
        <input type="text" onChange={handelInput} />{" "}
    </div>
  );
}

export default Search;
