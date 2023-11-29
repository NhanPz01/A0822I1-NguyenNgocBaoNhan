import axios from 'axios'

export const getAll = async (name) => {
  const response = await axios.get('http://localhost:8080/song?name_like=' + name)
  return response.data
}

export const save = async (value) => {
  const response = await axios.post('http://localhost:8080/song', value)
  return response.status
}

export const update = async (value) => {
  value = {
    ...value,
    "status": "public"
  }
  const response = await axios.put(`http://localhost:8080/song/${value.id}`, value)
  return response.status
}

export const remove = async (index) => {
  const response = await axios.delete(`http://localhost:8080/song/${index}`)
  return response.status
}