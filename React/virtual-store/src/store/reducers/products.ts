import { createReducer } from "@reduxjs/toolkit";
//Importar las acciones
import productsActions from "../actions/products";

const { capturarText } = productsActions;
const { calcularTotal } = productsActions;

//Se crea un objeto con el estado inicial.
const initialState = {
    text: "",
    total: 0,
};

//Se crea un reducer con el estado inicial y un objeto con las acciones.
const productsReducer = createReducer(
    initialState,
    (build) => build.addCase(capturarText, (state, action) => {
        const newState = {
            ...state,
            text: action.payload.text,
        };
        return newState;
    })
    .addCase(calcularTotal, (state, action) => {
        const productsCart = action.payload.products;
        const subTotal = productsCart.map((each) => each.price * each.quantity);
        const total = subTotal.reduce((acc: number, each: number) => acc + each, 0);
        const newState = {
            ...state,
            total,
        };
        return newState;
    })
);

export default productsReducer;