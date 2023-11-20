import axios from "axios"

export const getAll = async () => {
  const response = await axios.get('http://localhost:8080/contract')
  return response.data
}