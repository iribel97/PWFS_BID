//captureText para que imprima por consola “capturado”. 
const captureText = (event) => {
    //guardar en una variable el valor capturado por el evento
    let text = event.target.value;

    //filtre el array con todos los productos con los productos cuyo nombre incluya el texto capturado
    let filteredProducts = products.filter(product => product.title.toLowerCase().includes(text.toLowerCase()));

    //actualice la vista con una nueva impresión de las tarjetas
    printCards(filteredProducts, "products");
}

// definir una variable searchSelector
let searchSelector = document.querySelector("#search");
//Agregar evento
searchSelector.addEventListener("keyup", event=>captureText(event));