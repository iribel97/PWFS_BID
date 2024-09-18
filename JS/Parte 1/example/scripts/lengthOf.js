//definir una funcion lengthOf
function lengthOf(frase) {
    return (frase == null || frase === "") ? "Invalid input" : frase.length;
}

console.log(lengthOf("hello"));
console.log(lengthOf(""));