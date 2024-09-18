import { getProducts } from "../products.js";


function saveProd(id) {
  console.log("ID del producto:", id); // Verificar el ID recibido

  getProducts()
    .then((products) => {
      const found = products.find(product => product.id === id);

      if (!found) {
        throw new Error("Producto no encontrado");
      }

      const product = {
        id: id,
        title: found.title,
        price: found.price,
        description: found.description,
        image: found.images && found.images.length > 0 ? found.images[0] : "",
        color: document.querySelector("#color-" + id).value,
        quantity: Number(document.querySelector("#quantity-" + id).value) || 1,
      };

      const storage = localStorage.getItem("cart");
      let cart;
      if (storage) {
        cart = JSON.parse(storage);
      } else {
        cart = [];
      }

      if (cart.find((each) => each.id === id && each.color === product.color)) {
        Swal.fire({
          title: "Producto añadido",
          text: "El producto ha sido añadido al carrito",
          icon: "warning",
          confirmButtonText: "Aceptar"
        });
      } else {
        cart.push(product);
        localStorage.setItem("cart", JSON.stringify(cart));
        Swal.fire({
          title: "Producto añadido",
          text: "El producto ha sido añadido al carrito",
          icon: "success",
          confirmButtonText: "Aceptar"
        });
      }

     
    })
    .catch((error) => {
      console.error('Hubo un problema al obtener los productos:', error);
    });
}

export { saveProd };
