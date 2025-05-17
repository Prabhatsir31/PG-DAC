//  Hooks 



// import React, {
//     useState,
//     useEffect,
//     useContext,
//     useRef,
//     useMemo,
//     useCallback,
//     useReducer,
//     createContext
//   } from 'react';
  
//   // Context setup for useContext
//   const ThemeContext = createContext();
  
//   // Reducer function for useReducer
//   function reducer(state, action) {
//     switch (action.type) {
//       case 'increment': return { count: state.count + 1 };
//       case 'decrement': return { count: state.count - 1 };
//       default: return state;
//     }
//   }
  
//   function App() {
//     // useState
//     const [count, setCount] = useState(0);
  
//     // useEffect
//     useEffect(() => {
//       console.log("useEffect ran: count changed to", count);
//     }, [count]);
  
//     // useRef
//     const inputRef = useRef(null);
  
//     const focusInput = () => {
//       inputRef.current.focus();
//     };
  
//     // useContext (theme example)
//     const theme = useContext(ThemeContext);
  
//     // useMemo
//     const expensiveCalc = useMemo(() => {
//       console.log("Running expensive calculation...");
//       return count * 2;
//     }, [count]);
  
//     // useCallback
//     const showAlert = useCallback(() => {
//       alert("Hello from useCallback!");
//     }, []);
  
//     // useReducer
//     const [state, dispatch] = useReducer(reducer, { count: 0 });
  
//     return (
//       <div style={{ padding: 20, fontFamily: 'Arial' }}>
//         <h1><u><i>React Hooks Demo</i></u></h1><br />
  
//         {/* useState */}
//         <h2><u>useState</u></h2>
//         <p>Count: {count}</p>
//         <button onClick={() => setCount(count + 1)}>Increment Count</button>
  
//         {/* useEffect */}
//         <h2><u>useEffect</u></h2>
//         <p>Check console for effect logs when count changes.</p>
  
//         {/* useContext */}
//         <h2><u>useContext</u></h2>
//         <p>Current Theme: <strong>{theme}</strong></p>
  
//         {/* useRef */}
//         <h2><u>useRef</u></h2>
//         <input ref={inputRef} placeholder="Focus me" />
//         <button onClick={focusInput}>Focus Input</button>
  
//         {/* useMemo */}
//         <h2><u>useMemo</u></h2>
//         <p>Expensive calculation (count * 2): {expensiveCalc}</p>
  
//         {/* useCallback */}
//         <h2><u>useCallback</u></h2>
//         <button onClick={showAlert}>Show Alert</button>
  
//         {/* useReducer */}
//         <h2><u>useReducer</u></h2>
//         <p>Reducer Count: {state.count}</p>
//         <button onClick={() => dispatch({ type: 'increment' })}>+1</button>
//         <button onClick={() => dispatch({ type: 'decrement' })}>-1</button>
//       </div>
//     );
//   }
  
//   // Wrapping App with ThemeContext.Provider
//   export default function MainApp() {
//     return (
//       <ThemeContext.Provider value="light">
//         <App />
//       </ThemeContext.Provider>
//     );
//   }
  