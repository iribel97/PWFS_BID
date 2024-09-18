//Definir funcion stringIncludes, donde reciba como parámetro dos cadenas de texto
function stringIncludes(cadena1, cadena2) {
    //Si la cadena de texto es nula o vacía, retornar "Invalid input"
    if (cadena1 == null || cadena1 === "") {
        return "Invalid input";
    }
    //Si la cadena buscada es nula o vacía, retornar "Invalid input"
    if (cadena2 == null || cadena2 === "") {
        return "Invalid input";
    }
    //Si la cadena de texto incluye la cadena buscada, retornar true
    //Si la cadena de texto no incluye la cadena buscada, retornar false
    return cadena2.includes(cadena1) ? true : false;  
}

console.log(stringIncludes("he","Hello"));
console.log(stringIncludes("he","hello world"));