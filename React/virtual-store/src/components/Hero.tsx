//import styles from "./Hero.module.css";

function Hero({firstText, secondText}) {
  return (
    <section className="h-[200px] bg-[url('../public/hero_bg.png')] bg-cover bg-[center_top] flex justify-center">
      <article className="w-[1080px] flex flex-col items-start justify-center pl-20">
        <span className="text-[40px] text-white font-bold">{firstText}</span>
        <span className="text-[80px] leading-[30px] text-white font-bold">{secondText}</span>
      </article>
    </section>
  );
}

export default Hero;
