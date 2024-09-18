import { configureStore } from "@reduxjs/toolkit";
import productsReducer from "./reducers/products";

const store = configureStore(
    {
        reducer: {
            // Reducers
            products: productsReducer,
        }
    }
)

export default store;