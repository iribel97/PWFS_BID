//Captura el parámetro id de la URL
//Variable query que almacena la query string de la URL
const query = location.search;
//Variable params que almacena la query string en un objeto
const params = new URLSearchParams(query);
//Variable id que almacena el valor del parámetro id
const id = params.get('id');
console.log(id);