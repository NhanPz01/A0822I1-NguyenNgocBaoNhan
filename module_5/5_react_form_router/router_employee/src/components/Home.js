import { useNavigate } from "react-router-dom";
import EmployeeList from "./employee/EmployeeList";

const Home = ({ isLogin }) => {
  const navigate = useNavigate()

  if (!isLogin) {
    navigate('/')
  }

  return (
    <>
      <h1>Employee List</h1>
      <EmployeeList />
    </>
  )
}

export default Home;