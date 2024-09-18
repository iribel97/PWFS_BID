// Definir la clase de la calculadora
class calculadora{
    //Definir el constructor
    constructor(num1, num2){
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = 0;
    }

    //Definir la funcion suma
    suma(){
        this.resultado = this.num1 + this.num2;
        console.log(`La suma de ${this.num1} y ${this.num2} es ${this.resultado}`);
    }

    //Definir la funcion resta
    resta(){
        this.resultado = this.num1 - this.num2;
        console.log(`La resta de ${this.num1} y ${this.num2} es ${this.resultado}`);
    }

    //Definir la funcion multiplicacion
    multiplicacion(){
        this.resultado = this.num1 * this.num2;
        console.log(`La multiplicacion de ${this.num1} y ${this.num2} es ${this.resultado}`);
    }

    //Definir la funcion division
    division(){
        this.resultado = this.num1 / this.num2;
        console.log(`La division de ${this.num1} y ${this.num2} es ${this.resultado}`);
    }

    //Definir la funcion potencia
    potencia(){
        this.resultado = Math.pow(this.num1, this.num2);
        console.log(`La potencia de ${this.num1} elevado a ${this.num2} es ${this.resultado}`);
    }
}


//Instanciar la clase calculadora
let calculadora1 = new calculadora(5, 2);
calculadora1.suma();
calculadora1.resta();
calculadora1.multiplicacion();
calculadora1.division();
calculadora1.potencia();