//import styles from "./Description.module.css";
import ProductProp from "../interfaces/ProductProp";

function Description({ product }: ProductProp) {
  return (
    <section className="w-[340px] p-[10px] m-[10px] flex flex-col">
      <h1 className="text-[28px] font-bold mt-0 text-wrap">{product.title}</h1>
      <form className="mt-[30px]">
        <fieldset className="border-0 p-0 flex flex-col">
          <label className="text-[12px] font-bold" htmlFor="color">
            Color
          </label>
          <select
            className="w-full h-[40px] bg-white rounded-[10px] border border-[#b8b7b7] m-0 mt-[10px] p-[10px]"
            id="color"
          >
            {product.colors.map((each) => (
              <option key={each} value="Silver">
                {each}
              </option>
            ))}
          </select>
        </fieldset>
      </form>
      <div className="mt-[30px]">
        <span className="text-[12px] font-bold">Descripción</span>
        <p className="text-[12px]">{product.description}</p>
      </div>
    </section>
  );
}

export default Description;
