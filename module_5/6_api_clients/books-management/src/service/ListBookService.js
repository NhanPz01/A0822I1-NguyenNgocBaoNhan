import axios from "axios";

export const getAll = async () => {
    try {
        const result = await axios.get("http://localhost:8080/books");
        return result.data;
    } catch (e) {
        console.log(e);
    }
}

export const addNewBook = async (value) => {
    try {
        const result = await axios.post("http://localhost:8080/books", value);
        return result.data;
    } catch (e) {
        console.log(e)
    }
}

export const updateBook = async (index, value) => {
    try {
        const result = await axios.put("http://localhost:8080/books", value)
        return result.data
    } catch (e) {
        console.log(e)
    }
}