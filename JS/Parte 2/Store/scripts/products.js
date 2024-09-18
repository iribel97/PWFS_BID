function getProducts() {
  return fetch("./scripts/Json/products.json")
    .then((response) => {
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      return response.json();
    })
    .then((data) => {
      return data.products;
    })
    .catch((error) => {
      console.error('Hubo un problema con la operación fetch:', error);
      throw error;
    });
}

function products() {
  return getProducts();
}

export { getProducts };
