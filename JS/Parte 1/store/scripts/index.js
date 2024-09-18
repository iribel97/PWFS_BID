/*
//declarar variable totalApagar
let totalApagar = 0;

//preguntar cuantos productos va a comprar
let cantidadProductos = Number(prompt("¿Cuantos productos va a comprar?"));

////iteracion con for
for (let i = 0; i < cantidadProductos; i++) {
    //preguntar el nombre
    const nombreProducto = prompt("¿Cual es el nombre del producto?");
    //preguntar cuantos va a comprar
    const cantidad = Number(prompt("¿Cuantos va a comprar?"));
    //preguntar el precio de cada producto
    const precio = Number(prompt("¿Cuanto cuesta el producto?"));
    //Calcular el subtotal
    const subtotal = cantidad * precio;

     totalApagar += subtotal;
}

//Mostrar al usuario el total a pagar
alert(`El total a pagar por la compra es: $${totalApagar}`);
*/

//------------------------------------------------------------------------------------------------
//IMPLEMENTANDO FUNCIONES
/**
 * En esta actividad: 
 * Mejorarás el programa store de la sección 2 para simular 
 * una caja registradora y registrar la compra de tres clientes 
 * que adquieren tres productos cada uno en un día. 
 * Al final del día, la caja registradora debe mostrar 
 * el monto total facturado.
 */

// Definir la función comprar
function comprar () {
    // Definir variables
    const totalProducts = Number(prompt('¿Cuántos productos esta comprando?'));
    let total = 0;

    // Iterar para obtener el total de la compra
    for (let i = 0; i < totalProducts; i++) {
        const productPrice = Number(prompt(`¿Cuál es el precio del producto #${i+1}?`));

        //pedir la cantidad de productos
        const cant = Number(prompt(`Cuantos esta llevando del producto #${i+1}?`));

        let subtotal = cant * productPrice;
        
        total += subtotal;
    }

    //Mensaje por consola
    console.log(`El total de su compra es de $${total}`);

    // Retornar el total
    return total;
}

// Pedir a 3 clientes
const total1 = comprar();
const total2 = comprar();
const total3 = comprar();

//sumar los tres totales
const totalDay = total1 + total2 + total3;

//decir mediante una alerta cuanto se hizo en total
alert(`El total del día es de $${totalDay}`);