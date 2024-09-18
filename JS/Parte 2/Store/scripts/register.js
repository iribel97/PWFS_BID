import { printIcons, printNavBar, hideSearch } from "./functions/printLayout.js";
import { handleRegister } from "./functions/registerUsers.js"
import {changeIcons} from "./functions/enLinea.js";

hideSearch();
printIcons();
printNavBar("navbar");

document.getElementById("registerForm").addEventListener("submit", handleRegister);
changeIcons();