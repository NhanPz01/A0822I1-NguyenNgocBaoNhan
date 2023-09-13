import {Formik, Form, Field, ErrorMessage} from "formik";
import {Modal} from "react-bootstrap";
import moment from "moment";
import * as Yup from "yup";

export function CreateCustomerModal({showModal, setShowModal}) {
    const currentDate = moment().toDate()
    const handle = (values) => {
        console.log(values);
        setShowModal(false);
    }

    const customerSchema = Yup.object().shape({
        name: Yup.string().required('Could not empty !').matches(/^([A-Z][a-z]*(\s|$))+$/, "Name could not contain number !"),
        dateOfBirth: Yup
            .date()
            .transform((value, originalValue) => {
                const date = moment(originalValue, 'DD/MM/YYYY', true);
                return date.isValid() ? date.toDate() : new Date('');
            })
            .max(new Date(), 'Could not in future !')
            .required('Could not empty !'),

        idCard: Yup.string().required('Could not empty !').matches(/^\d{9}$|^\d{12}$/, "CMND could have the type: XXXXXXXXX or XXXXXXXXXXXX (X between 0 and 9)"),
        phoneNumber: Yup.string().required('Could not empty !').matches(/^(090\d{7}|091\d{7}|\(84\)\+90\d{7}|\(84\)\+91\d{7})$/, "Phone number could have the type: 090xxxxxxx or 091xxxxxxx (X between 0 and 9)"),
        email: Yup.string().required('Could not empty !').matches(/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/, "Invalid email address !"),
        address: Yup.string().required('Could not empty !')
    })

    return (
        <>
            <Formik
                initialValues={{
                    name: "",
                    customerType: "",
                    dateOfBirth: "",
                    gender: "",
                    idCard: "",
                    phoneNumber: "",
                    email: ""
                }}
                validationSchema={customerSchema}
                onSubmit={(values, {resetForm}) => {
                    handle(values);
                    resetForm();
                }}
            >
                {({errors, touched}) => (
                    <Form id="create-customer">
                        <Modal show={showModal} onHide={() => setShowModal(false)}>
                            <Modal.Header closeButton>
                                <Modal.Title>Create Customer</Modal.Title>
                            </Modal.Header>
                            <Modal.Body>
                                <div className="mb-3">
                                    <label className="form-label">Name</label>
                                    <Field type="text" className={`form-control ${
                                        errors.name && touched.name ? 'is-invalid' : ''
                                    }`} name="name"/>
                                    <ErrorMessage name="name" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Customer Type</label>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <Field as="select" name="customerType">
                                        <option value="MEMBER">Member</option>
                                        <option value="SILVER">Silver</option>
                                        <option value="GOLD">Gold</option>
                                        <option value="PLATINUM">Platinum</option>
                                        <option value="DIAMOND">Diamond</option>
                                    </Field>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Date of Birth</label>
                                    <Field type="date" className={`form-control ${
                                        errors.dateOfBirth && touched.dateOfBirth ? 'is-invalid' : ''
                                    }`} name="dateOfBirth"/>
                                    <ErrorMessage name="dateOfBirth" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Gender</label>
                                    <div role="group" aria-labelledby="my-radio-group">
                                        <label>
                                            <Field type="radio" name="gender" value="MALE" check/>
                                            &nbsp;Male
                                        </label>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <label>
                                            <Field type="radio" name="gender" value="FEMALE"/>
                                            &nbsp;Female
                                        </label>
                                    </div>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">ID card</label>
                                    <Field type="text" className={`form-control ${
                                        errors.idCard && touched.idCard ? 'is-invalid' : ''
                                    }`} name="idCard"/>
                                    <ErrorMessage name="idCard" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Phone Number</label>
                                    <Field type="text" className={`form-control ${
                                        errors.phoneNumber && touched.phoneNumber ? 'is-invalid' : ''
                                    }`} name="phoneNumber"/>
                                    <ErrorMessage name="phoneNumber" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Email</label>
                                    <Field type="email" className={`form-control ${
                                        errors.email && touched.email ? 'is-invalid' : ''
                                    }`} name="email"/>
                                    <ErrorMessage name="email" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Address</label>
                                    <Field type="text" className={`form-control ${
                                        errors.address && touched.address ? 'is-invalid' : ''
                                    }`} name="address"/>
                                    <ErrorMessage name="address" component="div" className="invalid-feedback"/>
                                </div>
                            </Modal.Body>
                            <Modal.Footer>
                                <button type="button" className="btn btn-secondary"
                                        onClick={() => setShowModal(false)}>Close
                                </button>
                                <button form="create-customer" type="submit" className="btn btn-primary">Create</button>
                            </Modal.Footer>
                        </Modal>
                    </Form>
                )}
            </Formik>
        </>
    )
}