import { ErrorMessage, Field, Form, Formik } from "formik"
import * as Yup from 'yup'

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
            yearOfBirth: '',
            country: '',
            company: '',
            department: '',
            insuranceCard: false,
            province: '',
            district: '',
            ward: ''
          }
        }

        validationSchema={Yup.object(
          {
            name: Yup.string()
              .required(' is required'),
            personalId: Yup.string()
              .required(' is required'),
            phone: Yup.string()
              .required(' is required'),
            email: Yup.string()
              .required(' is required')
              .email(' is an invalid email address'),
            address: Yup.string()
              .required(' is required'),
            yearOfBirth: Yup.number()
              .required(' is required')
              .min(1901, ' > 1900'),
            country: Yup.string()
              .required(' is required'),
            company: Yup.string()
              .required(' is required'),
            province: Yup.string()
              .required(' is required'),
            district: Yup.string()
              .required(' is required'),
            ward: Yup.string()
              .required(' is required'),
          }
        )}

        onSubmit={(values) => {
          alert(values)
        }}
      >
        <Form>
          <div className="form-group">
            <label htmlFor="name">Họ tên</label>
            <ErrorMessage component="span" name="name" className="error" />
            <Field type="text" name="name" className="form-control" id="name" />
          </div>
          <div className="form-group">
            <label htmlFor="personalId" >Số hộ chiếu /CMND</label>
            <ErrorMessage component="span" name="personalId" className="error" />
            <Field type="text" name="personalId" className="form-control" id="personalId" />
          </div>
          <div className="form-group">
            <label htmlFor="yearOfBirth" >Năm sinh</label>
            <ErrorMessage component="span" name="yearOfBirth" className="error" />
            <Field type="number" name="yearOfBirth" className="form-control" id="yearOfBirth" />
          </div>
          <div className="form-group">
            <label >Giới tính</label>
            <div role="group">
              <Field type="radio" name="gender" className="m-2" id="male-check" value="male" checked />
              <label htmlFor="male-check">Nam</label>
              <Field type="radio" name="gender" className="m-2" id="female-check" value="female" />
              <label htmlFor="female-check">Nữ</label>
            </div>
          </div>
          <div className="form-group">
            <label htmlFor="country" >Quốc tịch</label>
            <ErrorMessage component="span" name="country" className="error" />
            <Field type="text" name="country" className="form-control" id="country" />
          </div>
          <div className="form-group">
            <label htmlFor="company" >Công ty làm việc</label>
            <Field type="text" name="company" className="form-control" id="company" />
          </div>
          <div className="form-group">
            <label >Bộ phận làm việc</label>
            <Field type="text" name="department" className="form-control" />
          </div>
          <div className="form-group">
            <label htmlFor="insuranceCard" >Có thẻ bảo hiểm y tế</label>
            <Field type="checkbox" name="insuranceCard" className="m-2" id="insuranceCard" />
          </div>
          <h4 className="m-3">Địa chỉ liên lạc tại Việt Nam</h4>
          <div className="form-group">
            <label htmlFor="province" >Tỉnh thành</label>
            <ErrorMessage component="span" name="province" className="error" />
            <Field type="text" name="province" className="form-control" id="province" />
          </div>
          <div className="form-group">
            <label htmlFor="district" >Quận /huyện</label>
            <ErrorMessage component="span" name="district" className="error" />
            <Field type="text" name="district" className="form-control" id="district" />
          </div>
          <div className="form-group">
            <label htmlFor="ward" >Phường /xã</label>
            <ErrorMessage component="span" name="ward" className="error" />
            <Field type="text" name="ward" className="form-control" id="ward" />
          </div>
          <div className="form-group">
            <label htmlFor="address" >Số nhà, phố, tổ dân phố /thôn /đội</label>
            <ErrorMessage component="span" name="address" className="error" />
            <Field type="text" name="address" className="form-control" id="address" />
          </div>
          <div className="form-group">
            <label htmlFor="phone" >Điện thoại</label>
            <ErrorMessage component="span" name="phone" className="error" />
            <Field type="text" name="phone" className="form-control" id="phone" />
          </div>
          <div className="form-group">
            <label htmlFor="email" >Email</label>
            <ErrorMessage component="span" name="email" className="error" />
            <Field type="text" name="email" className="form-control" id="email" />
          </div>
          <button type="submit" className="btn btn-outline-secondary w-100 rounded-bottom-5">Gửi</button>
        </Form>
      </Formik>
    </>
  )
}

export default MedicalForm