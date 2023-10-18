
let studentList = [
    {
        "id": 1,
        "company": "Com A",
        "contact": "A",
        "country": "Da Nang"
    },
    {
        "id": 2,
        "company": "Com B",
        "contact": "B",
        "country": "Ha Noi"
    },
    {
        "id": 3,
        "company": "Com C",
        "contact": "C",
        "country": "Sai Gon"
    },
]

export default function StudentList() {
    return (
        <>
            <table className="table">
                <thead className="thead-dark">
                    <tr>
                        <th scope="col">Company</th>
                        <th scope="col">Contact</th>
                        <th scope="col">Country</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        studentList.map((student) => (
                            <tr>
                                <td>{student.company}</td>
                                <td>{student.contact}</td>
                                <td>{student.country}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </>
    );
}