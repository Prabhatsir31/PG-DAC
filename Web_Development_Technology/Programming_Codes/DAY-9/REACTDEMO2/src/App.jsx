import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Toolbar from './Toolbar'
import MyButton from './MyButton'
import Search from './Search'
import MyInput from './MyInput'
import MyCheckbox from './MyCheckbox'
import Calculator from './Calculator'
import Checked from './Checked'

function App() {
  // const [count, setCount] = useState(0)

  // const [no1, setno1] = useState(0)
  // const [no2, setno2] = useState(0)
  // const [no3, setno3] = useState(0)

  // const add = () => {
  //   setno3(+no1 + +no2)
  // }

  return (
    <>
      <h1>Welcome to the new Project!</h1>

      {/* <div>
        <a href="https://vite.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p> */}


      <Toolbar onPlayMovie={() => alert('Playing a movie')}
              onUploadImage={() => alert('Uploading')} /><br />
      <MyButton text="Click Me" /><br /><br />
      
      <MyInput /> <br />
      <MyCheckbox /><br />

      {/* <h3>Sum of Two Numbers:</h3>
      <input name="no1"  onChange={(e) => setno1(parseInt(e.target.value))} />{" "}
      <input name="no2"  onChange={(e) => setno2(parseInt(e.target.value))} />{" "}
      <button type='button' onClick={add}>Sum</button>{" "}
      <input name="no3" value={no3} disabled />
      
      <h3>Sum: {no3}</h3>
      <br /> */}

      <Calculator /><br /><br />


      <Checked /><br />
     {/* <Search onQuery={setquery}/> */}


    </>
  )
}

export default App
