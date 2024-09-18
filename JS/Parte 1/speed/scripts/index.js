/**
 * En esta actividad:
 * Definirás una función que calcule la velocidad de un automóvil 
 * teniendo en cuenta la distancia recorrida y el tiempo 
 * que tarda en recorrerla. 
 */

// Definir la función calculateSpeed
function calculateSpeed() {
    //definir constante para la distancia
    const distance = 100;
    //definir constante para el tiempo
    const time = 2;
    //definir variable para la velocidad
    let speed = distance / time;
    //imprimir la velocidad
    console.log(`La velocidad del automóvil es de ${speed} km/h`);
}

// Ejecutar la funcion 3 veces
calculateSpeed();
calculateSpeed();
calculateSpeed();