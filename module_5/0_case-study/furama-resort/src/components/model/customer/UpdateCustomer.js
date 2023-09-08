import {Field, Form, Formik} from "formik";
import {Button, Modal} from "react-bootstrap";

export function UpdateCustomerModal({showModal, setShowModal, editCustomer}) {
    const handle = (values) => {
        setShowModal(false);
        console.log(values);
    }

    return (
        <Formik
            enableReinitialize={true}
            initialValues={{
                id: editCustomer.id,
                name: editCustomer.name,
                customerType: editCustomer.customerType,
                dateOfBirth: editCustomer.dateOfBirth,
                gender: editCustomer.gender,
                idCard: editCustomer.idCard,
                phoneNumber: editCustomer.phoneNumber,
                email: editCustomer.email,
                address: editCustomer.address
            }}
            onSubmit={(values, {resetForm}) => {
                handle(values);
                resetForm();
            }}
        >
            <Form id="update-customer">
                <Modal show={showModal} onHide={() => setShowModal(false)}>
                    <Modal.Header closeButton>
                        <Modal.Title>Update Customer</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>
                        <div className="mb-3">
                            <label className="form-label">Name</label>
                            <Field type="text" className="form-control" name="name"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Customer Type</label>
                            <Field type="text" className="form-control" name="customerType"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Date of Birth</label>
                            <Field type="date" className="form-control" name="dateOfBirth"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Gender</label>
                            <div role="group" aria-labelledby="my-radio-group">
                                <label>
                                    <Field type="radio" name="gender" value="MALE"/>
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
                            <Field type="text" className="form-control" name="idCard"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Phone Number</label>
                            <Field type="text" className="form-control" name="phoneNumber"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Email</label>
                            <Field type="email" className="form-control" name="email"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Address</label>
                            <Field type="text" className="form-control" name="address"/>
                        </div>
                    </Modal.Body>
                    <Modal.Footer>
                        <button type="button" className="btn btn-secondary" onClick={() => setShowModal(false)}>Close
                        </button>
                        <button form="update-customer" type="submit" className="btn btn-primary">Update</button>
                    </Modal.Footer>
                </Modal>
            </Form>
        </Formik>
    )
}