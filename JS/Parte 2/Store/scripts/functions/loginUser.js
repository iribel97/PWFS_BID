import { getUsers } from "./registerUsers.js";

function iniciarSesion(event) {
    event.preventDefault();
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const users = getUsers();
    const user = users.find((user) => user.email === email && user.password === password);
    if (!user) {
        alert("Correo electrónico o contraseña incorrectos.");
        localStorage.setItem("online", false);
    }
    alert("Inicio de sesión exitoso.");
    localStorage.setItem("online", true);
    window.location.href = "index.html";
    
}

export { iniciarSesion };