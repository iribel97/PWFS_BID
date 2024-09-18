import {perimetro} from "./perimeter.js";
import {area} from "./area.js";
import { rectangles} from "./rectangleData.js";




function imprimirRectangulo(rectangles){
    const contenido = document.querySelector("main");

    rectangles.forEach((rectangulo, i) => {
        const div = document.createElement("div");
        div.innerHTML = `
            <h1>Rectangulo ${i+1}</h1>
            <p>Altura: ${rectangulo.altura}</p>
            <p>Ancho: ${rectangulo.ancho}</p>
            <p>Area: ${area(rectangulo)}</p>
            <p>Perimetro: ${perimetro(rectangulo)}</p>
        `;
        contenido.appendChild(div);

    });
}

imprimirRectangulo(rectangles);