import './App.css';
import NavBar from './components/prototype/Navbar';
import {BrowserRouter, Outlet, Route, Routes} from "react-router-dom";
import Header from './components/prototype/Header';
import Footer from "./components/prototype/Footer";
import React from "react";
import ListService from "./components/model/service/ListService";

function App() {
    return (
        <div className="App">
            <div className="body">
                <Header/>
                <NavBar/>
                <div className="container">
                    <BrowserRouter>
                        <Routes>
                            <Route path="" element={<Outlet/>}>
                                <Route index element={<ListService/>}/>
                            </Route>
                            <Route path="" element={<Outlet/>}>
                                <Route index element={<ListService/>}/>
                            </Route>
                        </Routes>
                    </BrowserRouter>
                </div>
                <Footer/>
            </div>
        </div>
    )
}

export default App;
