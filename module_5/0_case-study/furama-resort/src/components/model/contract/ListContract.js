import React, {useState} from "react";
import {PlusCircleFill} from "react-bootstrap-icons";
import {CreateContractModal} from "./CreateContract";

const contractData = [
    {
        id: 1,
        cId: "CT-01",
        customer: "Nguyen Van A",
        service: "Villa Rose",
        beginDate: "2023-01-01",
        endDate: "2023-02-02",
        deposit: 300,
        totalMoney: 500
    },
    {
        id: 2,
        cId: "CT-02",
        customer: "Nguyen Van B",
        service: "Villa Violet",
        beginDate: "2023-01-01",
        endDate: "2023-02-02",
        deposit: 300,
        totalMoney: 500
    },
    {
        id: 3,
        cId: "CT-03",
        customer: "Nguyen Van C",
        service: "Villa Sunflower",
        beginDate: "2023-01-01",
        endDate: "2023-02-02",
        deposit: 300,
        totalMoney: 500
    },
    {
        id: 4,
        cId: "CT-04",
        customer: "Nguyen Van A",
        service: "House Rose",
        beginDate: "2023-01-01",
        endDate: "2023-02-02",
        deposit: 300,
        totalMoney: 500
    }
]

export function ListContract() {
    const [contracts, setContracts] = useState(contractData);
    const [showCreateModal, setShowCreateModal] = useState(false);

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
                <table className="table">
                    <thead>
                    <th scope="col">No</th>
                    <th scope="col">ID</th>
                    <th scope="col">Customer</th>
                    <th scope="col">Service</th>
                    <th scope="col">Begin Date</th>
                    <th scope="col">End Date</th>
                    <th scope="col">Deposit</th>
                    <th scope="col">Total Money</th>
                    </thead>
                    <tbody>
                    {contracts.map((contract, key) => (
                        <tr key={key}>
                            <td>{key}</td>
                            <td>{contract.cId}</td>
                            <td>{contract.customer}</td>
                            <td>{contract.service}</td>
                            <td>{contract.beginDate}</td>
                            <td>{contract.endDate}</td>
                            <td>{contract.deposit}</td>
                            <td>{contract.totalMoney}</td>
                        </tr>
                    ))}
                    </tbody>
                </table>
            </div>
            <CreateContractModal showModal={showCreateModal} setShowModal={setShowCreateModal}/>
        </>
    )
}