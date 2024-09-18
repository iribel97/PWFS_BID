const numero1 = Number(prompt("Ingrese primer número"));
const numero2 = Number(prompt("Ingrese segundo número"));

/* suma */
const suma = numero1 + numero2;
/* calcular promedio de la suma */
const promedio = suma / 2;
/* operaciones adicionales */
const triple = promedio * 3;
const resultadoMenosDiez = triple - 10;


/* mensaje de la suma */
// const mensajeSuma = "El resultado de la suma es: " + suma;
// alert(mensajeSuma);

/* mensaje final */
const mensajeFinal = "El resultado de la suma es: " + suma + "\n" 
                   + "El promedio de la suma es: " + promedio + "\n" 
                   + "El triple del promedio es: " + triple + "\n" 
                   + "El triple del promedio menos 10 es: " + resultadoMenosDiez;
alert(mensajeFinal);