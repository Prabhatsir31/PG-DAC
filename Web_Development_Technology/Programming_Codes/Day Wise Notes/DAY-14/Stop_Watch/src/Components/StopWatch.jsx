import React, { useRef, useState } from "react";
import "../index.css";

function Stopwatch() {
  const [time, setTime] = useState(0);
  const intervalRef = useRef(null);

  const start = () => {
    if (intervalRef.current !== null) return;
    intervalRef.current = setInterval(() => {
      setTime((prev) => prev + 10);
    }, 10);
  };

  const stop = () => {
    clearInterval(intervalRef.current);
    intervalRef.current = null;
  };

  const reset = () => {
    stop();
    setTime(0);
  };

  const formatTime = (time) => {
    const ms = String(time % 1000).padStart(3, "0").slice(0, 2);
    const secs = Math.floor(time / 1000) % 60;
    const mins = Math.floor(time / (1000 * 60)) % 60;
    const hrs = Math.floor(time / (1000 * 60 * 60));

    return {
      hrs: String(hrs).padStart(2, "0"),
      mins: String(mins).padStart(2, "0"),
      secs: String(secs).padStart(2, "0"),
      ms: ms,
    };
  };

  const { hrs, mins, secs, ms } = formatTime(time);

  return (
    <div className="stopwatch-container">
      <h1>⏱️ React Stopwatch</h1>
      <div className="time-display">
        {hrs}:{mins}:{secs}:{ms}
      </div>
      <div className="buttons">
        <button onClick={start}>Start</button>
        <button onClick={stop}>Stop</button>
        <button onClick={reset}>Reset</button>
      </div>
    </div>
  );
}

export default Stopwatch;
