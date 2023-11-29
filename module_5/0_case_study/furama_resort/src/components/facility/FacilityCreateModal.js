import { ErrorMessage, Field, Formik } from 'formik'
import { Form, Modal } from 'react-bootstrap'
import * as FacilityService from '../../services/FacilityService'
import * as Yup from 'yup'
import data from '../../data/db.json'

const FacilityCreateModal = ({ showModal, setShowModal }) => {
  const areaData = data['area']
  const capacityData = data['maximum_capacity']
  const rentTypeData = data['rent_type']
  const standardData = data['standard']
  const poolAreaData = data['pool_area']
  const numberOfFloorsData = data['number_of_floors']
  const otherAmenityData = data['other_amenities_described']
  const initialValue = {
    name: "",
    area: 0,
    rental_cost: 0,
    maximum_capacity: 0,
    type: {
      name: "Villa",
      standard: null,
      other_amenities_described: [],
      pool_area: null,
      number_of_floors: null,
    }
  }

  const facilityValidate = {
    "name": Yup.string().required('Required'),
    "area": Yup.number().required('Required'),
    "rental_cost": Yup.number().required('Required'),
    "maximum_capacity": Yup.number().required('Required'),
    "type.name": Yup.string().required('Required'),
    "standard": Yup.string().required('Required'),
  }

  const handleCreate = async (values) => {
    await FacilityService.save(values)
  }

  const onClose = () => {
    setShowModal(false)
  }

  if (!showModal) {
    return null
  }

  return (
    <>
      <Formik
        initialValues={initialValue}
        validationSchema={Yup.object(facilityValidate)}
        onSubmit={(values) => {
          console.log(values)
          handleCreate(values)
        }}
      >
        {({ errors, touched }) => (
          <Form id="create-book">
            <Modal show={showModal} onHide={onClose} >
              <Modal.Header closeButton>
                <Modal.Title>Create Facility</Modal.Title>
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
                      areaData.map((area, index) => (
                        <option key={index} value={area}>{area}</option>
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
                <button form="create-book" type="submit" className="btn btn-primary">Submit</button>
              </Modal.Footer>
            </Modal>
          </Form>
        )}
      </Formik>
    </>
  )

}

export default FacilityCreateModal