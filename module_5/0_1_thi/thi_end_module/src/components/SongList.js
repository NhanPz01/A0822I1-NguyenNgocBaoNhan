import * as SongService from '../services/SongService'
import headerBanner from '../assets/images/header-banner.png'
import { useEffect, useState } from "react"
import SongDetail from "./SongDetail"
import CreateModal from './CreateModal'
import ChangeStatusModal from './ChangeStatusModal'

const SongList = () => {
  const [songs, setSongs] = useState([])
  const [selectedSong, setSelectedSong] = useState(null)
  const [changedSong, setChangedSong] = useState({})
  const [name, setName] = useState('')
  const [showCreate, setShowCreate] = useState(false)
  const [showPublic, setShowPublic] = useState(false)

  useEffect(() => {
    getAll()
  }, [songs, name])

  const getAll = async () => {
    const list = await SongService.getAll(name)
    setSongs(list)
  }

  const getSong = (song) => {
    setSelectedSong(song)
  }

  const handlePublic = (song) => {
    if (song.status === 'public') {
      alert('Bài hát này đã công khai !!!')
      return null
    }
    setChangedSong(song)
    setShowPublic(true)
  }

  const handleCreate = async () => {
    setShowCreate(true)
  }

  return (
    <>
      <div className="header">
        <div className="header_title">
          <img src={headerBanner} alt="header banner" />
          <h1>Kho nhạc</h1>
        </div>
      </div>
      {/* Create the navigation bar with some links */}
      <ul className="navigation">
        <li>
          <button onClick={handleCreate} className='btn btn-success rounded-0'>Đăng ký bài hát</button>
        </li>
        {/* <li><NavLink to="/">Trang chủ</NavLink></li> */}
        <li>
          <input type="text" onChange={(evt) => setName(evt.target.value)} placeholder="...Tìm kiếm" className="form-control rounded-end-0 m-2" />
        </li>
      </ul>
      {/* Create the body with some content */}
      <div className="main">
        {/* Get all data with card */}
        {/* <div className='d-flex align-content-start justify-content-center flex-wrap gap-4'>
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
        </div> */}
        <SongDetail song={selectedSong} />

        {/* Get all data with table */}
        <table className="table table-hover">
          <thead>
            <tr>
              <th scope="col">STT</th>
              <th scope="col">Tên bài hát</th>
              <th scope="col">Ca sĩ</th>
              <th scope="col">Thời gian phát</th>
              <th scope="col">Số lượt yêu thích</th>
              <th scope="col">Trạng thái</th>
              <th scope="col">Chức năng</th>
            </tr>
          </thead>
          <tbody>
            {
              songs.map((song, index) => {
                const status = song.status === 'private' ? 'Lưu trữ' : 'Công khai'
                return (
                  <>
                    <tr key={song.id} onClick={() => { getSong(song) }}>
                      <td>{index + 1}</td>
                      <td>{song.name}</td>
                      <td>{song.singer}</td>
                      <td>{song.duration}</td>
                      <td>{song.likes}</td>
                      <td>{status}</td>
                      <td>
                        <button onClick={() => { handlePublic(song) }} className="btn btn-success">Công khai</button>
                      </td>
                    </tr>
                  </>
                )
              })
            }
          </tbody>
        </table>

        {/* Create the footer with some text */}
      </div>
      <div className="footer">
        <p>© 2023 by NhanPz. All rights reserved.</p>
      </div>
      <CreateModal showModal={showCreate} setShowModal={setShowCreate} />
      <ChangeStatusModal showModal={showPublic} setShowModal={setShowPublic} songName={changedSong} index={changedSong.id} />
    </>
  )
}

export default SongList