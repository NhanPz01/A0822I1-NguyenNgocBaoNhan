import { useEffect, useState } from "react"
import * as bookService from "../services/Book"
import { NavLink, useNavigate } from "react-router-dom"


const BookList = () => {
  const [books, setBooks] = useState([])
  const navigate = useNavigate()

  useEffect(() => {
    getBooks()
  }, [books])

  const getBooks = async () => {
    const response = await bookService.getAll()
    console.log(response);
    setBooks(response)
  }

  const handleEdit = (index) => {
    navigate('/books/' + index)
  }

  const handleDelete = async (id) => {
    if (window.confirm('Are you sure you want to delete')) {
      await bookService.remove(id)
    }
  }

  if (!books) {
    return null
  }

  return (
    <>
      <div className="flex m-5">
        <h1 className="flex-fill">Library</h1>
        <button className="btn btn-success rounded-5">
          <NavLink
            to="/create"
            style={{
              color: "white",
              textDecoration: "none"
            }}
          >
            Add a new book
          </NavLink>
        </button>
      </div>
      <div className="container">
        <table className="table table-hover">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Title</th>
              <th scope="col">Quantity</th>
              <th scope="col" className="text-right">Actions</th>
            </tr>
          </thead>
          <tbody>
            {
              books.map((book, index) => {
                return (
                  <tr key={book.id}>
                    <th scope="row">{index + 1}</th>
                    <td>{book.title}</td>
                    <td>{book.quantity}</td>
                    <td>
                      <button className="btn btn-secondary rounded-4 rounded-end-0" onClick={() => handleEdit(book.id)}>Edit</button>
                      <button className="btn btn-danger rounded-4 rounded-start-0" onClick={() => handleDelete(book.id)}>Delete</button>
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

export default BookList