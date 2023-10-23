
let studentList = [
    {
        "id": 1,
        "name": "Nguyen Van A",
        "age": 18,
        "class": "A1"
    },
    {
        "id": 2,
        "name": "Tran Thi B",
        "age": 19,
        "class": "A2"
    },
    {
        "id": 3,
        "name": "Le Van C",
        "age": 20,
        "class": "A1"
    },
    {
        "id": 4,
        "name": "Pham Thi D",
        "age": 19,
        "class": "A3"
    },
    {
        "id": 5,
        "name": "Hoang Van E",
        "age": 18,
        "class": "A2"
    },
    {
        "id": 6,
        "name": "Nguyen Van F",
        "age": 20,
        "class": "A1"
    },
    {
        "id": 7,
        "name": "Tran Van G",
        "age": 19,
        "class": "A3"
    }
]

export default function StudentList() {
    return (
        <>
            <table className="table">
                <thead className="thead-dark">
                    <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Age</th>
                        <th scope="col">Class</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        studentList.map((student) => (
                            <tr>
                                <td>{student.name}</td>
                                <td>{student.age}</td>
                                <td>{student.class}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </>
    );
}