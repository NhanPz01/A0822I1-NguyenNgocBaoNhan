import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <h1>Students</h1>
    <App />
  </React.StrictMode>
);

export const students = [
  {
    company: 'Codegym 1',
    contact: 'Maria Anders',
    country: 'Germany'
  },
  {
    company: 'Codegym 2',
    contact: 'Francisco Chang',
    country: 'Mexico'
  },
  {
    company: 'Codegym 3',
    contact: 'Roland Mendel',
    country: 'Austria'
  },
  {
    company: 'Codegym 4',
    contact: 'Helen Bennett',
    country: 'UK'
  },
  {
    company: 'Codegym 5',
    contact: 'Yoshi Tannamuri',
    country: 'Canada'
  },
  {
    company: 'Codegym 6',
    contact: 'Giovanni Rovelli',
    country: 'Italy'
  }
];

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
