import { clearCart } from "./buyProducts.js";

function printCartTotal(arrayOfProducts, id) {
  let total = 0;
  arrayOfProducts.forEach(
    (each) => (total = total + each.price * each.quantity)
  );
  const template = `
     <div class="cart-resume">
       <div class="cart-data">
         <h2 class="cart-title"><span>Resumen</span><span>del</span><span>pedido</span></h2>
         <div class="cart-total">
           <h3>Total</h3>
           <strong class="cart-price">${total}</strong>
         </div>
         <small class="cart-tax">Incluye impuesto PAIS y percepción AFIP.</small>
       </div>
       <button class="cart-btn" id="buy" type="button">COMPRAR</button>
   </div>`;
  const selector = document.getElementById(id);
  selector.innerHTML = template;
  const buySelector = document.getElementById("buy");
  buySelector.addEventListener("click", clearCart);
}

export { printCartTotal };
