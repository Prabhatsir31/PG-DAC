import { useState, useCallback } from "react";
import Todos from "./Todos";
import './App.css'
import UseMemo from "./UseMemo";
import Demoref from "./Demoref";


const App = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState(0);
  const increment = () => {
    setCount((c) => c + 1);
  };
  const addTodo = useCallback(() => {
    setTodos((todos) => todos + 1);
  }, [todos]);
  return (
    <>
      <Todos todos={todos} addTodo={addTodo} />
      <hr />
      <div>
        Count: {count}{" "}
        <button onClick={increment}>+</button>
      </div>
      <hr />
      
      <UseMemo />
      <hr />
      <Demoref />
    </>
  );
};
export default App;
