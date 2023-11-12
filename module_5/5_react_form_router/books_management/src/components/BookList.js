import { useEffect, useState } from "react"
import BookCreate from "./BookCreate"
import * as bookService from "../services/Book"


const BookList = () => {
  const [books, setBooks] = useState([])

  useEffect(() => {
    getBooks()
  }, [books])

  const getBooks = async () => {
    const response = await bookService.getAll()
    setBooks(response)
  }

  if (!books) {
    return null
  }

  return (
    <>
      <BookCreate />
      <br />
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
                    <button className="btn btn-primary rounded-end-0">Edit</button>
                    <button className="btn btn-danger rounded-start-0">Delete</button>
                  </td>
                </tr>
              )
            })
          }
        </tbody>
      </table>

    </>
  )
}

export default BookList