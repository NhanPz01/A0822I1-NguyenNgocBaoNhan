import { useEffect, useState } from 'react'
import { NavLink } from 'react-router-dom'
import * as ContractService from '../../services/ContractService.js'

const ContractList = () => {
  const [contracts, setContracts] = useState([])

  useEffect(() => {
    getAllContract()
  }, [contracts])

  const getAllContract = async () => {
    const data = await ContractService.getAll()
    setContracts(data)
  }

  return (
    <>
      <div className="header">
        <h1>Contract</h1>
      </div>
      {/* Create the navigation bar with some links */}
      <ul className="navigation">
        <li><NavLink to="/">Home</NavLink></li>
        <li><NavLink to="/contract">Customer</NavLink></li>
        <li><NavLink to="/contract">Contract</NavLink></li>
      </ul>
      {/* Create the body with some content */}
      <div className="main">
        <div className='d-flex align-content-start justify-content-center flex-wrap gap-4'>
          {
            contracts.map((contract) => {
              return (
                <>
                  <div className="card w-25" key={contract.id}>
                    <div className="card-body d-flex align-items-center flex-wrap">
                      <div className="card-content flex-fill">
                        <h5 className="card-text">{contract.id}</h5>
                        <p>Service: {contract.service}</p>
                        <p>Customer: {contract.customer}</p>
                        <p>End date: {contract.endDate}</p>
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

export default ContractList