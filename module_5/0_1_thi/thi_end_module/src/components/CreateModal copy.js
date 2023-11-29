import { ErrorMessage, Field, Formik } from "formik";
import { Form, Modal } from "react-bootstrap";
import * as SongService from '../services/SongService'
import * as Yup from 'yup'

function CreateModal({ showModal, setShowModal }) {

  const handleCreate = async (values) => {
    await SongService.save(values)
    console.log(values)
    setShowModal(false)
  }

  return (
    <>
      <Formik
        initialValues={{
          name: '',
          singer: '',
          artist: '',
          duration: '',
          likes: 0,
          status: 'private'
        }}
        onSubmit={(values) => {
          console.log('Run')
          handleCreate(values);
          alert('Đăng ký thành công')
        }}
      >
        <Form id="song-create">
          <Modal show={showModal} onHide={() => setShowModal(false)}>
            <Modal.Header closeButton>
              <Modal.Title>Đăng ký bài hát</Modal.Title>
            </Modal.Header>
            <Modal.Body>
              <div className="mb-3">
                <label className="form-label">Tên bài hát</label>
                <Field type="text" className="form-control" name="name" />
                <ErrorMessage name="name" component="div" className="invalid-feedback" />
              </div>
              <div className="mb-3">
                <label className="form-label">Ca sĩ</label>
                <Field type="text" className="form-control" name="singer" />
                <ErrorMessage name="singer" component="div" className="invalid-feedback" />
              </div>
              <div className="mb-3">
                <label className="form-label">Nhạc sĩ</label>
                <Field type="text" className="form-control" name="artist" />
                <ErrorMessage name="artist" component="div" className="invalid-feedback" />
              </div>
              <div className="mb-3">
                <label className="form-label">Thời gian phát</label>
                <Field type="text" className="form-control" name="duration" placeholder="hh:mm" />
                <ErrorMessage name="duration" component="div" className="invalid-feedback" />
              </div>
            </Modal.Body>
            <Modal.Footer>
              <button type="button" className="btn btn-secondary"
                onClick={() => setShowModal(false)}>Close
              </button>
              <button form="song-create" type="submit" className="btn btn-primary">Đăng ký</button>
            </Modal.Footer>
          </Modal>
        </Form>
      </Formik>
    </>
  )
}

export default CreateModal