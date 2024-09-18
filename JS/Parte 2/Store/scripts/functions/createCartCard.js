

function createCartCard(product) {
  const cartCardTemplate = `
    <article class="product-cart" id="product-cart-${product.id}">
      <img class="product-img" src="${product.image}" alt="${product.title}">
      <div class="product-details">
        <strong class="product-title">${product.title}</strong><span class="product-description">- ${product.color}</span>
        <p class="product-description">${product.description}</p>
        <input class="product-input" type="number" name="quantity" value="${product.quantity}" min="1" id="${product.id}">
      </div>
      <strong class="price">AR$ ${product.price}</strong>
    </article>
  `;

  return cartCardTemplate;
}

export { createCartCard};