// clase Producto
class Product {
    //constructor
    constructor(id, name, price, stock, photo, onsale, supplier, colors, description) {
        this.id = id;
        this.name = name;
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
    }


    //metodos getter y setter del atributo privado
    get supplier() {
        return this._supplier;
    }

    set supplier(newSupplier) {
        this._supplier = newSupplier;
    }

    // define el método sellUnits para que cumpla los requerimientos
    sellUnits(units) {
        if (units > this.stock) {
            console.log("No hay suficiente stock");
            return;
        }
		this.stock = this.stock - units
	}

    //Imprimir todos los datos del producto
    printProduct() {
        console.log("------------------------------------------------------------------------------------------------");
        console.log("ID: " + this.id);
        console.log("Nombre: " + this.name);
        console.log("Precio: " + this.price);
        console.log("Stock: " + this.stock);
        console.log("Fotos: ");
        for (let i = 0; i < this.photo.length; i++) {
            console.log("   - " + this.photo[i]);
        }
        console.log("En oferta: " + this.onsale);
        console.log("Proveedor: " + this._supplier);
        console.log("Colores: ");
        for (let i = 0; i < this.colors.length; i++) {
            console.log("   - " + this.colors[i]);
        }
        console.log("Descripción: " + this.description);
    }
}

//instanciamos Los objetos
const product1 = new Product("001", "Laptop", 1500, 20, ["https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c08484411.png", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrbMzhmpLxmrGdPKoOLuvmQ26C-BTP2eQRS8dk-8arCOp2G6NazGU15JenGjFF1qZZI3w&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwNaMBfQ_eQiuLkHUUbc45L9FEOzDLaeOerJvxm3Ykl1SA9chGGsKJsaLJGcmNUBCfgRY&usqp=CAU"], true, "HP", ["black", "white", "blue"], "Laptop HP Omen 15");
const product2 = new Product("002", "Mouse", 20, 50, ["https://consumer.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/accessories/wireless-mouse-gt/specs-img.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3Gzb74K6JnfjjUzdiEZnCEDEGBdJH8xEh5C7x0TmjsuTSgpVMpj6eqLMbudShUH7j050&usqp=CAU", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ12K0NE8mjIvx8rwWuItN-kudTD0-xyQTANF_a3agWt5CkWIxqqX5sKPKL50oytsO-rRw&usqp=CAU"], false, "Genius", ["black", "white"], "Mouse Genius");
const product3 = new Product("003", "Keyboard", 50, 30, ["https://media.wired.com/photos/65b0438c22aa647640de5c75/master/pass/Mechanical-Keyboard-Guide-Gear-GettyImages-1313504623.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTlY3xMwZJdtA9vAJmZXhvjU46nhZ8QfXqpQ4psVATpfy7q3pz01iumwQAD_xJOjBx5tfo&usqp=CAU"], true, "Logitech", ["black", "white", "red"], "Keyboard Logitech G Pro");
const product4 = new Product("004", "Monitor", 300, 10, ["https://media.es.wired.com/photos/63b59dd32984c2acd03054a8/16:9/w_1280,c_limit/Samsung-%20Odyssey-Neo-G9-Gaming-Monitor-G95NC.png", "https://m.media-amazon.com/images/I/41+GCV1D9bL._SL500_.jpg"], false, "Samsung", ["black", "white", "gray", "blue"], "Monitor Samsung Odyssey Neo G9");


//Creamos el array de los productos
let products = [product1, product2, product3, product4];

products.forEach(product => product.printProduct());