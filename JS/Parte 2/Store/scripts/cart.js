import { printIcons, printNavBar, printFooter, hideSearch} from "./functions/printLayout.js";
import { printCartCards } from "./functions/printCartCards.js";
import { printCartTotal } from "./functions/printCartTotal.js";
import {changeIcons} from "./functions/enLinea.js";

hideSearch();
printIcons();
printNavBar( "navbar");
printFooter( "footer");

let cartproducts = JSON.parse(localStorage.getItem("cart"));
if (!cartproducts) {
  cartproducts = [];
}
printCartCards(cartproducts, "productscart");
printCartTotal(cartproducts, "total");

changeIcons();

document.getElementById("loginCheck").addEventListener("click", () => {
  localStorage.setItem("online", false);
  changeIcons();
  window.location.href = "index.html";
}); 