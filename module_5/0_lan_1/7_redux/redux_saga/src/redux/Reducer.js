import {GET_ALL_USER, REMOVE_USER} from "./Action";
import {combineReducers} from "redux";

const initialState = {
    users: []
};
export const userReducer = (users = [], action) => {
    const {type, payload} = action;

    switch (type) {
        case GET_ALL_USER:
            return payload;
        case REMOVE_USER:
            return users.filter((value) => value.id !== payload);
        default:
            return users;
    }
};

export const rootReducer = combineReducers({
    user: userReducer,
});