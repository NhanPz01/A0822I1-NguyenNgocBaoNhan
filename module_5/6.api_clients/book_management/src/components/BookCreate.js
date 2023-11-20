import { ErrorMessage, Field, Form, Formik } from "formik"
import { useEffect, useState } from "react"
import * as Yup from 'yup'
import * as bookService from '../services/Book.js'
import { useNavigate } from "react-router-dom"


const BookCreate = () => {
  const [book, setBook] = useState({})
  const navigate = useNavigate()
  const bookValidate = {
    title: Yup.string()
      .required(' is required'),
    quantity: Yup.number()
      .required(' is required')
      .min(0, ' can\'t be negative')
  }

  useEffect(() => {
    setBook({
      title: '',
      quantity: 0
    })
  }, [])

  const saveBook = async (values) => {
    await bookService.save(values)
  }

  const handleCancel = () => {
    navigate('/')
  }

  return (
    <>
      <div className="flex m-5">
        <h1 className="flex-fill">Add a new book</h1>
        <button
          className="btn btn-outline-dark rounded-5"
          onClick={handleCancel}
        >
          Return to main menu
        </button>
      </div>
      <Formik
        initialValues={book}

        onSubmit={(values) => {
          console.log(values)
          saveBook(values)
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
          <button type="submit" className="btn btn-outline-secondary">Submit</button>
        </Form>
      </Formik>
    </>
  )
}

export default BookCreate