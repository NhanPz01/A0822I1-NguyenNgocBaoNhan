import { useEffect, useState } from "react";
import * as EmployeeService from '../../services/EmployeeService';
import EmployeeDetail from "./EmployeeDetail";


const EmployeeList = () => {
  const [employeeList, setEmployeeList] = useState([])
  const [isDetail, setIsDetail] = useState(false)
  const [employeeDetail, setEmployeeDetail] = useState({})

  useEffect(() => {
    getAll()
  }, [employeeList])

  const getAll = async () => {
    const data = await EmployeeService.getAll()
    setEmployeeList(data)
  }

  const handleDetail = (employee) => {
    setIsDetail(true)
    setEmployeeDetail(employee)
  }

  if (!employeeList) {
    return null
  }

  return (
    <>
      <table className="table table-hover text-center">
        <thead className="thead-dark">
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Age</th>
            <th scope="col">Gender</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
          {
            employeeList.map((employee, index) => {
              const gender = employee.gender === 'male' ? 'Nam' : 'Nữ'

              return (
                <tr key={employee.id}>
                  <th scope="row">{index + 1}</th>
                  <td>{employee.name}</td>
                  <td>{employee.age}</td>
                  <td>{gender}</td>
                  <td>
                    <button onClick={() => handleDetail(employee)} className="btn btn-outline-secondary">Detail</button>
                  </td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      <EmployeeDetail isDisplay={isDetail} employee={employeeDetail} />
    </>
  )
}

export default EmployeeList;