import React from "react";

export default function Todo({ todo, onDelete }) {
  const handleDelete = () => {
    onDelete(todo.id);
  };

  return (
    <li>
      {todo.todo}
      <button onClick={handleDelete}>x</button>
    </li>
  );
}
