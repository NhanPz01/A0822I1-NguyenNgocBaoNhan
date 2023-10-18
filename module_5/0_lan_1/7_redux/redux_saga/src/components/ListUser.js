import {useDispatch, useSelector} from "react-redux";
import {getUser, removeUser} from "../redux/Action";

export default function ListUser() {
    const users = useSelector((store) => store.user);
    const dispatch = useDispatch();
    const handleGetAllUser = () => {
        dispatch(getUser());
    };
    const handleRemove = (id) => {
        alert("Remove");
        dispatch(removeUser(id));
        handleGetAllUser();
    };
    console.log(users);
    return (
        <>
            <button className="btn btn-success"
                    onClick={handleGetAllUser}
            >Get users
            </button>
            <table className="table">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Website</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                {
                    users.map((user, index) => (
                        <tr>
                            <th scope="row">{index + 1}</th>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                            <td>
                                <a href={user.id}>Contact Link</a>
                            </td>
                            <td>
                                <button className="btn btn-danger" onClick={() => {
                                    handleRemove(user.id);
                                }}>Delete user
                                </button>
                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
    )
}