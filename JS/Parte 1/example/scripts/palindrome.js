//definiendo una funcion palindroe
function palindrome(cadena) {
    // Dividir la cadena en caracteres
    let caracteres = cadena.split('');
    
    // Invertir la lista de caracteres
    let caracteresInvertidos = caracteres.reverse();
    
    // Unir los caracteres invertidos en una cadena
    let cadenaInvertida = caracteresInvertidos.join('');
    
    // Comparar la cadena original con la cadena invertida
    return cadena === cadenaInvertida;
}

console.log(palindrome("hello"));
console.log(palindrome("hannah"));