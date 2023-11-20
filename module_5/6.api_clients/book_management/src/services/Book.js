import axios from "axios"

export const getAll = async () => {
  const response = await axios.get('http://localhost:8080/books?_sort=quantity&_order=desc')
  return response.data
}

export const getBook = async (index) => {
  const response = await axios.get(`http://localhost:8080/books?id=${index}`)
  return response.data
}

export const save = async (value) => {
  const response = await axios.post('http://localhost:8080/books', value)
  return response.status
}

export const update = async (value) => {
  const response = await axios.put(`http://localhost:8080/books/${value.id}`, value)
  return response.status
}

export const remove = async (index) => {
  const response = await axios.delete(`http://localhost:8080/books/${index}`)
  return response.status
}