import { useState } from 'react'
import './App.css'
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom'
import Home from './Home'
import Dashboard from './Dashboard'
import Protected from './Protected'
import Product from './Product'
import Displayemp from './Displayemp'
import MarkdownEditor from './MarkdownEditor'

function App() {
  const [isSignedIn, setIsSignedIn] = useState(null);
  const signin = () => {
    setIsSignedIn(true)
  }
  const signout = () => {
    setIsSignedIn(false)
  }
  return (
    <div>
      <h2>React Protected Routes Example</h2>

      <BrowserRouter>
        <Link to='/Home'>Home</Link> {' | '}
        <Link to='/Dashboard'>Dashboard</Link> {' | '}
        <Link to='/Product'>Product</Link> {' | '}
        <Link to='/MarkdownEditor'>MarkdownEditor</Link> {' | '}
        <Link to='/Displayemp'>Displayemp</Link>
        {isSignedIn ? (
          <div>
            <button onClick={signout}> Sign out </button>
          </div>
        ) : (
          <div>
            <button onClick={signin}> Sign in </button>
          </div>
        )}
        <Routes>
          <Route path="/" element={
          <Protected isSignedIn={isSignedIn}> <Home /> </Protected>} />

          <Route path="/Home" element={
            <Protected isSignedIn={isSignedIn}> <Home /> </Protected>
          } />

          <Route path="/Product" element={
            <Protected isSignedIn={isSignedIn}> <Product /> </Protected>
          } />
          <Route path="/Dashboard" element={
            <Protected isSignedIn={isSignedIn}> <Dashboard /> </Protected>
          } />

          <Route path="/Displayemp" element={
            <Protected isSignedIn={isSignedIn}> <Displayemp /> </Protected>
          } />

          <Route path="/MarkdownEditor" element={
            <Protected isSignedIn={isSignedIn}> <MarkdownEditor /> </Protected>
          } />

          <Route path="*" element={<h2>Page not found</h2>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}
export default App;