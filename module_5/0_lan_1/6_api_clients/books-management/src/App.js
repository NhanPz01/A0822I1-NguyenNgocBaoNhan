import './App.css';
import ListBook from "./components/ListBook";
import NavBar from "./components/NavBar";
import AddNew from "./components/AddNew";
import {BrowserRouter, Outlet, Route, Routes} from "react-router-dom";


function App() {
    return (
        <>
            <NavBar/>
            <BrowserRouter>
                <Routes>
                    <Route path="" element={<Outlet/>}>
                        <Route index element={<ListBook/>}/>
                    </Route>
                    <Route path="/new" element={<Outlet/>}>
                        <Route index element={<AddNew/>}/>
                    </Route>
                </Routes>
            </BrowserRouter>
        </>
    );
}

export default App;
