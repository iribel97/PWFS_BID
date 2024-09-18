import { printCartTotal } from "./printCartTotal.js";

function changeQuantityCart(event) {
  let cartproducts = JSON.parse(localStorage.getItem("cart"));
  let one = cartproducts.find((each) => each.id === event.target.id);
  one.quantity = event.target.value;
  printCartTotal(cartproducts, "total");
}

export { changeQuantityCart}
