import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import FacilityList from './components/facility/FacilityList';
import CustomerList from './components/customer/CustomerList';
import ContractList from './components/contract/ContractList';

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<FacilityList />} />
          <Route path='/customer' element={<CustomerList />} />
          <Route path='/contract' element={<ContractList />} />
        </Routes>

      </BrowserRouter>
    </>
  );
}

export default App;
