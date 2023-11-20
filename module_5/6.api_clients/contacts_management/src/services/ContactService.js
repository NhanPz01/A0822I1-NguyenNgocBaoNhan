import axios from 'axios'


export const getAll = async () => {
  const response = await axios.get('https://my-json-server.typicode.com/codegym-vn/mock-api-contacts/contacts') 
  return response.data
}

export const save = async (values) => {
  const response = await axios.post(`https://my-json-server.typicode.com/codegym-vn/mock-api-contacts/contacts`, values)
  return response.status
}

export const remove = async (index) => {
  const response = await axios.delete(`https://my-json-server.typicode.com/codegym-vn/mock-api-contacts/contacts/${index}`)
  return response.status
}