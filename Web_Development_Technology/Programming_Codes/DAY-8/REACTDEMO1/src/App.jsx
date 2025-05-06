import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Header from './Header'
import Employee from './Employee'
import MyApp from './MyApp'
import ImageData from './ImageData';
import Profile from './Profile'
import Gallery from './Gallery'

function App() {
  return (
    <div>
      {/* <Header />
      <Employee name="Prabhat" salary="50000" dept="Placement" head="Pooja Mam" /> */}

      {/* <MyApp />
      <ImageData /> */}
      <Profile />
      <Gallery />

    </div>
  );
}
export default App;
