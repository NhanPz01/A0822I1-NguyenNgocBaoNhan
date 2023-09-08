import {useState} from "react";
import {AlarmFill, AspectRatioFill, PencilSquare, PeopleFill, PlusCircleFill, TrashFill} from "react-bootstrap-icons";
import {UpdateServiceModal} from "../service/UpdateService";

const customerData = [
    {
        id: 1,
        name: 'Nguyen Van A',
        dateOfBirth: '2023/07/24',
        gender: 'MALE',
        idCard: '10123456789',
        phoneNumber: '10935123456',
        email: 'abc1@gmail.com',
        address: '12 Le Duan'
    },
    {
        id: 2,
        name: 'Nguyen Van B',
        dateOfBirth: '2023/08/24',
        gender: 'FEMALE',
        idCard: '20123456789',
        phoneNumber: '20935123456',
        email: 'abc2@gmail.com',
        address: '14 Le Duan'
    },
    {
        id: 3,
        name: 'Nguyen Van C',
        dateOfBirth: '2023/09/24',
        gender: 'MALE',
        idCard: '30123456789',
        phoneNumber: '30935123456',
        email: 'abc3@gmail.com',
        address: '16 Le Duan'
    },
    {
        id: 4,
        name: 'Nguyen Van D',
        dateOfBirth: '2023/10/24',
        gender: 'FEMALE',
        idCard: '40123456789',
        phoneNumber: '40935123456',
        email: 'abc4@gmail.com',
        address: '20 Le Duan'
    },
    {
        id: 5,
        name: 'Nguyen Van E',
        dateOfBirth: '2023/11/24',
        gender: 'MALE',
        idCard: '50123456789',
        phoneNumber: '50935123456',
        email: 'abc5@gmail.com',
        address: '15 Le Duan'
    },
    {
        id: 6,
        name: 'Nguyen Van F',
        dateOfBirth: '2023/12/24',
        gender: 'MALE',
        idCard: '60123456789',
        phoneNumber: '60935123456',
        email: 'abc6@gmail.com',
        address: '4 Le Duan'
    }
]

export default function ListCustomer() {
    const [customerList, setCustomerList] = useState(customerData)
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
        <div className="row">
            {customerList.map((customer, key) => (
                <div className="col-md-4 mb-4" key={key}>
                    <div className="card" style={{width: 18 + 'rem'}}>
                        <img src={customer.imgURL} className="card-img-top" alt={customer.imgURL}
                             style={{height: 10 + 'rem', objectFit: "cover"}}/>
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
                            <button className="btn btn-grad">Edit</button>
                            <button className="btn btn-grad">Delete</button>
                        </div>
                    </div>
                </div>
            ))}
        </div>
    )
}