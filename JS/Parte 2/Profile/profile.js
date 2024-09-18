"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
// Definición de variables con datos personales
var firstName = "Juan";
var lastName = "Pérez";
var age = 30;
var email = "juan.perez@example.com";
var isEmployed = true;
// Construcción del objeto data que contiene los datos personales
var data = {
    firstName: firstName,
    lastName: lastName,
    age: age,
    email: email,
    isEmployed: isEmployed
};
var family = [
    {
        firstName: "Ana",
        lastName: "Pérez",
        age: 25,
        email: "ana.perez@example.com",
        isEmployed: false
    },
    {
        firstName: "Carlos",
        lastName: "Pérez",
        age: 35,
        email: "carlos.perez@example.com",
        isEmployed: true
    }
];
console.log('Datos personales:', data);
console.log('Familiares:', family);
// muestra por consola los tipos de datos de algunos datos primitivos, de la interfaz, de los objetos y del array.
console.log('Tipo de dato de firstName:', typeof firstName);
console.log('Tipo de dato de age:', typeof age);
console.log('Tipo de dato de data:', typeof data);
console.log('Tipo de dato de family:', typeof family);
console.log('Tipo de dato de family[0]:', typeof family[0].isEmployed);
//verifica algunas propiedades existentes/inexistente de las instancias de las personas construidas. Muestra por consola los resultados.
console.log('Existe la propiedad firstName en data:', 'firstName' in data);
console.log('Existe la propiedad lastName en data:', 'lastName' in data);
console.log('Existe la propiedad firstName en family[0]:', 'firstName' in family[0]);
console.log('Existe la propiedad correo en family[0]:', 'correo' in family[0]);
//verifica si algunos datos son de determinado tipo. Muestra por consola los resultados.
function isString(value) {
    return typeof value === 'string';
}
console.log('¿firstName es de tipo string?', isString(firstName));
console.log('¿age es de tipo string?', isString(age));
console.log('¿data es de tipo string?', isString(data));
//función genérica que tome un array de personas o un array de nombres de personas y devuelva siempre el primer elemento de ese array.
function firstElement(array) {
    return array[0];
}
console.log('Primer elemento de data:', firstElement([data]));
console.log('Primer elemento de family:', firstElement(family));
//Implementa una clase genérica Portfolio
var Portfolio = /** @class */ (function () {
    function Portfolio() {
        this.elements = [];
    }
    Portfolio.prototype.add = function (element) {
        this.elements.push(element);
    };
    Portfolio.prototype.get = function () {
        return this.elements;
    };
    Portfolio.prototype.sum = function () {
        return this.elements.reduce(function (acc, element) { return acc + element; }, 0);
    };
    Portfolio.prototype.concat = function () {
        return this.elements.reduce(function (acc, element) { return acc + element; }, '');
    };
    return Portfolio;
}());
var portfolio = new Portfolio();
portfolio.add(1);
portfolio.add(2);
portfolio.add(3);
console.log('Elementos del portfolio:', portfolio.get());
console.log('Suma de los elementos del portfolio:', portfolio.sum());
var portfolio2 = new Portfolio();
portfolio2.add('Hola');
portfolio2.add(' ');
portfolio2.add('Mundo');
console.log('Elementos del portfolio:', portfolio2.get());
console.log('Concatenación de los elementos del portfolio:', portfolio2.concat());
