// Define un objeto con propiedades individuales y grupales de hobbies
const hobbies = {
    enPareja: ["ver películas", "cocinar juntos", "viajar", "hacer ejercicio", "ir a conciertos"],
    conAmigos: ["jugar videojuegos", "practicar deportes", "salir a comer", "ir de fiesta", "hacer senderismo"],
    conFamilia: ["hacer barbacoas", "jugar juegos de mesa", "visitar parques de atracciones", "celebrar eventos familiares", "ver series en familia"]
  };
  
  // Desestructura el tercer hobby individual y el cuarto grupal
  const { conFamilia: [thirdIndividualHobby], conAmigos: [, , , fourthGroupHobby] } = hobbies;
  
  //document.write( `Mi tercer hobby individual es <strong>${thirdIndividualHobby}</strong>, mientras que mi cuarto hobby grupal es <strong>${fourthGroupHobby}</strong>.`);
  
  