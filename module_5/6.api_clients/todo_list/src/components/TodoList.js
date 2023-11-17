import { useEffect, useState } from "react"
import * as TodoListService from '../services/TodoListService'

const TodoList = () => {
  const [todo, setTodo] = useState({content: ''})
  const [todoList, setTodoList] = useState([])

  useEffect(() => {
    getAllTodos()
  }, [todoList])

  const getAllTodos = async () => {
    const data = await TodoListService.getAll()
    setTodoList(data)
  }
  
  const handleChange = (value) => {
    setTodo(
      {
        ...todo,
        content: value
      }
    )
  }

  const handleCreate = async () => {
    await TodoListService.save(todo)
    setTodo({content: ''})
  }

  return (
    <>
      <h1>Todo List</h1>
      <input onChange={(event) => handleChange(event.target.value)} value={todo.content} />
      <button onClick={handleCreate}>Submit</button>
      <ul>
      {
        todoList.map((todo) => {
          return (
            <li key={todo.id}>{todo.content}</li>
          )
        })
      }
      </ul>
    </>
  )
}

export default TodoList