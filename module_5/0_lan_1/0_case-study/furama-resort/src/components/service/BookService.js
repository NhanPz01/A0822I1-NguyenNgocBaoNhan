import axios from "axios";

export const getAll = async (name) => {
    try {
        const list = await axios.get('http://localhost:8080/book?_sort=quantity&_order=desc&name_like=' + name);
        return list.data
    } catch (error) {
        console.log(error)
    }
}
export const getByType = async (value) => {
    try {
        const list = await axios.get(`http://localhost:8080/book`)
        return list.data
    } catch (error) {
        console.log(error)
    }
}
export const add = async (value) => {
    try {
        const result = await axios.post(`http://localhost:8080/book`, value);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}
