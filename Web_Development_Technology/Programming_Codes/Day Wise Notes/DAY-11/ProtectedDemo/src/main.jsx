import React, { StrictMode, Suspense, lazy } from 'react';
import { createRoot } from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './index.css';
import Loading from './Loading.jsx';
import App from './App.jsx';
import DelayForDemo from './delayForDemo.jsx';

const LHome = lazy(() => DelayForDemo(import('./Home')));
// const LApp = lazy(() => DelayForDemo(import('./App')));

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <BrowserRouter>
      <Suspense fallback={<Loading />}>
        <Routes>
          <Route path="/" element={<LHome />} />
          {/* <Route path="/App" element={<App />} /> */}
        </Routes>
      </Suspense>
    </BrowserRouter>
  </StrictMode>
);
