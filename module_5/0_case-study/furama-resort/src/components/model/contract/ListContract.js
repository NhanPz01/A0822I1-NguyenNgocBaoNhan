import React, {useEffect, useState} from "react";
import {PlusCircleFill} from "react-bootstrap-icons";
import {CreateContractModal} from "./CreateContract";
import * as contractService from "../../service/ContractService";

export function ListContract() {
    const [contracts, setContracts] = useState([]);
    const [showCreateModal, setShowCreateModal] = useState(false);

    useEffect(() => {
        getContracts();
    }, []);

    const getContracts = async () => {
        const list = await contractService.getAll();
        setContracts(list);
    }

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