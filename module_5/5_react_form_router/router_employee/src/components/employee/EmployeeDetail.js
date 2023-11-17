

const EmployeeDetail = ({ isDisplay, employee }) => {
  const gender = employee.gender === 'male' ? 'Nam' : 'Nữ';

  if (!isDisplay) {
    return null
  }

  return (
    <>
      <div className="card" style={{ width: '18rem' }}>
        <div className="card-body">
          <h5 className="card-title">{employee.name}</h5>
          <p className="card-text">{employee.age}</p>
          <p className="card-text">{gender}</p>
        </div>
      </div>

    </>
  )
}

export default EmployeeDetail