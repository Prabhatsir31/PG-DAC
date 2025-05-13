import React from "react";

function Search({ onQuery }) {
  function handleInput(e) {
    onQuery(e.target.value);
  }

  return (
    <div className="my-4">
      <input
        type="text"
        placeholder="Search by name or gender..."
        onChange={handleInput}
        className="border p-2 rounded w-full max-w-md"
      />
    </div>
  );
}

export default Search;
