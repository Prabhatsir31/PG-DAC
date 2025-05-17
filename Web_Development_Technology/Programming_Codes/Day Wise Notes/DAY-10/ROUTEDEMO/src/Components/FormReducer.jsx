import React, { useReducer } from 'react';
import '../index.css'; // Ensure path is correct

function reducer(state, action) {
  switch (action.type) {
    case 'incremented_age':
      return { ...state, age: state.age + 1 };
    case 'decremented_age':
      return { ...state, age: state.age > 0 ? state.age - 1 : 0 };
    case 'changed_name':
      return { ...state, name: action.nextName };
    default:
      throw new Error('Unknown action: ' + action.type);
  }
}

const initialState = { name: 'Honey', age: 42 };

function FormReducer() {
  const [state, dispatch] = useReducer(reducer, initialState);

  return (
    <div className="form-container">
      <h2>User Info</h2>
      <input
        value={state.name}
        onChange={(e) =>
          dispatch({ type: 'changed_name', nextName: e.target.value })
        }
        placeholder="Enter your name"
      />
      <div className="button-group">
        <button onClick={() => dispatch({ type: 'incremented_age' })}>
          +
        </button>
        <span className="age">{state.age}</span>
        <button onClick={() => dispatch({ type: 'decremented_age' })}>
          -
        </button>
      </div>
      <p>Hello, <strong>{state.name}</strong>. You are <strong>{state.age}</strong> years old.</p>
    </div>
  );
}

export default FormReducer;
