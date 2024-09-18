import { printIcons, printNavBar, printFooter } from "./functions/printLayout.js";
import { printProductCards } from "./functions/printProductCards.js";
import { printFilter } from "./functions/printFilter.js";
import {changeIcons} from "./functions/enLinea.js";

printIcons();
printNavBar("navbar");
printFooter("footer");

printProductCards( [] ,"products");

const searchSelector = document.querySelector("#search");
searchSelector.addEventListener("keyup", printFilter);

changeIcons();

document.getElementById("loginCheck").addEventListener("click", () => {
    localStorage.setItem("online", false);
    changeIcons();
    window.location.href = "index.html";
}); 
