/* seleccionar una etiqueta del HTML */
const selector = document.getElementById("mensaje");
/* escribir dentro de esa etiqueta con JS */
// selector.innerHTML = "CONEXIÓN EXITOSA ENTRE HTML Y JS";


/* pedir datos al suario */
// prompt("Preguntar algo");

/* salida por consola */
// console.log("Imprimir algo");

/* pedir al usuario */
//const entrada = prompt("¿Qué producto desea comprar?");
//console.log(entrada);
//alert("Usted desea comprar: " + entrada);

/* ACTIVIDAD: Dando la bienvenida */
const nombre = prompt("¿Cuál es tu nombre?");

selector.innerHTML = "Bienvenido/a " + nombre + " a nuestra página web";

console.log(nombre);
