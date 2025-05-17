import React, {useState} from 'react'


function MyButton() {
      const [count, setCount] = useState(0);
      const handleClick = () => {
        setCount(count + 1);
      }
  return (
    <div>
      <button onClick={handleClick}>Clicked {count}</button>
    </div>
  )
}

export default MyButton

 