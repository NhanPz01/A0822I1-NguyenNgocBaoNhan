import './App.css';
import NavBar from './components/prototype/Navbar';
import {BrowserRouter, Outlet, Route, Routes} from "react-router-dom";
import Header from './components/prototype/Header';
import Footer from "./components/prototype/Footer";
import React from "react";
import ListService from "./components/model/service/ListService";
import ListCustomer from "./components/model/customer/ListCustomer";
import {ListContract} from "./components/model/contract/ListContract";

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
                            <Route path="/customer" element={<Outlet/>}>
                                <Route index element={<ListCustomer/>}/>
                            </Route>
                            <Route path="/contract" element={<Outlet/>}>
                                <Route index element={<ListContract/>}/>
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
