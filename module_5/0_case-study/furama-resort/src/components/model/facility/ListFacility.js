import {useEffect, useState} from "react";
import {AlarmFill, AspectRatioFill, PencilSquare, PeopleFill, PlusCircleFill, TrashFill} from "react-bootstrap-icons";
import {UpdateServiceModal} from "./UpdateFacility";
import {CreateServiceModal} from "./CreateFacility";
import DeleteFacility from "./DeleteFacility";
import * as facilityService from "../../service/FacilityService";

export default function ListFacility() {
    const [facilities, setFacilities] = useState([]);
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
    useEffect(() => {
        getFacilities();
    }, []);
    const getFacilities = async () => {
        const list = await facilityService.getAll();
        setFacilities(list);
    };

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
                {facilities.map((facility, key) => (
                    <div className="col-md-4 mb-4" key={key}>
                        <div className="card" style={{width: 18 + 'rem'}}>
                            <img src={facility.imgURL} className="card-img-top" alt={facility.imgURL}
                                 style={{height: 10 + 'rem', objectFit: "cover"}}/>
                            <div className="card-body">
                                <h5 className="card-title">{facility.name}</h5>
                                <p className="card-text">
                                    <i>It's our honor to serve you</i>
                                </p>
                                <p className="card-text">
                                    <AspectRatioFill/> &nbsp;
                                    {facility.usageArea} &nbsp;&nbsp;&nbsp;&nbsp;
                                    <PeopleFill/> &nbsp;
                                    {facility.maxGuest} &nbsp;&nbsp;&nbsp;&nbsp;
                                    <AlarmFill/> &nbsp;
                                    {facility.rentalType}
                                </p>
                                <button className="btn btn-grad"
                                        onClick={() => {
                                            setShowUpdateModal(true)
                                            setActionService(facility)
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
                <DeleteFacility showModal={showDeleteModal} setShowModal={setShowDeleteModal}
                                removedId={actionService.id}/>
            </div>
        </>
    )
}