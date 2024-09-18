/**
 * En esta actividad: 
 * Mejorarás la función anterior para que reciba la distancia y el tiempo 
 * como parámetros, lo que la hará más reutilizable.
 */

// Definir la función calculateSpeed
function calculateSpeed(distance, time) {
    //definir variable para la velocidad
    let speed = distance / time;
    //imprimir la velocidad
    console.log(`La velocidad del automóvil es de ${speed} km/h`);
}

// Ejecutar la funcion 3 veces
calculateSpeed(100, 2);
calculateSpeed(200, 4);
calculateSpeed(300, 6);