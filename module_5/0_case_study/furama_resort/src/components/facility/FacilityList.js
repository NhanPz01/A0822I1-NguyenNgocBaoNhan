import { useEffect, useState } from 'react'
import { NavLink } from 'react-router-dom'
import * as FacilityService from '../../services/FacilityService.js'
import FacilityEditModal from './FacilityEditModal.js'
import FacilityCreateModal from './FacilityCreateModal.js'

const FacilityList = () => {
  const [facilities, setFacilities] = useState([])
  const [showEditModal, setShowEditModal] = useState(false)
  const [showCreateModal, setShowCreateModal] = useState(false)
  const [editFacility, setEditFacility] = useState(null)
  const IMG = [
    "https://plus.unsplash.com/premium_photo-1682285212027-6af0d0f70e07?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1887&q=80",
    "https://images.unsplash.com/photo-1566073771259-6a8506099945?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1770&q=80",
    "https://plus.unsplash.com/premium_photo-1682913629540-3857602b540c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1780&q=80",
    "https://images.unsplash.com/photo-1615880484746-a134be9a6ecf?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1974&q=80",
    "https://media.architecturaldigest.com/photos/628fb43b978896c06b13b204/16:9/w_2560%2Cc_limit/GettyImages-957245348.jpg",
    "http://www.sanroccovillas.com/photos/mikulina/1.jpg",
    "https://media.istockphoto.com/id/1347784849/photo/scenic-view-of-a-beautiful-landscape-garden-with-a-green-mowed-lawn.jpg?s=612x612&w=0&k=20&c=VU6cE_762lTNwqFeuc1A-JFksy6HcXM35Xq3ox3-Az0=",
    "https://img.freepik.com/free-photo/modern-residential-district-with-green-roof-balcony-generated-by-ai_188544-10276.jpg?size=626&ext=jpg&ga=GA1.1.1803636316.1700697600&semt=ais",
    "https://www.imgacademy.com/sites/default/files/park-villas.jpg",
    "https://static-images.vnncdn.net/files/publish/2022/10/17/img-6773-1089.jpg",
    "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiE4Ry7xxxcTW_LU0WznoV7u2X0QHNtpMWPNpd3ccRCT4CjKOcjbmccrUWMcofsacxTsuLQjlHfmXlnwKgFv1TgmY4t_88rlHCffSW6iHVtD3pMvh2WXBloIAZlUw8slpU171cHaKfPt3SEasKs3C1Kmhy1ZcJ3ATBSVGUPgmRRDIPy-C5vnnzljISSing/s768/Villa%201.jpg",
    "https://manchio.net/wp-content/uploads/2023/06/Thiet-ke-cai-tao-kien-truc-biet-thu-Xanh-Villa-1.jpg",
    "https://www.imgacademy.com/sites/default/files/tp-blodge3.jpg",
    "https://www.premium-villas-costa-blanca.com/imagenes/upload/premiumvillas/premium-villas-costa-blanca-propiedades_639a061fe02f4-681x532.jpg",
    "https://cdn1.img.sputniknews.vn/img/07e6/07/0d/16321714_268:0:1319:788_1920x0_80_0_0_f0d69bb156b91cc33cd2b229717a6d98.jpg",
    "https://www.premium-villas-costa-blanca.com/imagenes/upload/premiumvillas/premium-villas-costa-blanca-propiedades_6489c61f1ad39-681x532.jpg",
    "https://www.palmexotica.com/images/pages/temple-tree-villa/img-1.jpg"
  ]
  useEffect(() => {
    getAllFacilities()
  }, [facilities])

  const getAllFacilities = async () => {
    const data = await FacilityService.getAll()
    setFacilities(data)
  }

  const handleEdit = (facility) => {
    setEditFacility(facility)
    setShowEditModal(true)
  }

  const handleCloseEdit = () => {
    setEditFacility(null)
    setShowEditModal(false)
  }

  const handleCreate = () => {
    setShowCreateModal(true)
  }

  return (
    <>
      <div className="header">
        <div className="header_title">
          <h1>Facility</h1>
        </div>
      </div>
      {/* Create the navigation bar with some links */}
      <ul className="navigation">
        <li>
          <button onClick={handleCreate} className='btn btn-success rounded-0'>Create</button>
        </li>
        <li><NavLink to="/">Home</NavLink></li>
        <li><NavLink to="/customer">Customer</NavLink></li>
        <li><NavLink to="/contract">Contract</NavLink></li>
      </ul>
      {/* Create the body with some content */}
      <div className="main">
        <div className='d-flex align-content-start justify-content-center flex-wrap gap-4'>
          {
            facilities.map((facility, index) => {
              let imgURL = IMG[index]

              return (
                <>
                  <div className="card w-25" key={"f-" + facility.id}>
                    <img src={imgURL} className="card-img-top" alt="..." />
                    <h5 className="card-text m-3">{facility.name.toUpperCase()}</h5>
                    <div className="card-body d-flex align-items-center flex-wrap">
                      <div className="card-content flex-fill">
                        <p><span style={{ fontWeight: "625" }}>Room size</span> {facility.area}m2</p>
                        <p><span style={{ fontWeight: "625" }}>Maximum</span> {facility.maximum_capacity} people</p>
                        <p><span style={{ fontWeight: "625" }}>Rent type</span> {facility.rent_type}</p>
                      </div>
                      <div className='card-button'>
                        <button className='btn btn-sm btn-outline-secondary rounded-5 rounded-end-0'>Detail</button>
                        <button onClick={() => handleEdit(facility)} className='btn btn-sm btn-outline-primary rounded-0'>Edit</button>
                        <button className='btn btn-sm btn-outline-danger rounded-5 rounded-start-0'>X</button>
                      </div>
                    </div>
                  </div>

                </>
              )
            })
          }
          <FacilityEditModal showModal={showEditModal} setShowModal={setShowEditModal} editFacility={editFacility} onClose={handleCloseEdit} />
          <FacilityCreateModal showModal={showCreateModal} setShowModal={setShowCreateModal} />
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