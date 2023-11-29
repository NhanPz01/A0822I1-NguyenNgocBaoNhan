import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import SongList from './components/SongList';

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<SongList />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
