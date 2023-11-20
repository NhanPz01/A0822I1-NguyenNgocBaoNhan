import { useEffect, useState } from 'react'
import { NavLink } from 'react-router-dom'
import * as CustomerService from '../../services/CustomerService.js'

const CustomerList = () => {
  const [customers, setCustomers] = useState([])

  useEffect(() => {
    getAllCustomer()
  }, [customers])

  const getAllCustomer = async () => {
    const data = await CustomerService.getAll()
    setCustomers(data)
  }

  return (
    <>
      <div className="header">
        <h1>Customer</h1>
      </div>
      {/* Create the navigation bar with some links */}
      <ul className="navigation">
        <li><NavLink to="/">Home</NavLink></li>
        <li><NavLink to="/customer">Customer</NavLink></li>
        <li><NavLink to="/contract">Contract</NavLink></li>
      </ul>
      {/* Create the body with some content */}
      <div className="main">
        <div className='d-flex align-content-start justify-content-center flex-wrap gap-4'>
          {
            customers.map((customer) => {
              let gender = customer.gender === 'MALE' ? 'Nam' : 'Nữ'
              return (
                <>
                  <div className="card w-25" key={customer.id}>
                    <div className="card-body d-flex align-items-center flex-wrap">
                      <div className="card-content flex-fill">
                        <h5 className="card-text">{customer.name.toUpperCase()}</h5>
                        <p>Gender: {gender}</p>
                        <p>Type: {customer.customerType}</p>
                      </div>
                      <div className='card-button'>
                        <button className='btn btn-sm btn-outline-primary rounded-5 rounded-end-0'>Edit</button>
                        <button className='btn btn-sm btn-outline-danger rounded-5 rounded-start-0'>Remove</button>
                      </div>
                    </div>
                  </div>

                </>
              )
            })
          }


        </div>

        {/* Create the footer with some text */}
      </div>
      <div className="footer">
        <p>© 2023 by NhanPz. All rights reserved.</p>
      </div>
    </>

  )
}

export default CustomerList