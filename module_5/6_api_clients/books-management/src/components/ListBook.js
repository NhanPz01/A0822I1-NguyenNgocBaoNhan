import {useEffect, useState} from "react";
import * as BookService from "../service/ListBookService"

export default function ListBook() {
    const [books, setBooks] = useState([])

    useEffect(() => {
        getAll()
    }, [])

    const getAll = async () => {
        const result = await BookService.getAll()
        setBooks(result)
    }

    const addNewBook = async (value) => {
        await BookService.addNewBook(value)
    }

    return (
        <>
            
            <table className="table">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Title</th>
                    <th scope="col">Quantity</th>
                    <th scope="col" colSpan="2">Action</th>
                </tr>
                </thead>
                <tbody>
                {
                    books.map((book, index) => (
                        <tr>
                            <th scope="row">{index + 1}</th>
                            <td>{book.title}</td>
                            <td>{book.quantity}</td>
                            <td>
                                <button className="btn btn-warning">Edit</button>
                            </td>
                            <td>
                                <button className="btn btn-danger">Delete</button>
                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
    )
}