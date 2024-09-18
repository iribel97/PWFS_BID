import { useState, useEffect, useRef } from "react";
import styles from "./Checkout.module.css";
import Product from "../interfaces/Product";
import ProductProp from "../interfaces/ProductProp";

function Checkout({ product }: ProductProp) {
  const [quantity, setQuantity] = useState(1);
  const [button, setButton] = useState(false);
  const units = useRef<HTMLInputElement>(null);

  useEffect(() => {
    let productsOnCart: Product[] = [];
    const cart = localStorage.getItem("cart");
    if (cart) {
      productsOnCart = JSON.parse(cart);
    }
    const isInCart = productsOnCart.some((each) => each.id === product.id);
    if (isInCart) {
      const productOnCart = productsOnCart.find(
        (each) => each.id === product.id
      );
      setQuantity(productOnCart?.quantity || 1);
    } else {
      setQuantity(1);
    }
    setButton(isInCart);
  }, [product]);

  const manageCart = () => {
    let productsOnCart: Product[] = [];
    const cart = localStorage.getItem("cart");
    if (cart) {
      productsOnCart = JSON.parse(cart);
    }

    const isInCart = productsOnCart.some((each) => each.id === product.id);
    if (!isInCart) {
      productsOnCart.push({ ...product, quantity });
      setButton(true);
    } else {
      productsOnCart = productsOnCart.filter((each) => each.id !== product.id);
      setButton(false);
      setQuantity(1);
    }

    localStorage.setItem("cart", JSON.stringify(productsOnCart));
  };

  return (
    <section className="w-[340px] p-[10px] m-[10px] flex flex-col">
      <div className="bg-[#ebebeb] p-10 rounded-md">
        <span className="text-[#ff3b3c]">Total:</span>
        <h2 id="price" className="text-[28px] font-bold mt-[10px]">
          $ {(product.price * quantity).toLocaleString()}
        </h2>
        <p className="text-wrap leading-5 text-[12px]">
          Includes Country tax and AFIP collection
        </p>
        <ul className="p-0 list-none mb-[30px]">
          <li className="flex my-[15px]">
            <img src="/truck.png" alt="Truck" className="mr-[15px]" />
            <img src="/plane.png" alt="Plane" className="mr-[15px]" />
          </li>
          <li>
            <span className="text-wrap leading-5 text-[10px]">
              Add the product to the cart to know the shipping costs
            </span>
          </li>
        </ul>
        <div className={styles["checkout-process"]}>
          <div className="flex mb-[10px]">
            <input
              className="h-[40px] rounded-md border-0 w-[60px] mr-[10px] p-[5px] pl-[15px] box-border"
              id="input-quantity"
              type="number"
              min="1"
              value={quantity}
              ref={units}
              onChange={(event) => setQuantity(Number(event?.target.value))}
            ></input>
            <button
              type="button"
              className={
                button
                  ? "w-full bg-[#202020] hover:bg-[#b3aeae] text-[14px] text-white font-bold border-0 h-[40px] rounded-md"
                  : "w-full bg-[#ff3b3c] hover:bg-[#faa4a4] text-[14px] text-white font-bold border-0 h-[40px] rounded-md"
              }
              onClick={manageCart}
            >
              {button ? "Remove from cart" : "Add to cart"}
            </button>
          </div>
        </div>
      </div>
    </section>
  );
}

export default Checkout;
