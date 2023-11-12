import axios from 'axios';

export const getAll = async () => {
  const response = await axios.get('http://localhost:8080/books?_sort=number&_order=desc')
  return response.data
}

export const get = async (id) => {
  const response = await axios.get(`http://localhost:8080/books/${id}`)
  return response.data
}

export const save = async (value) => {
  const response = await axios.post('http://localhost:8080/books', value)
  return response.status
}

export const update = async (value) => {
  const response = await axios.put('http://localhost:8080/books', value)
  return response.status
}

export const remove = async (id) => {
  const response = await axios.delete(`http://localhost:8080/books/${id}`)
  return response.status
}