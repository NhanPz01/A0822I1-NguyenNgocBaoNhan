import { ErrorMessage, Field, Form, Formik } from 'formik'
import * as bookService from '../services/Book'
import * as Yup from 'yup'

const BookEdit = ({ editing, book, onCancel }) => {
  const bookValidate = {
    title: Yup.string()
      .required(' is required'),
    number: Yup.number()
      .required(' is required')
      .min(0, ' can\'t be negative')
  }

  if (!editing) {
    return null
  }

  const handleEdit = async (value) => {
    await bookService.update(value)
    onCancel()
    alert('Book updated')
  }

  return (
    <>
      <Formik
        initialValues={book}

        onSubmit={(values) => {
          console.log(values)
          handleEdit(values)
        }}

        validationSchema={Yup.object(bookValidate)}
      >
        <Form>
          <table className="table table-hover">
            <thead>
              <tr>
                <th scope="col">
                  Title
                  <ErrorMessage className="error" name="title" component="span"></ErrorMessage>
                </th>
                <th scope="col">
                  Number
                  <ErrorMessage className="error" name="number" component="span"></ErrorMessage>
                </th>
                <th scope="col">Actions</th>
              </tr>
            </thead>
            <tbody>
              {
                <tr key={book.id}>

                  <td>
                    <Field type="text" className="form-control" name="title" id="bookTitle" />
                  </td>
                  <td><Field type="number" className="form-control" name="number" id="bookNumber" /></td>
                  <td>
                    <button type='submit' className="btn btn-success rounded-end-0">Save</button>
                    <button className="btn btn-warning rounded-start-0" onClick={onCancel}>Cancel</button>
                  </td>
                </tr>
              }
            </tbody>
          </table>
        </Form>
      </Formik>
    </>
  )
}

export default BookEdit