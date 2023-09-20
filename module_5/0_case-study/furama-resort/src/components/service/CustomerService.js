import axios from "axios";

export const getAll = async () => {
    try {
        const result = await axios.get(`http://localhost:8080/customer`);
        return result.data
    } catch (error) {
        console.log(error)
    }
}
export const add = async (value) => {
    try {
        const result = await axios.post(`http://localhost:8080/customer`, value);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}
export const edit = async (id, value) => {
    try {
        const result = await axios.patch(`http://localhost:8081/customer/${id}`, value);
        return result.data;
    } catch (e) {
        console.log(e);
    }
};
export const remove = async (id) => {
    try {
        const result = await axios.delete(`http://localhost:8080/customer/${id}`);
        return result.data;
    } catch (e) {
        console.log(e);
    }
}