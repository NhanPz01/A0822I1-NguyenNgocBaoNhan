import './App.css';
import ListUser from "./components/ListUser";
import {Provider} from "react-redux";
import store from "./redux/Store";

function App() {
    return (
        <Provider store={store}>
            <div className="App">
                <a href="/">
                    <button className="btn btn-grad">
                        <h1>User list</h1>
                    </button>
                </a>
                <br/>
                <ListUser/>
            </div>
        </Provider>
    );
}

export default App;
