import Footer from "../components/Footer";
import Hero from "../components/Hero";
import NavBar from "../components/NavBar";

function NotFound() {
  return (
    <>
      <NavBar />
      <Hero firstText="404" secondText="not found" />
      <Footer />
    </>
  );
}

export default NotFound;
