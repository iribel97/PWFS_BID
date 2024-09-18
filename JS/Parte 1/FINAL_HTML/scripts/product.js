// clase Producto
class Product {
    //constructor
    constructor(id, title, price, stock, photo, onsale, supplier, colors, description, taxPolicy) {
        this.id = id;
        this.title = title ;
        this.price = price;
        this.stock = stock;
        this.photo = photo;
        this.onsale = onsale;
        //Atributo privado
        this._supplier = supplier;
        //Array de colores
        this.colors = colors;
        //Descripción
        this.description = description;
        //Política de impuestos
        this.taxPolicy = taxPolicy;
    }


    //metodos getter y setter del atributo privado
    get supplier() {
        return this._supplier;
    }

    set supplier(newSupplier) {
        this._supplier = newSupplier;
    }

}

//instanciamos Los objetos
const product1 = new Product("001", "Macbook Pro 15'4", "$750.000", 20, ["./assets/mock2.jpg"], "50% Off", "Mac", ["black","white"], "Space Gray", "Incluye impuesto País y percepción AFIP");
const product2 = new Product("002", "Havit HV-MS801", "$30", 20, ["./assets/MouseGaming1.jpg", "./assets/MouseGaming2.jpeg", "./assets/MouseGaming3.jpeg"], "50% Off", "Havit", ["black","white"], "Mouse Optical Mouse Gaming", "Incluye impuesto País y percepción AFIP");
const product3 = new Product("003", "K616 Fizz Rgb Pro", "$99", 20, ["./assets/teclado1.jpeg", "./assets/teclado2.jpeg", "./assets/3teclado2.jpeg"], "50% Off", "Redragon", ["black","white"], "Teclado Gamer", "Incluye impuesto País y percepción AFIP");
const product4 = new Product("004", "Macbook Pro 15'4", "$750.000", 20, ["./assets/mock2.jpg"], "50% Off", "Mac", ["black","white"], "Space Gray", "Incluye impuesto País y percepción AFIP");
const product5 = new Product("005", "Macbook Pro 15'4", "$750.000", 20, ["./assets/mock2.jpg"], "50% Off", "Mac", ["black","white"], "Space Gray", "Incluye impuesto País y percepción AFIP");
const product6 = new Product("006", "Macbook Pro 15'4", "$750.000", 20, ["./assets/mock2.jpg"], "50% Off", "Mac", ["black","white"], "Space Gray", "Incluye impuesto País y percepción AFIP"); 


//Creamos el array de los productos
let products = [product1, product2, product3, product4, product5, product6];