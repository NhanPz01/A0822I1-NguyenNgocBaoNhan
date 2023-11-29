import { Modal } from "react-bootstrap"
import * as Yup from 'yup'
import * as FacilityService from '../../services/FacilityService'
import { ErrorMessage, Field, Form, Formik } from "formik"
import data from '../../data/db.json'

const FacilityEditModal = ({ showModal, setShowModal, editFacility, onClose }) => {
  const areaData = data['area']
  const capacityData = data['maximum_capacity']
  const rentTypeData = data['rent_type']
  const standardData = data['standard']
  const poolAreaData = data['pool_area']
  const numberOfFloorsData = data['number_of_floors']
  const otherAmenityData = data['other_amenities_described']
  const facilityValidate = {

  }

  const handleVillaEdit = (values) => {
    console.log(FacilityService.update(values));
  }

  if (!editFacility) {
    return null
  }

  // For Villa
  if (editFacility.type.name === 'Villa') {
    return (
      <>
        <Formik
          initialValues={editFacility}
          validationSchema={Yup.object(facilityValidate)}
          onSubmit={(values) => {
            handleVillaEdit(values)
            onClose()
            alert('Updated !!!')
          }}
        >
          {({ errors, touched }) => (
            <Form id="edit-book">
              <Modal show={showModal} onHide={onClose} >
                <Modal.Header closeButton>
                  <Modal.Title>Edit Facility</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                  <div className="mb-3">
                    <label className="form-label">Name</label>
                    <Field type="text" className={`form-control ${errors.name && touched.name ? 'is-invalid' : ''
                      }`} name="name" />
                    <ErrorMessage name="name" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Area</label>
                    <Field as="select" name="area" className="form-control">
                      {
                        areaData.map((area) => (
                          <option value={area}>{area}</option>
                        ))
                      }
                    </Field>
                    <ErrorMessage name="area" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Rental Cost</label>
                    <Field type="text" className={`form-control ${errors.rental_cost && touched.rental_cost ? 'is-invalid' : ''
                      }`} name="rental_cost" />
                    <ErrorMessage name="rental_cost" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Maximum Capacity</label>
                    <Field as="select" name="maximum_capacity" className="form-control">
                      {
                        capacityData.map((number) => (
                          <option value={number}>{number}</option>
                        ))
                      }
                    </Field>
                    <ErrorMessage name="maximum_capacity" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Rent Type</label>
                    <Field as="select" name="rent_type" className="form-control">
                      {
                        rentTypeData.map((type) => (
                          <option value={type}>{type}</option>
                        ))
                      }
                    </Field>
                    <ErrorMessage name="rent_type" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Standard</label>
                    <Field as="select" name="standard" className="form-control">
                      {
                        standardData.map((type) => (
                          <option value={type}>{type}</option>
                        ))
                      }
                    </Field>
                    <ErrorMessage name="standard" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Other Amenities Described</label>
                    <Field as="select" name="standard" className="form-control">
                      {
                        otherAmenityData.map((value) => (
                          <option value={value}>{value}</option>
                        ))
                      }
                    </Field>
                    <ErrorMessage name="other_amenities_described" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Pool Area</label>
                    <Field as="select" name="pool_area" className="form-control">
                      {
                        poolAreaData.map((value) => (
                          <option value={value}>{value}</option>
                        ))
                      }
                    </Field>
                    <ErrorMessage name="pool_area" component="div" className="invalid-feedback" />
                  </div>
                  <div className="mb-3">
                    <label className="form-label">Number Of Floors</label>
                    <Field as="select" name="number_of_floors" className="form-control">
                      {
                        numberOfFloorsData.map((number) => (
                          <option value={number}>{number}</option>
                        ))
                      }
                    </Field>
                    <ErrorMessage name="number_of_floors" component="div" className="invalid-feedback" />
                  </div>

                </Modal.Body>
                <Modal.Footer>
                  <button type="button" className="btn btn-secondary"
                    onClick={() => setShowModal(false)}>Close
                  </button>
                  <button form="edit-book" type="submit" className="btn btn-primary">Save</button>
                </Modal.Footer>
              </Modal>
            </Form>
          )}
        </Formik>
      </>
    )
  }
}

export default FacilityEditModal