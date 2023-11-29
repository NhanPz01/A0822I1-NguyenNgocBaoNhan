import {ErrorMessage, Field, Form, Formik} from "formik";
import {Modal} from "react-bootstrap";
import * as Yup from "yup";
import data from "../../../data/db.json";
import * as bookService from "../../service/BookService"

export function CreateBookModal({showModal, setShowModal}) {
    const typeData = data["type"]
    const handleCreate = async (values) => {
        await bookService.add(values)
        console.log(values);
        // toast.success("Thêm mới thành công")
        setShowModal(false);
    }

    const bookSchema = Yup.object().shape({
        cId: Yup.string().required('Could not empty !').matches(/^BO-[0-9]{4}/, "Mã sách có dạng BO-XXXX (với X là các số từ 0 đến 9)"),
        getDate: Yup
            .date()
            // .transform((value, originalValue) => {
            //     const date = moment(originalValue, 'DD/MM/YYYY', true);
            //     return date.isValid() ? date.toDate() : new Date('');
            // })
            .max(new Date(), 'Could not in future !')
            .required('Could not empty !'),
        name: Yup.string().required('Could not empty !').max(100, "Tên không vượt quá 100 ký tự"),
        quantity: Yup.number().required('Could not empty !').min(0, "Không thể nhỏ hơn 0")
    })

    return (
        <>
            <Formik
                initialValues={{
                    cId: "",
                    name: "",
                    type: "",
                    getDate: "",
                    quantity: ""
                }}
                validationSchema={bookSchema}
                onSubmit={(values, {resetForm}) => {
                    handleCreate(values);
                    resetForm();
                }}
            >
                {({errors, touched}) => (
                    <Form id="create-book">
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
                                    <label className="form-label">Name</label>
                                    <Field type="text" className={`form-control ${
                                        errors.name && touched.name ? 'is-invalid' : ''
                                    }`} name="name"/>
                                    <ErrorMessage name="name" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Type</label>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <Field as="select" name="type" className="form-control">
                                        {
                                            typeData.map((type) => (
                                                <option value={type}>{type}</option>
                                            ))
                                        }
                                    </Field>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Get Date</label>
                                    <Field type="date" className={`form-control ${
                                        errors.getDate && touched.getDate ? 'is-invalid' : ''
                                    }`} name="getDate"/>
                                    <ErrorMessage name="getDate" component="div" className="invalid-feedback"/>
                                </div>
                                <div className="mb-3">
                                    <label className="form-label">Quantity</label>
                                    <Field type="number" className={`form-control ${
                                        errors.quantity && touched.quantity ? 'is-invalid' : ''
                                    }`} name="quantity"/>
                                    <ErrorMessage name="quantity" component="div" className="invalid-feedback"/>
                                </div>
                            </Modal.Body>
                            <Modal.Footer>
                                <button type="button" className="btn btn-secondary"
                                        onClick={() => setShowModal(false)}>Close
                                </button>
                                <button form="create-book" type="submit" className="btn btn-primary">Create</button>
                            </Modal.Footer>
                        </Modal>
                    </Form>
                )}
            </Formik>
        </>
    )
}