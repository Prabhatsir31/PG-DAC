import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import './index.css'
import DigitalClock from './Components/DigitalClock'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <DigitalClock />
     
    </>
  )
}

export default App
