import { useState } from "react"

export default function StudentList() {
  const [students, setStudents] = useState([
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


  return (
    <>
      <div>
        <table className="table student-table">
          <thead className="thead-dark">
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
                  <tr>
                    <th scope="row">1</th>
                    <td>{student.name}</td>
                    <td>{student.phone}</td>
                    <td>{student.email}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
        <table className="table">
          <thead className="thead-light">
            <tr>
              <th scope="col">#</th>
              <th scope="col">First</th>
              <th scope="col">Last</th>
              <th scope="col">Handle</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>
              <td>Mark</td>
              <td>Otto</td>
              <td>@mdo</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>Jacob</td>
              <td>Thornton</td>
              <td>@fat</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
          </tbody>
        </table>
      </div>

    </>
  )
}