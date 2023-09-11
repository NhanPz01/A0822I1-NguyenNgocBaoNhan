import {useEffect, useState} from "react";
import * as todoListService from "../service/TodoListService";
import * as Yup from "yup";
import {ErrorMessage, Field, Form, Formik} from "formik";
import {toast} from "react-toastify";

export default function TodoList() {
    const [todos, setTodos] = useState([]);
    useEffect(() => {
        getAll()
    }, []);

    const getAll = async () => {
        const result = await todoListService.getAll()
        setTodos(result)
    }

    const addNewTodo = async (value) => {
        await todoListService.addNewTodo(value);
        toast.success('Thêm mới thành công');
    }

    const todoSchema = Yup.object().shape({
        content: Yup.string().required('Could not empty !'),
    });

    return (
        <>
            <div className="container m-5 p-2 rounded mx-auto bg-light shadow">
                {/*App title section*/}
                <div className="row m-1 p-4">
                    <div className="col">
                        <div className="p-1 h1 text-primary text-center mx-auto display-inline-block">
                            <i className="fa fa-check bg-primary text-white rounded p-2"></i>
                            <u>My Todo-s</u>
                        </div>
                    </div>
                </div>
                {/*Create todo section*/}
                <Formik
                    initialValues={{content: ''}}
                    validationSchema={todoSchema}
                    onSubmit={(values, {resetForm}) => {
                        addNewTodo(values)
                        getAll()
                        resetForm(false)
                    }}
                >
                    {({errors, touched}) => (
                        <Form>
                            <div className="row m-1 p-3">
                                <div className="col col-11 mx-auto">
                                    <div
                                        className="row bg-white rounded shadow-sm p-2 add-todo-wrapper align-items-center justify-content-center">
                                        <div className="col">
                                            <Field
                                                type="text"
                                                name="content"
                                                className={`form-control form-control-lg border-0 add-todo-input bg-transparent rounded ${
                                                    errors.content && touched.content ? 'is-invalid' : ''
                                                }`}
                                                placeholder="Add new .."/>
                                        </div>
                                        <ErrorMessage name="content" component="div" className="invalid-feedback"/>
                                        <div className="col-auto px-0 mx-0 mr-2">
                                            <button type="submit" className="btn btn-primary">Add</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </Form>
                    )}
                </Formik>
                <div className="p-2 mx-4 border-black-25 border-bottom"></div>
                {/*View options section*/}
                <div className="row m-1 p-3 px-5 justify-content-end">
                    <div className="col-auto d-flex align-items-center">
                        <label className="text-secondary my-2 pr-2 view-opt-label">Filter</label>
                        <select className="custom-select custom-select-sm btn my-2">
                            <option value="all" selected>All</option>
                            <option value="completed">Completed</option>
                            <option value="active">Active</option>
                            <option value="has-due-date">Has due date</option>
                        </select>
                    </div>
                    <div className="col-auto d-flex align-items-center px-1 pr-3">
                        <label className="text-secondary my-2 pr-2 view-opt-label">Sort</label>
                        <select className="custom-select custom-select-sm btn my-2">
                            <option value="added-date-asc" selected>Added date</option>
                            <option value="due-date-desc">Due date</option>
                        </select>
                        <i className="fa fa fa-sort-amount-asc text-info btn mx-0 px-0 pl-1" data-toggle="tooltip"
                           data-placement="bottom" title="Ascending"></i>
                        <i className="fa fa fa-sort-amount-desc text-info btn mx-0 px-0 pl-1 d-none"
                           data-toggle="tooltip" data-placement="bottom" title="Descending"></i>
                    </div>
                </div>
                {/*Todo list section*/}
                <div className="row mx-1 px-5 pb-3 w-80">
                    <div className="col mx-auto">
                        {
                            todos.map((todo) => (
                                <div className="row px-3 align-items-center todo-item rounded">
                                    <div className="col px-1 m-1 d-flex align-items-center">
                                        <input type="text"
                                               className="form-control form-control-lg border-0 edit-todo-input bg-transparent rounded px-3"
                                               key={todo.id}
                                               readOnly value={todo.content}
                                               title={todo.content}/>
                                    </div>
                                    <div className="col-auto m-1 p-0 px-3 d-none">
                                    </div>
                                    <div className="col-auto m-1 p-0 todo-actions">
                                        <div className="row d-flex align-items-center justify-content-end">
                                            <h5 className="m-0 p-0 px-2">
                                                <i className="fa fa-pencil text-info btn m-0 p-0" data-toggle="tooltip"
                                                   data-placement="bottom" title="Edit todo"></i>
                                            </h5>
                                            <h5 className="m-0 p-0 px-2">
                                                <i className="fa fa-trash-o text-danger btn m-0 p-0"
                                                   data-toggle="tooltip"
                                                   data-placement="bottom" title="Delete todo"></i>
                                            </h5>
                                        </div>
                                    </div>
                                </div>
                            ))
                        }
                    </div>
                </div>
            </div>
        </>
    )
}