import { useState, useEffect } from "react"
import StudentEditModal from "./StudentEditModal"

export default function StudentList() {
  const [students, setStudents] = useState([])
  const [student, setStudent] = useState({
    id: 0,
    name: '',
    phone: '',
    email: ''
  })
  const [name, setName] = useState("")
  const [openEditModal, setOpenEditModal] = useState(false)

  useEffect(() => {
    setStudents([
      {
        id: 1,
        name: 'Nguyen Van A',
        phone: '0912444232',
        email: 'nva@gmail.com'
      },
      {
        id: 2,
        name: 'Le Thi B',
        phone: '0987246152',
        email: 'ltb@gmail.com'
      },
      {
        id: 3,
        name: 'Tran Duc C',
        phone: '0987384646',
        email: 'tdc@gmail.com'
      }
    ])

    setStudents((prev) => {
      return prev.filter((item) => item.name.toLowerCase().includes(name.toLowerCase()))
    })

  }, [name])

  const getInput = (key, value) => {
    setStudent((prev) => {
      return {
        ...prev,
        [key]: value
      }
    })
  }

  const handleCreate = () => {
    setStudents((prev) => {
      return [
        ...prev,
        student
      ]
    })
    setStudent({
      id: 0,
      name: '',
      phone: '',
      email: ''
    })
  }

  const handleRemove = (student) => {
    if (window.confirm('Are you sure you want to remove this student?')) {
      setStudents((prev) => {
        return prev.filter((item) => item.id !== student.id)
      })
    }
  }

  const handleEdit = (student) => {

  }

  const handleEditModal = (status) => {
    if (status === true) {
      console.log("ahihi true")
      setOpenEditModal(true)
    } else {
      console.log("uhuhu false")
      setOpenEditModal(false)
    }
  }

  return (
    <>
      <form className="flex float-start w-100 m-3">
        <div className="form-group row">
          <label htmlFor="id" className="col-sm-2 col-form-label">ID</label>
          <div className="col-sm-9">
            <input value={student.id} type="number" className="form-control" id="id" placeholder="ID..." onChange={(evt) => { getInput("id", evt.target.value) }} />
          </div>
        </div>
        <div className="form-group row">
          <label htmlFor="name" className="col-sm-2 col-form-label">Name</label>
          <div className="col-sm-9">
            <input value={student.name} type="text" className="form-control" id="name" placeholder="Name..." onChange={(evt) => { getInput("name", evt.target.value) }} />
          </div>
        </div>
        <div className="form-group row">
          <label htmlFor="phone" className="col-sm-2 col-form-label">Phone</label>
          <div className="col-sm-9">
            <input value={student.phone} type="text" className="form-control" id="phone" placeholder="Phone..." onChange={(evt) => { getInput("phone", evt.target.value) }} />
          </div>
        </div>
        <div className="form-group row">
          <label htmlFor="email" className="col-sm-2 col-form-label">Email</label>
          <div className="col-sm-9">
            <input value={student.email} type="text" className="form-control" id="email" placeholder="Email..." onChange={(evt) => { getInput("email", evt.target.value) }} />
          </div>
        </div>
        <button type="button" className="btn btn-outline-secondary flex-fill rounded-end-0" onClick={handleCreate}>Add new</button>
      </form>
      <br />
      <br />
      <h3>Find student</h3>
      <div className="flex float-start w-100">
        <input className="form-control rounded-0" placeholder="Search by name..." onChange={(evt) => setName(evt.target.value)} />
      </div>


      <div>
        <table className="table student-table">
          <thead className="table-dark">
            <tr>
              <th scope="col">#</th>
              <th scope="col">Name</th>
              <th scope="col">Phone</th>
              <th scope="col">Email</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
            {
              students.map((student, index) => {
                return (
                  <tr key={index}>
                    <th scope="row">{index + 1}</th>
                    <td><input value={student.name} className="form-control" readOnly/></td>
                    <td>{student.phone}</td>
                    <td>{student.email}</td>
                    <td className="flex justify-content-center">
                      <button className="btn btn-outline-warning flex-grow-1" onClick={() => handleEditModal(true)}>Edit</button>
                      <button className="btn btn-outline-danger flex-grow-1" onClick={() => handleRemove(student)}>Remove</button>
                    </td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
      <StudentEditModal isOpen={openEditModal} onClose={() => handleEditModal(false)} />

    </>
  )
}