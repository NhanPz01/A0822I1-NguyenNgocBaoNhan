import logo from './logo.svg';
import './App.css';
import Counter1 from './components/Counter1.js';
import Counter2 from './components/Counter2.js';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Counter1 />
        <Counter2 />
      </header>
    </div>
  );
}

export default App;
