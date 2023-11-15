import { useEffect, useState } from "react"
import BookCreate from "./BookCreate"
import * as bookService from "../services/Book"
import BookEdit from "./BookEdit"


const BookList = () => {
  const [books, setBooks] = useState([])
  const [isEditMode, setIsEditMode] = useState(false)
  const [editingBook, setEditingBook] = useState({})

  useEffect(() => {
    getBooks()
  }, [books])

  const getBooks = async () => {
    const response = await bookService.getAll()
    setBooks(response)
  }

  const handleEditMode = (book) => {
  }

  
  const handleCancelEditMode = () => {
    setIsEditMode(false)
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
      <BookCreate />
      <br />
      <div className="container">
        <BookEdit editing={isEditMode} book={editingBook} onCancel={handleCancelEditMode}/>
        <table className="table table-hover">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Title</th>
              <th scope="col">Number</th>
              <th scope="col">Actions</th>
            </tr>
          </thead>
          <tbody>
            {
              books.map((book, index) => {
                return (
                  <tr key={book.id}>
                    <th scope="row">{index + 1}</th>
                    <td>{book.title}</td>
                    <td>{book.number}</td>
                    <td>
                      <button className="btn btn-secondary rounded-end-0" onClick={() => handleEditMode(book)}>Edit</button>
                      <button className="btn btn-danger rounded-start-0" onClick={() => handleDelete(book.id)}>Delete</button>
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