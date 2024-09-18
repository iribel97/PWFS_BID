import { Data } from './data';

// Definición de variables con datos personales
const firstName: string = "Juan";
const lastName: string = "Pérez";
const age: number = 30;
const email: string = "juan.perez@example.com";
const isEmployed: boolean = true;

// Construcción del objeto data que contiene los datos personales
const data: Data = {
    firstName,
    lastName,
    age,
    email,
    isEmployed
};

const family: Data[] = [
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
function isString(value: any): value is string {
    return typeof value === 'string';
}

console.log('¿firstName es de tipo string?', isString(firstName));
console.log('¿age es de tipo string?', isString(age));
console.log('¿data es de tipo string?', isString(data));

//función genérica que tome un array de personas o un array de nombres de personas y devuelva siempre el primer elemento de ese array.
function firstElement<T>(array: T[]): T {
    return array[0];
}

console.log('Primer elemento de data:', firstElement([data]));
console.log('Primer elemento de family:', firstElement(family));

//Implementa una clase genérica Portfolio
class Portfolio<T> {
    private elements: T[] = [];

    add(element: T): void {
        this.elements.push(element);
    }

    get(): T[] {
        return this.elements;
    }

    sum(): number {
        return this.elements.reduce((acc: number, element: any) => acc + element, 0);
    }

    concat(): string {
        return this.elements.reduce((acc: string, element: any) => acc + element, '');
    }
}

const portfolio = new Portfolio<number>();
portfolio.add(1);
portfolio.add(2);
portfolio.add(3);
console.log('Elementos del portfolio:', portfolio.get());
console.log('Suma de los elementos del portfolio:', portfolio.sum());

const portfolio2 = new Portfolio<string>();
portfolio2.add('Hola');
portfolio2.add(' ');
portfolio2.add('Mundo');
console.log('Elementos del portfolio:', portfolio2.get());
console.log('Concatenación de los elementos del portfolio:', portfolio2.concat());
