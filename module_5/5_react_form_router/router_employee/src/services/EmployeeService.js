import axios from 'axios';

export const getAll = async () => {
  const response = await axios.get('http://localhost:8080/employees')
  console.log(response.data)
  return response.data
}

export const getById = async (index) => {
  const response = await axios.get(`http://localhost:8080/employees/${index}`)
  console.log(response.data)
  return response.data
}