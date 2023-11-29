import React, { useEffect, useMemo, useState } from "react";
import { PlusCircleFill } from "react-bootstrap-icons";
import * as bookService from "../../service/BookService"
import { CreateBookModal } from "./CreateBook";
import { Container, Nav, Navbar } from "react-bootstrap";
import { Field, Form, Formik } from "formik";
import data from "../../../data/db.json";

export default function ListCustomer() {
    const [bookList, setBookList] = useState([])
    const [name, setName] = useState('')
    const [showCreateModal, setShowCreateModal] = useState(false)
    const typeData = data["type"]
    useEffect(() => {
        getBookList();
    }, [bookList, name]);

    const getBookList = async () => {
        const list = await bookService.getAll(name);
        setBookList(list);
    }

    return (
        <>
            <Navbar bg="dark" variant="dark" expand="lg">
                <Container>
                    <Navbar.Brand href="/">Home</Navbar.Brand>
                    <Navbar.Toggle aria-controls="navbar-nav" />
                    <Navbar.Collapse id="navbar-nav">

                        <Nav className="ml-auto">
                            <Nav.Link href="#">
                                <input className="form-control" type="text" placeholder="Search"
                                    aria-label="Search" onChange={(evt) => setName(evt.target.value)} />
                            </Nav.Link>
                            <Nav.Link href="#">
                                <input as="select" name="type" className="form-control">
                                    <option value={""}>--Chọn thể loại--</option>
                                    {
                                        typeData.map((type) => (
                                            <option key={'t' + type} value={type}>{type}</option>
                                        ))
                                    }
                                </input>
                            </Nav.Link>
                            {/*<button form="search-book" type="submit" className="btn btn-primary">Search</button>*/}
                        </Nav>
                    </Navbar.Collapse>
                </Container>
            </Navbar>
            <div className="btn-create mb-3 mt-3 justify-content-center" style={{}}>
                <button
                    type="button"
                    className="btn btn-success"
                    onClick={() => setShowCreateModal(true)}
                >
                    Add new &nbsp;<PlusCircleFill />
                </button>

            </div>
            &nbsp;
            <div className="row">
                <table className="table">
                    <thead>
                        <th scope="col">No</th>
                        <th scope="col">ID</th>
                        <th scope="col">Name</th>
                        <th scope="col">Type</th>
                        <th scope="col">Get date</th>
                        <th scope="col">Quantity</th>
                    </thead>
                    <tbody>
                        {bookList.map((book, key) => (
                            <tr key={key}>
                                <td>{key + 1}</td>
                                <td>{book.cId}</td>
                                <td>{book.name}</td>
                                <td>{book.type}</td>
                                <td>{book.getDate}</td>
                                <td>{book.quantity}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
            <CreateBookModal showModal={showCreateModal} setShowModal={setShowCreateModal} />
        </>
    )
}