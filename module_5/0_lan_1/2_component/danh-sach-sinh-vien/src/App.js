import { students } from './index.js';
import './App.css';

function App() {
  return (
    <table className="table">
      <thead>
        <tr>
          <th scope="col">Id</th>
          <th scope="col">Name</th>
          <th scope="col">Age</th>
          <th scope="col">Address</th>
        </tr>
      </thead>
      <tbody>
        {students.map((student, index) => (
          <tr>
            <th scope="row">{student.id}</th>
            <td>{student.name}</td>
            <td>{student.age}</td>
            <td>{student.address}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default App;
