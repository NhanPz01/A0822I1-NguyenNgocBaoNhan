import React, { useState } from "react";
import Todo from "./Todo";

export default function TodoList() {
  const [todos, setTodos] = useState([
    {
      id: 1,
      todo: "Learn Java",
    },
    {
      id: 2,
      todo: "Do homework",
    },
  ]);

  const [newTodo, setNewTodo] = useState("");

  const addTodo = () => {
    if (newTodo.trim() === "") return;
    const newTask = {
      id: todos.length + 1,
      todo: newTodo,
    };
    setTodos([...todos, newTask]);
    setNewTodo("");
  };

  const deleteTodo = (id) => {
    const updatedTodos = todos.filter((todo) => todo.id !== id);
    setTodos(updatedTodos);
  };

  return (
    <div className="container">
      <div className="todo-app">
        <div className="app-title">
          <h2>To-do app</h2>
          <i className="fa-solid fa-book-bookmark" />
        </div>
        <div className="row">
          <input
            type="text"
            id="input-box"
            placeholder="add your tasks"
            value={newTodo}
            onChange={(e) => setNewTodo(e.target.value)}
          />
          <button onClick={addTodo}>Add</button>
        </div>
        <ul id="list-container">
          {todos.map((todo) => (
            <Todo key={todo.id} todo={todo} onDelete={() => deleteTodo(todo.id)} />
          ))}
        </ul>
      </div>
    </div>
  );
}
