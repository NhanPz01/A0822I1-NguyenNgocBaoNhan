import { ErrorMessage, Field, Form, Formik } from "formik"
import { useEffect, useState } from "react"
import * as Yup from 'yup'
import * as bookService from '../services/Book.js'


const BookCreate = () => {
  const [book, setBook] = useState({})
  const bookValidate = {
    title: Yup.string()
      .required(' is required'),
    number: Yup.number()
      .required(' is required')
      .min(0, ' can\'t be negative')
  }

  useEffect(() => {
    setBook({
      title: '',
      number: 0
    })
  }, [])

  const saveBook = async (values) => {
    await bookService.save(values)
  }

  return (
    <>
      <Formik
        initialValues={book}

        onSubmit={(values) => {
          console.log(values)
          saveBook(values)
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
            <ErrorMessage className="error" name="number" component="span"></ErrorMessage>
            <Field type="number" className="form-control" name="number" id="bookNumber" />
          </div>
          <br />
          <button type="submit" className="btn btn-outline-secondary">Submit</button>
        </Form>
      </Formik>
    </>
  )
}

export default BookCreate