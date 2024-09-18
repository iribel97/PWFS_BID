/**
 * En esta actividad:
 * Mejorarás la función anterior para que devuelva la velocidad y así poder reutilizar este valor.
 */

// Definir la función calculateSpeed
function calculateSpeed(distance, time) {
    //definir variable para la velocidad
    let speed = distance / time;
    //retornar la velocidad
    return speed;
}

//Guardar los valores calculados en variables distintas
let speed1 = calculateSpeed(100, 2);
let speed2 = calculateSpeed(200, 4);
let speed3 = calculateSpeed(300, 6);

//imprimir los valores guardados
console.log(`La velocidad del automóvil #1 es de ${speed1} km/h`);
console.log(`La velocidad del automóvil #2 es de ${speed2} km/h`);
console.log(`La velocidad del automóvil #3 es de ${speed3} km/h`);
