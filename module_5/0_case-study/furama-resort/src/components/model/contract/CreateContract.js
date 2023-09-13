import {ErrorMessage, Field, Form, Formik} from "formik";
import {Modal} from "react-bootstrap";
import moment from "moment";
import * as Yup from "yup";

export function CreateContractModal({showModal, setShowModal}) {
    const currentDate = moment().toDate()
    const handleCreate = (values) => {
        console.log(values);
        setShowModal(false);
    }

    const contractSchema = Yup.object().shape({
        cId: Yup.string().required('Could not empty !'),
        dateOfBirth: Yup
            .date()
            .transform((value, originalValue) => {
                const date = moment(originalValue, 'DD/MM/YYYY', true);
                return date.isValid() ? date.toDate() : new Date('');
            })
            .max(new Date(), 'Could not in future !')
            .required('Could not empty !'),

        customer: Yup.string().required('Could not empty !'),
        service: Yup.string().required('Could not empty !'),
        beginDate: Yup
            .date()
            .transform((value, originalValue) => {
                const date = moment(originalValue, 'DD/MM/YYYY', true);
                return date.isValid() ? date.toDate() : new Date('');
            })
            .min(new Date(), 'Could not in past !')
            .required('Could not empty !'),
        endDate: Yup
            .date()
            .transform((value, originalValue) => {
                const date = moment(originalValue, 'DD/MM/YYYY', true);
                return date.isValid() ? date.toDate() : new Date('');
            })
            .min(new Date(), 'Could not in past !')
            .required('Could not empty !'),
        deposit: Yup.number().positive("This field must be a positive integer!"),
    })

    return (
        <>
            <Formik
                initialValues={{
                    cId: "",
                    customer: "",
                    service: "",
                    beginDate: "",
                    endDate: "",
                    deposit: 0,
                    totalMoney: 0
                }}
                validationSchema={contractSchema}
                onSubmit={(values, {resetForm}) => {
                    handleCreate(values);
                    resetForm();
                }}
            >
                {({errors, touched}) => (
                    <Form id="create-contract">
                        <Modal show={showModal} onHide={() => setShowModal(false)}>
                            <Modal.Header closeButton>
                                <Modal.Title>Create Contract</Modal.Title>
                            </Modal.Header>
                            <Modal.Body>
                                <div className="mb-3">
                                    <label className="form-label">ID</label>
                                    <Field type="text" className={`form-control ${
                                        errors.cId && touched.cId ? 'is-invalid' : ''
                                    }`} name="cId"/>
                                    <ErrorMessage name="cId" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Customer</label>
                                    <Field type="text" className={`form-control ${
                                        errors.customer && touched.customer ? 'is-invalid' : ''
                                    }`} name="customer"/>
                                    <ErrorMessage name="customer" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Service</label>
                                    <Field type="text" className={`form-control ${
                                        errors.service && touched.service ? 'is-invalid' : ''
                                    }`} name="service"/>
                                    <ErrorMessage name="service" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Begin Date</label>
                                    <Field type="date" className={`form-control ${
                                        errors.beginDate && touched.beginDate ? 'is-invalid' : ''
                                    }`} name="beginDate"/>
                                    <ErrorMessage name="beginDate" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">End Date</label>
                                    <Field type="date" className={`form-control ${
                                        errors.endDate && touched.endDate ? 'is-invalid' : ''
                                    }`} name="endDate"/>
                                    <ErrorMessage name="endDate" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Deposit</label>
                                    <Field type="number" className={`form-control ${
                                        errors.deposit && touched.deposit ? 'is-invalid' : ''
                                    }`} name="deposit"/>
                                    <ErrorMessage name="deposit" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Total Money</label>
                                    <Field type="number" className="form-control" name="totalMoney"/>
                                </div>
                            </Modal.Body>
                            <Modal.Footer>
                                <button type="button" className="btn btn-secondary"
                                        onClick={() => setShowModal(false)}>Close
                                </button>
                                <button form="create-contract" type="submit" className="btn btn-primary">Create</button>
                            </Modal.Footer>
                        </Modal>
                    </Form>
                )}
            </Formik>
        </>
    )
}