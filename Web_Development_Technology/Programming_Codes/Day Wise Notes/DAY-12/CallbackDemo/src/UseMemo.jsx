import { useState, useMemo } from "react";
import ReactDOM from "react-dom";

const UseMemo = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState(0);
  const calculation = useMemo(() => expensiveCalculation(count), [count]);
  const addTodo = () => {
    setTodos((t) => t + 1);
  };
  const increment = () => {
    setCount((c) => c + 1);
  };

  return (
    <div>
      <div>
        {" "}
        <h2>My Todos</h2>
        <span>{todos}</span>{" "}
        <button onClick={addTodo}>Add Todo</button>
      </div>
      <hr />
      <div>
        Count: {count}{" "}
        <button onClick={increment}>+</button>
        <h2>Expensive Calculation</h2>
        {calculation}
      </div>
    </div>
  );
};
const expensiveCalculation = (num) => {
  console.log("Calculating...");
  for (let i = 0; i < 1000000000; i++) {
    num += 1;
  }
  return num;
};
export default UseMemo;
