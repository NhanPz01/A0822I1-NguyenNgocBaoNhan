import { useState, useEffect } from 'react';
import api from './api/Todos'
import './App.css';

function App() {
  const [todos, setTodos] = useState([]);
  const retrieveTodos = async () => {
    const response = await api.get('/todos')
    return response.data
  }

  useEffect(() => {
    const getAllTodos = async () => {
      const allTodos = await retrieveTodos()
      if (allTodos) setTodos(allTodos)
    }
    getAllTodos()
  }, [])


  return (
    <>
      <section className="wallpaper vh-100">
        <div className="container py-5 h-100">
          <div className="row d-flex justify-content-center align-items-center h-100">
            <div className="col col-lg-8 col-xl-6">
              <div className="card rounded-3">
                <div className="card-body p-4">

                  <p className="mb-2"><span className="h2 me-2">Team Meeting</span> <span
                    className="badge bg-danger">checklist</span></p>
                  <p className="text-muted pb-2">04/01/2020 • ML - 1321</p>

                  <ul className="list-group rounded-0">
                    {
                      todos.map(todo => (
                        <li className="list-group-item border-0 d-flex align-items-center ps-0">
                          <input className="form-check-input me-3" type="checkbox" value="" aria-label="..." checked />
                          <s key={todo.id}>{todo.content}</s>
                        </li>
                      ))
                    }
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </>
  );
}

export default App;
