import {Modal} from "react-bootstrap";
import * as customerService from "../../service/CustomerService"
import {useNavigate} from "react-router-dom";

export default function DeleteCustomer({showModal, setShowModal, removedId}) {
    const navigate = useNavigate();
    const handle = async () => {
        console.group("Removing...")
        console.log("removedId : " + removedId)
        console.log("...Done !")
        console.groupEnd()
        await customerService.remove(removedId)
        navigate("/customer")
        setShowModal(false)
    }

    return (
        <>
            <Modal show={showModal} onHide={() => setShowModal(false)}>
                <Modal.Header closeButton>
                    <Modal.Title>Remove Customer</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                    <p>Are you sure to delete this customer?</p>
                </Modal.Body>
                <Modal.Footer>
                    <button type="button" className="btn btn-secondary" onClick={() => setShowModal(false)}>Close
                    </button>
                    <button type="button" className="btn btn-primary" onClick={handle}>Remove</button>
                </Modal.Footer>
            </Modal>
        </>
    )
}