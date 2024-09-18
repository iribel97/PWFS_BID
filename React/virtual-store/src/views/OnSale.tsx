import { useState } from "react";
import styles from "./OnSale.module.css";
import styles1 from "./Home.module.css";
import Footer from "../components/Footer";
import NavBar from "../components/NavBar";
import Hero from "../components/Hero";
import products from "../assets/products";
import OnSaleCard from './../components/OnSaleCard';
import Product from "../interfaces/Product";

export default function OnSale() {
  const [from, setFrom] = useState(0);
  const [to, setTo] = useState(3);

  const onSaleProducts = products.filter((product) => product.onsale);

  const handleNext = () => {
    if (to < onSaleProducts.length) {
      setFrom(from + 3);
      setTo(to + 3);
    }
  };

  const handlePrev = () => {
    if (from > 0) {
      setFrom(from - 3);
      setTo(to - 3);
    }
  };

  return (
    <>
      <NavBar />
      <Hero firstText={"tecnología"} secondText={"renovada"} />
      <main>
        <div className={styles1["product-container"]} id="products">
          {onSaleProducts.slice(from, to).map((each: Product) => (
            <OnSaleCard
              key={each.id}
              id={each.id}
              title={each.title}
              price={each.price}
              colors={each.colors}
              images={each.images}
            />
          ))}
        </div>
      </main>
      <div className={styles["navigation-buttons"]}>
          <button className={styles["btn-navigation"]} onClick={handlePrev} disabled={from === 0}>
            Prev
          </button>
          <button className={styles["btn-navigation"]} onClick={handleNext} disabled={to >= onSaleProducts.length}>
            Next
          </button>
        </div>
      <Footer />
    </>
  );
}
