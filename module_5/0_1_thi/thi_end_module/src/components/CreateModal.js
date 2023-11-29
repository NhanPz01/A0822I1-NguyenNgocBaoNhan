import { ErrorMessage, Field, Formik } from "formik";
import { Form, Modal } from "react-bootstrap";
import * as SongService from '../services/SongService'
import * as Yup from 'yup'

function CreateModal({ showModal, setShowModal }) {
  const songValidate = Yup.object().shape({
    name: Yup.string()
      .required('Bắt buộc nhập'),
    singer: Yup.string()
      .required('Bắt buộc nhập')
      .max(30, 'Tối đa 30 ký tự'),
    artist: Yup.string()
      .required('Bắt buộc nhập')
      .max(30, 'Tối đa 30 ký tự'),
    duration: Yup.string()
      .required('Bắt buộc nhập')
      .matches(/^[0-9]{2}:[0-9]{2}$/, 'Có dạng hh:mm')
  })

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
        validationSchema={songValidate}
        onSubmit={(values) => {
          console.log('Run')
          handleCreate(values);
          alert('Đăng ký thành công')
        }}
      >
        {({ errors, touched }) => (
          <Form id="song-create">
            <Modal show={showModal} onHide={() => setShowModal(false)}>
              <Modal.Header closeButton>
                <Modal.Title>Đăng ký bài hát</Modal.Title>
              </Modal.Header>
              <Modal.Body>
                <div className="mb-3">
                  <label className="form-label">Tên bài hát</label>
                  <Field type="text" className={`form-control ${errors.name && touched.name ? 'is-invalid' : ''
                    }`} name="name" />
                  <ErrorMessage name="name" component="div" className="invalid-feedback" />
                </div>
                <div className="mb-3">
                  <label className="form-label">Ca sĩ</label>
                  <Field type="text" className={`form-control ${errors.singer && touched.singer ? 'is-invalid' : ''
                    }`} name="singer" />
                  <ErrorMessage name="singer" component="div" className="invalid-feedback" />
                </div>
                <div className="mb-3">
                  <label className="form-label">Nhạc sĩ</label>
                  <Field type="text" className={`form-control ${errors.artist && touched.artist ? 'is-invalid' : ''
                    }`} name="artist" />
                  <ErrorMessage name="artist" component="div" className="invalid-feedback" />
                </div>
                <div className="mb-3">
                  <label className="form-label">Thời gian phát</label>
                  <Field type="text" className={`form-control ${errors.duration && touched.duration ? 'is-invalid' : ''
                    }`} name="duration" placeholder="hh:mm" />
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
        )}
      </Formik>
    </>
  )
}

export default CreateModal