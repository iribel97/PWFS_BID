function isOnline(){
    //ver si en el localStorage hay un valor de la variable online
    let online = localStorage.getItem("online");
    //si no existe la variable online en el localStorage se crea con el valor de false
    if(online === null){
        localStorage.setItem("online", false);
        return false;
    } else {
        //si existe la variable online en el localStorage se retorna su valor
        return JSON.parse(online);
    }
}

function changeIcons(){
    if(isOnline()){
        document.getElementById("cart").style.display = "inline";
        document.getElementById("loginCheck").style.display = "inline";
        document.getElementById("login").style.display = "none";
    } else {
        document.getElementById("cart").style.display = "none";
        document.getElementById("loginCheck").style.display = "none";
        document.getElementById("login").style.display = "inline";
    }
}


export {changeIcons}