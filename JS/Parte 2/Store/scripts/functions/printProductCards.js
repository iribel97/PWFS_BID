import { createProductCard } from "./createProductCard.js";
import { getProducts } from "../products.js";

function printProductCards(arrayProducts, idSelector) {
  let productsTemplate = "";
  let productsArrayPromise;

  if (arrayProducts && arrayProducts.length > 0) {
    productsArrayPromise = Promise.resolve(arrayProducts);
  } else {
    productsArrayPromise = getProducts();
  }

  productsArrayPromise
    .then((productsArray) => {
      const productsSelector = document.getElementById(idSelector);
      if (productsArray.length > 0) {
        for (const element of productsArray) {
          productsTemplate += createProductCard(element);
        }
        productsSelector.innerHTML = productsTemplate;
      } else {
        productsSelector.innerHTML = "<h3 style='width: 100%; text-align: center'>No hay coincidencias</h3>";
      }
    })
    .catch((error) => {
      console.error('Hubo un problema al obtener los productos:', error);
      const productsSelector = document.getElementById(idSelector);
      productsSelector.innerHTML = "<h3 style='width: 100%; text-align: center'>Error al cargar productos</h3>";
    });
}

export { printProductCards };
