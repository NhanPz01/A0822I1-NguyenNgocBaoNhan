import * as userServices from "../service/UserService"

export const GET_ALL_USER = "get_all";
export const REMOVE_USER = "remove";

export const getUser = () => async (dispatch) => {
    const response = await userServices.getAll();
    dispatch({
        type: GET_ALL_USER,
        payload: response
    })
};

export const removeUser = (id) => async (dispatch) => {
    const response = await userServices.remove(id);
    dispatch({
        type: REMOVE_USER,
        payload: response
    })
};