//Definiendo la funcion palindrome
function palindrome(x) {
    //Instanciar variables
    const num1 = 12, num2 = 21, num3 = -2, num4 = 1.25;

    //funcion Math.abs(x)
    let numAbs = Math.abs(x);
    console.log(`El valor absoluto de ${x} es ${numAbs}`);
    //funcion Math.floor(x)
    let numFloor = Math.floor(x);
    console.log(`El valor de ${x} redondeado hacia abajo es ${numFloor}`);
    //funcion Math.ceil(x)
    let numCeil = Math.ceil(x);
    console.log(`El valor de ${x} redondeado hacia arriba es ${numCeil}`);
    //funcion Math.round(x)
    let numRound = Math.round(num4);
    console.log(`El valor de ${num4} redondeado es ${numRound}`);
    //funcion Math.max(x1, x2, ..., xn)
    let numMax = Math.max(x, num1, num2, num3, num4);
    console.log(`El valor maximo de ${x}, ${num1}, ${num2}, ${num3} y ${num4} es ${numMax}`);
    //funcion Math.min(x1, x2, ..., xn)
    let numMin = Math.min(x, num1, num2, num3, num4);
    console.log(`El valor minimo de ${x}, ${num1}, ${num2}, ${num3} y ${num4} es ${numMin}`);
    //funcion Math.random()
    let numRandom = Math.random();
    console.log(`El valor aleatorio es ${numRandom}`);


}

//llamar a la funcion
palindrome(3);