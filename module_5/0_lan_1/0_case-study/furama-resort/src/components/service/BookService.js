import axios from "axios";
import {swap} from "formik";

export const getAll = async () => {
    try {
        const list = await axios.get(`http://localhost:8080/book`);
        console.log(list.data.sort( (item) => {
            return item.quantity
        }))
        return list.data.sort( (item) => {
            return item.quantity
        })
    } catch (error) {
        console.log(error)
    }
}
export const getByType = async (value) => {
    try {
        let list = []
        list = await axios.get(`http://localhost:8080/book`)
        return list.filter( (item) => {
            item.type = value
        })
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
