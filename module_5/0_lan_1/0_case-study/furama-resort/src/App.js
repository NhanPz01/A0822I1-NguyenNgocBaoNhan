import './App.css';
import NavBar from './components/prototype/Navbar';
import {BrowserRouter, Outlet, Route, Routes} from "react-router-dom";
import Header from './components/prototype/Header';
import Footer from "./components/prototype/Footer";
import React from "react";
import ListBook from "./components/model/book/ListBook"

function App() {
    return (
        <div className="App">
            <div className="body">
                <Header/>
                <ListBook/>
                <Footer/>
            </div>
        </div>
    )
}

export default App;
