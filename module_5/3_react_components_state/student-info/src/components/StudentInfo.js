
let students = [
  {
    "id": 1,
    "name": "Nguyen Van A",
    "age": 18,
    "address": "01 Ton Duc Thang"
  },
  {
    "id": 2,
    "name": "Tran Thi B",
    "age": 20,
    "address": "02 Le Loi"
  },
  {
    "id": 3,
    "name": "Pham Van C",
    "age": 22,
    "address": "03 Nguyen Hue"
  },
  {
    "id": 4,
    "name": "Le Van D",
    "age": 19,
    "address": "04 Hoang Dieu"
  },
  {
    "id": 5,
    "name": "Nguyen Thi E",
    "age": 21,
    "address": "05 Vo Van Tan"
  },
  {
    "id": 6,
    "name": "Tran Van F",
    "age": 23,
    "address": "06 Hai Ba Trung"
  }
]

export default function StudentInfo() {
  return (
    <>
      <table className="table">
        <thead className="thead-dark">
          <tr>
            <th scope="col">#</th>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Age</th>
            <th scope="col">Address</th>
          </tr>
        </thead>
        <tbody>
          {
            students.map((student, index) => (
              <tr>
                <th scope="row">{index + 1}</th>
                <td>{student.id}</td>
                <td>{student.name}</td>
                <td>{student.age}</td>
                <td>{student.address}</td>
              </tr>
            ))
          }
        </tbody>
      </table>
    </>
  )
}