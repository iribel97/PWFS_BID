//Objeto con datos personales
const profile = {
    nombre: "Irina",
    apellido: "Ochoa",
    edad: 23,
    tipoDeSangre: "B+",
    carrera: {
        nombre: "Ingeniería en Tecnologías de la Información",
        semestreActual: 9
    }
};


function printProfile(id = "etiqueta3") {
    // Se obtiene el elemento donde se imprimirá el template
    const container = document.getElementById(id);

    // Se crea el template
    const template = `
    Hola, mi nombre es ${profile.nombre} ${profile.apellido}, 
    tengo ${profile.edad} años, mi tipo de sangre es ${profile.tipoDeSangre} 
    y estudio la carrera de ${profile.carrera.nombre} en el semestre ${profile.carrera.semestreActual} de un total
    de ${profile.carrera?.toalSemestre || 10} semestres.
    `;

    // Se imprime el template en el contenedor
    container.innerHTML = template;
}

printProfile();

