import {Field, Form, Formik} from "formik";
import {Button, Modal} from "react-bootstrap";
import {useNavigate} from "react-router-dom";
import * as facilityService from "../../service/FacilityService"

export function CreateServiceModal({showModal, setShowModal}) {
    const navigate = useNavigate();
    const handle = async (values) => {
        await facilityService.add(values);
        setShowModal(false)
        console.log(values)
    }

    return (
        <Formik
            initialValues={{
                name: '',
                usageArea: 0,
                rentalCost: 0,
                maxGuest: 0,
                rentalType: '',
                otherConvenient: '',
                imgURL: ''
            }}
            onSubmit={(values, {resetForm}) => {
                handle(values);
                resetForm();
                navigate("/");
            }}
        >
            <Form id="create-service">
                <Modal show={showModal} onHide={() => setShowModal(false)}>
                    <Modal.Header closeButton>
                        <Modal.Title>Create Service</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>
                        <div className="mb-3">
                            <label className="form-label">Service Name</label>
                            <Field type="text" className="form-control" name="name"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Usage Area</label>
                            <Field type="number" className="form-control" name="usageArea"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Rental Cost</label>
                            <Field type="number" className="form-control" name="rentalCost"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Max Guest</label>
                            <Field type="number" className="form-control" name="maxGuest"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Rent Type</label>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <Field as="select" name="rentalType">
                                <option value="Hourly">Hourly</option>
                                <option value="Daily">Daily</option>
                                <option value="Monthly">Monthly</option>
                                <option value="Yearly">Yearly</option>
                            </Field>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Other Convenient</label>
                            <Field type="text" className="form-control" name="otherConvenient"/>
                        </div>
                        <div className="mb-3">
                            <label className="form-label">Image URL</label>
                            <Field type="text" className="form-control" name="imgURL"/>
                        </div>
                    </Modal.Body>
                    <Modal.Footer>
                        <Button type="button" className="btn btn-secondary"
                                onClick={() => setShowModal(false)}>Close</Button>
                        <Button form="create-service" type="submit" className="btn btn-primary">Create</Button>
                    </Modal.Footer>
                </Modal>
            </Form>
        </Formik>
    )
}