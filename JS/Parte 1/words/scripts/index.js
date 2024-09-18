/* entrada de una palabra o frase */
const frase = prompt("Ingrese una palabra o frase");

/* Definir variable para guardar la cantidad de letras de la frase ingresada por el usuario */
const cantidadLetras = frase.length;

/* variable para un mensaje */
const mensajeCantidad = "La cantidad de letras de la frase ingresada es: " + cantidadLetras; 

/* Mostrar al usuario el mensaje */
alert(mensajeCantidad);