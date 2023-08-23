import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import StudentInfoComponent from './StudentInfoComponent';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <StudentInfoComponent />
  </React.StrictMode>
);

export const students = [
  {
    id: 1,
    name: 'Nguyen Van A',
    age: 18,
    address: 'Da Nang'
  },
  {
    id: 2,
    name: 'Nguyen Van B',
    age: 18,
    address: 'Da Nang'
  },
  {
    id: 3,
    name: 'Nguyen Van C',
    age: 18,
    address: 'Da Nang'
  },
  {
    id: 4,
    name: 'Nguyen Van D',
    age: 18,
    address: 'Da Nang'
  },
  {
    id: 5,
    name: 'Nguyen Van E',
    age: 18,
    address: 'Da Nang'
  },
  {
    id: 6,
    name: 'Nguyen Van F',
    age: 18,
    address: 'Da Nang'
  },
  {
    id: 7,
    name: 'Nguyen Van G',
    age: 18,
    address: 'Da Nang'
  }
];

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
