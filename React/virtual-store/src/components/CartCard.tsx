import { useRef, useState } from "react";
import ProductProp from "../interfaces/ProductProp";
import { useDispatch } from "react-redux";
import productsActions from "../store/actions/products";

const { calcularTotal } = productsActions;

export default function CartCard({ product }: ProductProp) {
  const {
    id,
    title,
    description,
    price,
    stock,
    images,
    colors,
    onsale,
    quantity,
  } = product;
  const [totalPrice, setTotalPrice] = useState(price * (quantity ?? 0));
  const units = useRef<HTMLInputElement>(null);

  const dispatch = useDispatch();

  const manageUnits = () => {
    let productsOnCart = JSON.parse(localStorage.getItem("cart") || "[]");
    const foundProduct = productsOnCart.find((each) => each.id === id);
    if (foundProduct) {
      foundProduct.quantity = Number(units.current?.value);
      productsOnCart = productsOnCart.map((each) => {
        if (each.id === id) {
          return { ...foundProduct };
        }
        return each;
      });
    }
    dispatch(calcularTotal({ products: productsOnCart }));
    setTotalPrice(price * Number(units.current?.value));
    localStorage.setItem("cart", JSON.stringify(productsOnCart));
  };
  return (
    <article className="w-[340px] lg:w-[680px] md:h-[220px] flex justify-between items-center rounded-md px-[30px] py-[15px] lg:py-[30px] m-[10px] bg-[#f2f2f2]">
      <img
        className="hidden lg:inline-block w-[140px] h-[140px] rounded-sm"
        src={images[0]}
        alt={title}
      />
      <div className="flex flex-col justify-start flex-grow">
        <div className="lg:h-[120px] flex flex-col justify-between flex-grow p-[10px]">
          <span>
            <strong className="block lg:inline-block text-[16px]">
              {title}
            </strong>
            <span className="block lg:inline-block text-[12px]">
              - {colors[0]}
            </span>
          </span>
          <p className="hidden lg:inline-block w-[340px] truncate text-[12px]">
            {description}
          </p>
          <input
            className="w-[70px] rounded-sm border-1 border-[#eaeaea] p-[5px] pl-[15px] text-[14px]"
            type="number"
            name="quantity"
            defaultValue={quantity}
            ref={units}
            onChange={manageUnits}
            min="1"
            id={id}
          />
        </div>
        <strong className="text-start lg:text-end text-[14px] px-[10px]">
          AR$ ${totalPrice}
        </strong>
      </div>
    </article>
  );
}
