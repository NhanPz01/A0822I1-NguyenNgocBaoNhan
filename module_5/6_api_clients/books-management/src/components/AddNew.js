import {useState} from "react";
import * as bookService from "../service/ListBookService"
import * as Yup from "yup"
import {toast} from "react-toastify";
import {ErrorMessage, Field, Form, Formik} from "formik";
import {addNewBook} from "../service/ListBookService";

export default function AddNew() {
    const [books, setBooks] = useState([])
    const addNewTodo = async (value) => {
        await bookService.addNewBook(value);
        toast.success('Thêm mới thành công');
    }

    const bookSchema = Yup.object().shape({
        title: Yup.string().required('Could not empty !'),
        quantity: Yup.string().required('Could not empty !'),
    })

    return (
        <>
            <Formik
                initialValues={
                {
                    title: "",
                    quantity: ""
                }
            }
                validationSchema={bookSchema}
                onSubmit={(values, {resetForm}) => {
                    addNewBook(values)
                    resetForm(false)
                }}
            >
                {({errors, touched}) => (
                    <Form>
                        <div className="mb-3">
                            <label htmlFor="exampleInputEmail1" className="form-label">Title</label>
                            <Field
                                type="text"
                                name="title"
                                className={`form-control form-control-lg border-0 add-todo-input bg-transparent rounded ${
                                    errors.title && touched.title ? 'is-invalid' : ''
                                }`}
                            />
                            <ErrorMessage name="title" component="div" className="invalid-feedback"/>
                        </div>
                        <div className="mb-3">
                            <label htmlFor="exampleInputPassword1" className="form-label">Quantity</label>
                            <Field
                                type="number"
                                name="quantity"
                                className={`form-control form-control-lg border-0 add-todo-input bg-transparent rounded ${
                                    errors.quantity && touched.quantity ? 'is-invalid' : ''
                                }`}
                            />
                            <ErrorMessage name="quantity" component="div" className="invalid-feedback"/>
                        </div>
                        <button type="submit" className="btn btn-success">Add</button>
                    </Form>
                )}
            </Formik>

        </>
    )
}