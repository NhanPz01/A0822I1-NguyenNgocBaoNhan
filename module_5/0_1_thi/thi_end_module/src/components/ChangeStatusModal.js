import { Modal } from "react-bootstrap";
import * as SongService from '../services/SongService'


export default function ChangeStatusModal({ showModal, setShowModal, songName, index }) {

  const handleChange = async () => {
    await SongService.update(songName)
    setShowModal(false)
  }

  return (
    <>
      <Modal show={showModal} onHide={() => setShowModal(false)}>
        <Modal.Header closeButton>
          <Modal.Title>Xác nhận</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          {

            <div className="mb-3">
              <p>Bạn có muốn công khai bài hát "<span>{songName.name}</span>" hay không?</p>
            </div>
          }
        </Modal.Body>
        <Modal.Footer>
          <button onClick={() => setShowModal(false)} className="btn btn-primary w-25">Không</button>
          <button onClick={handleChange} className="btn btn-danger w-25">Có</button>
        </Modal.Footer>
      </Modal>
    </>
  )
}