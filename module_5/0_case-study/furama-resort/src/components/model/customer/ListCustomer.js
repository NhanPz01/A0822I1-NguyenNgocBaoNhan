import {useState} from "react";
import {AlarmFill, AspectRatioFill, PencilSquare, PeopleFill, PlusCircleFill, TrashFill} from "react-bootstrap-icons";
import {UpdateCustomerModal} from "./UpdateCustomer";
import {CreateCustomerModal} from "./CreateCustomer";
import DeleteCustomer from "./DeleteCustomer";


const customerData = [
    {
        id: 1,
        name: 'Nguyen Van A',
        customerType: 'GOLD',
        dateOfBirth: '2023-07-24',
        gender: 'MALE',
        idCard: '10123456789',
        phoneNumber: '10935123456',
        email: 'abc1@gmail.com',
        address: '12 Le Duan'
    },
    {
        id: 2,
        name: 'Nguyen Van B',
        customerType: 'GOLD',
        dateOfBirth: '2023-08-24',
        gender: 'FEMALE',
        idCard: '20123456789',
        phoneNumber: '20935123456',
        email: 'abc2@gmail.com',
        address: '14 Le Duan'
    },
    {
        id: 3,
        name: 'Nguyen Van C',
        customerType: 'PLATINUM',
        dateOfBirth: '2023-09-24',
        gender: 'MALE',
        idCard: '30123456789',
        phoneNumber: '30935123456',
        email: 'abc3@gmail.com',
        address: '16 Le Duan'
    },
    {
        id: 4,
        name: 'Nguyen Van D',
        customerType: 'DIAMOND',
        dateOfBirth: '2023-10-24',
        gender: 'FEMALE',
        idCard: '40123456789',
        phoneNumber: '40935123456',
        email: 'abc4@gmail.com',
        address: '20 Le Duan'
    },
    {
        id: 5,
        name: 'Nguyen Van E',
        customerType: 'SILVER',
        dateOfBirth: '2023-11-24',
        gender: 'MALE',
        idCard: '50123456789',
        phoneNumber: '50935123456',
        email: 'abc5@gmail.com',
        address: '15 Le Duan'
    },
    {
        id: 6,
        name: 'Nguyen Van F',
        customerType: 'SILVER',
        dateOfBirth: '2023-12-24',
        gender: 'MALE',
        idCard: '60123456789',
        phoneNumber: '60935123456',
        email: 'abc6@gmail.com',
        address: '4 Le Duan'
    }
]

export default function ListCustomer() {
    const [customerList, setCustomerList] = useState(customerData)
    const [showCreateModal, setShowCreateModal] = useState(false)
    const [showUpdateModal, setShowUpdateModal] = useState(false)
    const [showDeleteModal, setShowDeleteModal] = useState(false)
    const [actionCustomer, setActionCustomer] = useState({
        name: '',
        dateOfBirth: '',
        gender: '',
        idCard: '',
        phoneNumber: '',
        email: '',
        address: ''
    })
    return (
        <>
            <div className="btn-create mb-3 mt-3 -align-left" style={{}}>
                <button
                    type="button"
                    className="btn btn-success"
                    onClick={() => setShowCreateModal(true)}
                >
                    Add new &nbsp;<PlusCircleFill/>
                </button>
            </div>
            &nbsp;
            <div className="row">
                {customerList.map((customer, key) => (
                    <div className="col-md-4 mb-4" key={key}>
                        <div className="card" style={{width: 18 + 'rem'}}>
                            <img
                                src={"data:image/jpeg;base64,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"}
                                className="card-img-top" alt={customer.imgURL}
                                style={{height: 10 + 'rem', objectFit: "contain"}}/>
                            <div className="card-body">
                                <h5 className="card-title">{customer.name}</h5>
                                <p className="card-text">
                                    <i>It's our honor to serve you</i>
                                </p>
                                <p className="card-text">
                                    <AspectRatioFill/> &nbsp;
                                    {customer.usageArea} &nbsp;&nbsp;&nbsp;&nbsp;
                                    <PeopleFill/> &nbsp;
                                    {customer.maxGuest} &nbsp;&nbsp;&nbsp;&nbsp;
                                    <AlarmFill/> &nbsp;
                                    {customer.rentalType}
                                </p>
                                <button className="btn btn-grad"
                                        onClick={() => {
                                            setShowUpdateModal(true)
                                            setActionCustomer(customer)
                                        }}
                                >Edit
                                </button>
                                <button className="btn btn-grad"
                                        onClick={() => {
                                            setShowDeleteModal(true)
                                            setActionCustomer(customer)
                                        }}
                                >Delete</button>
                            </div>
                        </div>
                    </div>
                ))}
                <UpdateCustomerModal showModal={showUpdateModal} setShowModal={setShowUpdateModal}
                                     editCustomer={actionCustomer}/>
                <CreateCustomerModal showModal={showCreateModal} setShowModal={setShowCreateModal}/>
                <DeleteCustomer showModal={showDeleteModal} setShowModal={setShowDeleteModal} removedId={actionCustomer.id}/>
            </div>
        </>
    )
}