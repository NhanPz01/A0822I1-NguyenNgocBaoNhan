import { useEffect, useState } from "react"
import * as ContactService from '../services/ContactService'
import { NavLink } from "react-router-dom"

const ContactList = () => {
  const [contactList, setContactList] = useState([])

  useEffect(() => {
    getAllContact()
  }, [contactList])

  const getAllContact = async () => {
    const data = await ContactService.getAll()
    setContactList(data)
  }

  const handleEdit = () => {
    alert('Edit Contact')
  }

  const handleDelete = (index) => {
    if(window.confirm('Delete Contact') === true) {
      return ContactService.remove(index)
    }
    return null
  }

  return (
    <>
      <div className="flex m-5">
        <h1 className="flex-fill">Contacts</h1>
        <button className="btn btn-success rounded-5">
          <NavLink
            to="/create"
            style={{
              color: "white",
              textDecoration: "none"
            }}
          >
            Add contact
          </NavLink>
        </button>
      </div>
      <div className="container">
        <table className="table table-hover">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Name</th>
              <th scope="col">Email</th>
              <th scope="col">Phone</th>
              <th scope="col" className="text-right">Actions</th>
            </tr>
          </thead>
          <tbody>
            {
              contactList.map((contact, index) => {
                return (
                  <tr key={contact.id}>
                    <th scope="row">{index + 1}</th>
                    <td>{contact.name}</td>
                    <td>{contact.email}</td>
                    <td>{contact.phone}</td>
                    <td>
                      <button className="btn btn-secondary rounded-4 rounded-end-0" onClick={() => handleEdit()}>Edit</button>
                      <button className="btn btn-danger rounded-4 rounded-start-0" onClick={() => handleDelete(contact.id)}>Delete</button>
                    </td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
    </>
  )
}

export default ContactList