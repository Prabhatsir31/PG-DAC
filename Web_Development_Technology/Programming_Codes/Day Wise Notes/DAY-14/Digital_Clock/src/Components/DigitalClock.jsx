import React, { useEffect, useRef, useState } from "react";
import "../index.css";

function DigitalClock() {
  const [time, setTime] = useState(new Date());
  const intervalRef = useRef(null);

  useEffect(() => {
    intervalRef.current = setInterval(() => {
      setTime(new Date());
    }, 1000);
    return () => clearInterval(intervalRef.current);
  }, []);

  const formatTime = (date) => {
    const hours = String(date.getHours()).padStart(2, "0");
    const minutes = String(date.getMinutes()).padStart(2, "0");
    const seconds = String(date.getSeconds()).padStart(2, "0");
    return `${hours}:${minutes}:${seconds}`;
  };

  return (
    <div className="clock-background">
      <div className="clock-glass">
        <h1 className="clock-time">{formatTime(time)}</h1>
      </div>
    </div>
  );
}

export default DigitalClock;
