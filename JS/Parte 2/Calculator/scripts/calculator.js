//solicitar numeros al usuario
function solicitarNumeros() {
    var num1 = prompt("Ingrese el primer número");
    var num2 = prompt("Ingrese el segundo número");

    dividir(num1, num2, mostrarError);
}

//funcion dividir
function dividir(num1, num2, callback) {
    //corroborar que los numeros sean validos
    if (isNaN(num1) || isNaN(num2)) {
        callback("Los valores ingresados no son números");
    }

    //corroborar que el divisor no sea 0
    if (num2 == 0) {
        callback("No se puede dividir por 0");
    }

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    //realizar la division
    var resultado = num1 / num2;

    document.querySelector("main").innerHTML = `
    <h1>Datos:</h1>
    <p>Dividendo: ${num1}</p>
    <p>Divisor: ${num2}</p>
    <h1>Resultado:</h1>
    <p>${resultado}</p>
    `;
}

function mostrarError(mensajeError) {
    alert(mensajeError);
}

solicitarNumeros();