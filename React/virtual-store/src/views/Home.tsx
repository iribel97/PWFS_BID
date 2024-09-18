//import styles from './Home.module.css';
import Footer from "../components/Footer";
import NavBar from "../components/NavBar";
import Hero from "../components/Hero";
import ProductCard from "../components/ProductCard";
//import products from "../assets/products";
import Product from "../interfaces/Product";
import axios from "axios";
import { useEffect, useState } from "react";
import { useSelector } from "react-redux";




function Home() {

  const [products, setProducts] = useState<Product[]>([]);

  const text = useSelector((store: any) => store.products.text);

  useEffect(() => {
    axios.get("/JSON/products.json")
       .then((res) => {
          const filtered = res.data.filter((each: Product) => each.title.toLowerCase().includes(text.toLowerCase()));
          setProducts(filtered)
        })
       .catch((err) => console.log(err));
  }, [text]);


  return (
    <>
      <NavBar />
      <Hero firstText={"tecnología"} secondText={"renovada"} />
      <main className="w-full flex justify-center items-center p-[20px]">
        <div className="w-[1080px] flex flex-wrap justify-between" id="products">
        {products.map((each: Product) => (
            <ProductCard
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
      <Footer />
    </>
  );
}

export default Home;
