import logo from './logo.svg';
import { students } from './index.js';
import './App.css';

function App() {
  return (
    <table className="table">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Company</th>
          <th scope="col">Contact</th>
          <th scope="col">Country</th>
        </tr>
      </thead>
      <tbody>
        {students.map((student, index) => (
          <tr>
            <th scope="row">{index}</th>
            <td>{student.company}</td>
            <td>{student.contact}</td>
            <td>{student.country}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default App;