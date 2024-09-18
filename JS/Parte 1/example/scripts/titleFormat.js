function titleFormat(cadenaTexto){
    //Primera letra de la cadena de texto
    let primeraLetra = cadenaTexto.charAt(0).toUpperCase();
    //Resto de la cadena de texto
    let restoCadena = cadenaTexto.slice(1).toLowerCase();

    //Convertir la primera letra a mayúscula 
    //primeraLetra = primeraLetra.toUpperCase();

    //resto en minúsculas
    //restoCadena = restoCadena.toLowerCase();

    //Unir la primera letra con el resto de la cadena
    let resultado = primeraLetra + restoCadena;

    //mostrar por consola
    console.log(resultado);

    //retornar la longitud de la cadena
    return resultado.length;
}


console.log(titleFormat("hello world"));
console.log(titleFormat("HELLO world"));
console.log(titleFormat("HellO WOrLD"));