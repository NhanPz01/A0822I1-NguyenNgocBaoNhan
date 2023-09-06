import './App.css';
import Header from './components/Header';
import NavBar from './components/Navbar';
import Footer from "./components/Footer";

function App() {
    return (
        <div className="App">
            <div className="body">
                <Header/>
                <NavBar/>

                <Footer />
            </div>
        </div>
    );
}

export default App;
