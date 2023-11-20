import { ErrorMessage, Field, Form, Formik } from 'formik'
import * as bookService from '../services/Book'
import * as Yup from 'yup'
import { useNavigate } from 'react-router-dom'
import { useEffect, useState } from 'react'

const BookEdit = () => {
  const [bookId, setBookId] = useState(-1)
  const [editBook, setEditBook] = useState({})
  const navigate = useNavigate()
  const bookValidate = {
    title: Yup.string()
      .required(' is required'),
    number: Yup.number()
      .required(' is required')
      .min(0, ' can\'t be negative')
  }

  useEffect(() => {
    let url = window.location.href.split('/')
    let indexParam = url[url.length - 1]
    console.log(indexParam);
    setBookId(indexParam)
    getEditBook(bookId)
  }, [bookId])

  const getEditBook = async (index) => {
    const response = await bookService.getBook(index)
    console.log(response);
    setEditBook(response[0])
  }

  const handleEdit = async (value) => {
    await bookService.update(value)
    navigate('/')
    alert('Book updated')
  }

  const handleCancel = () => {
    navigate('/')
  }

  if (!editBook) {
    return null
  }

  return (
    <>
      <div className="flex m-5">
        <h1 className="flex-fill">Edit</h1>
        <button
          className="btn btn-outline-dark rounded-5"
          onClick={handleCancel}
        >
          Return to main menu
        </button>
      </div>
      <Formik
        initialValues={editBook}

        onSubmit={(values) => {
          console.log(values)
          handleEdit(values)
          navigate('/')
          alert('Save successfully')
        }}

        validationSchema={Yup.object(bookValidate)}
      >
        <Form>
          <div className="form-group">
            <label htmlFor="bookTitle">Title</label>
            <ErrorMessage className="error" name="title" component="span"></ErrorMessage>
            <Field type="text" className="form-control" name="title" id="bookTitle" />
          </div>
          <br />
          <div className="form-group">
            <label htmlFor="bookNumber">Number</label>
            <ErrorMessage className="error" name="quantity" component="span"></ErrorMessage>
            <Field type="number" className="form-control" name="quantity" id="bookNumber" />
          </div>
          <br />
          <button type="submit" className="btn btn-success rounded-5 rounded-end-0">Save</button>
          <button type="submit" onClick={handleCancel} className="btn btn-danger rounded-5 rounded-start-0">Cancel</button>
        </Form>
      </Formik>
    </>
  )
}

export default BookEdit