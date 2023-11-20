import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import ContactList from './components/ContactList';
import ContactCreate from './components/ContactCreate';

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<ContactList />} />
          <Route path='/contact' element={<ContactCreate />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
