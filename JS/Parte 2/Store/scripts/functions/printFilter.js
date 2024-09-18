import { printProductCards } from "./printProductCards.js";
import { getProducts } from "../products.js";

function printFilter(evento) {
  getProducts().then((productsArray) => {
    const text = evento.target.value;
    const found = productsArray.filter((each) => each.title.toLowerCase().includes(text.toLowerCase()));
    printProductCards(found, "products");
  }).catch((error) => {
    console.error('Hubo un problema al obtener los productos:', error);
  });

}

export { printFilter };
