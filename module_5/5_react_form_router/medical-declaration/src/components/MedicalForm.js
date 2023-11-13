import { Field, Form, Formik } from "formik"

const MedicalForm = () => {
  return (
    <>
      <h1>Tờ khai y tế</h1>
      <Formik
        initialValues={
          {
            name: '',
            personalId: '',
            phone: '',
            email: '',
            address: '',
            gender: '',
            dateOfBirth: '',
            country: '',
            
          }
        }
      >
        <Form>
          <div className="form-group">
            <label >Họ và tên</label>
            <Field type="text" name="name" className="form-control"/>
          </div>
        </Form>
      </Formik>
    </>
  )
}

export default MedicalForm