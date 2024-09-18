import { printCartCards } from "./printCartCards.js";
import { printCartTotal } from "./printCartTotal.js";

function clearCart() {
  Swal.fire({
    title: '¿Confirmar compra?',
    text: "¿Estás seguro de que deseas finalizar la compra?",
    icon: 'question',
    showCancelButton: true,
    confirmButtonColor: '#3085d6',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Sí, comprar',
    cancelButtonText: 'Cancelar'
  }).then((result) => {
    if (result.isConfirmed) {
      Swal.fire(
        'Compra finalizada',
        'Tu compra ha sido realizada con éxito',
        'success'
      );
      let cartproducts = [];
      localStorage.setItem("cart", JSON.stringify(cartproducts));
      printCartCards(cartproducts, "productscart");
      printCartTotal(cartproducts, "total");
    }
    
  });
}

export { clearCart };
