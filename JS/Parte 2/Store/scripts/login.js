import { printIcons, printNavBar, hideSearch } from "./functions/printLayout.js";
import { iniciarSesion } from "./functions/loginUser.js";
import {changeIcons} from "./functions/enLinea.js";

hideSearch();
printIcons();
printNavBar("navbar");

document.getElementById("loginForm").addEventListener("submit", iniciarSesion);

changeIcons();