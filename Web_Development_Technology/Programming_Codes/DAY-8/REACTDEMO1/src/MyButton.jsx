import React from 'react';

function MyButton() {
  return (
    <>
      <button style={{ padding: '15px', marginRight: '10px', backgroundColor: '#f44336', color: 'white', border: 'none', borderRadius: '5px' }}>
        Reset
      </button>
      <button style={{ padding: '15px', backgroundColor: '#4CAF50', color: 'white', border: 'none', borderRadius: '5px' }}>
        Submit
      </button>
    </>
  );
}

export default MyButton;
