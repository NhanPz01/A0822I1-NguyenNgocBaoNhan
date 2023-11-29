import axios from 'axios'

export const getAll = async () => {
  const response = await axios.get('http://localhost:8080/facilities')
  return response.data
}

export const save = async(value) => {
  try {
    const response = await axios.post(`http://localhost:8080/facilities`, value)
    return response.status
  } catch (error) {
    console.log(error)
  }
}

export const update = async (value) => {
  const response = await axios.put(`http://localhost:8080/facilities/${value.id}`, value)
  return response.status
}