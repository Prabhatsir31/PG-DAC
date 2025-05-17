import React, { useState, useEffect } from "react";

export default function Container({ query }) {
  const [list, setList] = useState([]);

  useEffect(() => {
    fetch("ejson.json")
      .then((res) => res.json())
      .then((data) => setList(data))
      .catch((err) => console.error("Failed to load data:", err));
  }, []);

  const filtered = list.filter((data) => {
    const gender = data.gender.toLowerCase();
    const name = data.name.toLowerCase();
    const q = query.toLowerCase().trim();

    return (
      name.includes(q) ||
      gender.includes(q) ||
      (q === "m" && gender === "male") ||
      (q === "f" && gender === "female")
    );
  });

  return (
    <ul>
      {filtered.map((listItem) => (
        <li key={listItem.code}>
          {listItem.name} — {listItem.gender}
        </li>
      ))}
    </ul>
  );
}
