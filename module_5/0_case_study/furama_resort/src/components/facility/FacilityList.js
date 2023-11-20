import { useEffect, useState } from 'react'
import { NavLink } from 'react-router-dom'
import * as FacilityService from '../../services/FacilityService.js'

const FacilityList = () => {
  const [facilities, setFacilities] = useState([])

  useEffect(() => {
    getAllFacilities()
  }, [facilities])

  const getAllFacilities = async () => {
    const data = await FacilityService.getAll()
    setFacilities(data)
  }

  return (
    <>
      <div className="header">
        <h1>Facility</h1>
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
            facilities.map((facility) => {
              return (
                <>
                  <div className="card w-25" key={facility.id}>
                    <img src={facility.imgURL} className="card-img-top" alt="..." />
                    <div className="card-body d-flex align-items-center flex-wrap">
                      <div className="card-content flex-fill">
                        <h5 className="card-text">{facility.name.toUpperCase()}</h5>
                        <p>Room size {facility.usageArea}m2</p>
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

export default FacilityList