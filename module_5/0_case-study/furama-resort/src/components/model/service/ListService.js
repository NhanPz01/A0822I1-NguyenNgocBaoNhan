import {useState} from "react";
import {AlarmFill, AspectRatioFill, PencilSquare, PeopleFill, PlusCircleFill, TrashFill} from "react-bootstrap-icons";
import {UpdateServiceModal} from "./UpdateService";
import {CreateServiceModal} from "./CreateService";

const serviceData = [
    {
        id: 1,
        name: "Villa A",
        usageArea: 100,
        rentalCost: 200,
        maxGuest: 15,
        rentalType: "Daily",
        otherConvenient: "TV, Wifi, AC, Breakfast",
        imgURL: "https://plus.unsplash.com/premium_photo-1682285212027-6af0d0f70e07?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1887&q=80"
    },
    {
        id: 2,
        name: "Villa B",
        usageArea: 150,
        rentalCost: 100,
        maxGuest: 10,
        rentalType: "Hourly",
        otherConvenient: "TV, Wifi, AC",
        imgURL: "https://images.unsplash.com/photo-1566073771259-6a8506099945?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1770&q=80"
    },
    {
        id: 3,
        name: "Villa C",
        usageArea: 150,
        rentalCost: 100,
        maxGuest: 5,
        rentalType: "Monthly",
        otherConvenient: "TV, Wifi, AC",
        imgURL: "https://plus.unsplash.com/premium_photo-1682913629540-3857602b540c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1780&q=80"
    },
    {
        id: 4,
        name: "House A",
        usageArea: 150,
        rentalCost: 100,
        maxGuest: 5,
        rentalType: "Monthly",
        otherConvenient: "TV, Wifi, AC",
        imgURL: "https://images.unsplash.com/photo-1615880484746-a134be9a6ecf?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1974&q=80"
    },
    {
        id: 5,
        name: "House B",
        usageArea: 150,
        rentalCost: 100,
        maxGuest: 5,
        rentalType: "Hourly",
        otherConvenient: "TV, Wifi, AC",
        imgURL: "https://media.architecturaldigest.com/photos/628fb43b978896c06b13b204/16:9/w_2560%2Cc_limit/GettyImages-957245348.jpg"
    }
]

export default function ListService() {
    const [serviceList, setServiceList] = useState(serviceData)
    const [showCreateModal, setShowCreateModal] = useState(false)
    const [showUpdateModal, setShowUpdateModal] = useState(false)
    const [showDeleteModal, setShowDeleteModal] = useState(false)
    const [actionService, setActionService] = useState({
        name: "",
        usageArea: 0,
        rentalCost: 0,
        maxGuest: 0,
        rentalType: "",
        otherConvenient: "",
        imgURL: ""
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
                {serviceList.map((service, key) => (
                    <div className="col-md-4 mb-4" key={key}>
                        <div className="card" style={{width: 18 + 'rem'}}>
                            <img src={service.imgURL} className="card-img-top" alt={service.imgURL}
                                 style={{height: 10 + 'rem', objectFit: "cover"}}/>
                            <div className="card-body">
                                <h5 className="card-title">{service.name}</h5>
                                <p className="card-text">
                                    <i>It's our honor to serve you</i>
                                </p>
                                <p className="card-text">
                                    <AspectRatioFill/> &nbsp;
                                    {service.usageArea} &nbsp;&nbsp;&nbsp;&nbsp;
                                    <PeopleFill/> &nbsp;
                                    {service.maxGuest} &nbsp;&nbsp;&nbsp;&nbsp;
                                    <AlarmFill/> &nbsp;
                                    {service.rentalType}
                                </p>
                                <button className="btn btn-grad"
                                        onClick={() => {
                                            setShowUpdateModal(true)
                                            setActionService(service)
                                        }}>Edit
                                </button>
                                <button className="btn btn-grad">Delete</button>
                            </div>
                        </div>
                    </div>
                ))}
                <UpdateServiceModal showModal={showUpdateModal} setShowModal={setShowUpdateModal}
                                    editService={actionService}/>
                <CreateServiceModal showModal={showCreateModal} setShowModal={setShowCreateModal}/>
            </div>
        </>
    )
}