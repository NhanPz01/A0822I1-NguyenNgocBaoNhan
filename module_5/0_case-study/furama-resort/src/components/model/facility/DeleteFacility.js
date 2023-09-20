import {Modal} from "react-bootstrap";

export default function DeleteFacility({ showModal, setShowModal, removedId }) {
    const handle = () => {
        console.log(removedId)
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