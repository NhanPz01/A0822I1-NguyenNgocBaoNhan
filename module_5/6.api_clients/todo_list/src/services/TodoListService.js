import axios from "axios"

export const getAll = async () => {
  const response = await axios.get('http://localhost:8080/todos')
  return response.data
}

export const save = async (value) => {
  const response = await axios.post('http://localhost:8080/todos', value)
  return response.status
}