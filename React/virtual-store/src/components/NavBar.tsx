//import styles from "./NavBar.module.css";
import NavButton from "./NavButton";
import { Link, useLocation } from "react-router-dom";
import { useRef } from "react";
import { useDispatch, useSelector } from "react-redux";
import productsActions from "../store/actions/products";

const { capturarText } = productsActions;

function NavBar() {
  const text = useRef<HTMLInputElement>(null);

  const dispatch = useDispatch();
  const location = useLocation();

  const pathName = location.pathname;

  const textStore = useSelector((store: any) => store.products.text);

  const setText = () => {
    dispatch(capturarText({ text: text.current?.value }));
  };

  return (
    <header className="w-full min-h-[150px] bg-[#ff3b3c] p-[20px 20px 0 20px] flex flex-col items-center">
      <div
        className="w-full flex flex-col justify-between items-center flex-grow 
        md:flex-row
        lg:w-[1024px]
      "
      >
        <Link
          to="/"
          className="w-full md:w-1/3 flex items-center justify-center md:justify-start flex-grow pt-2 md:p-0"
        >
          <img
            className={"h-[50px]"}
            src="/tiendamia-logo.svg"
            width="218"
            alt="Logo store"
          />
        </Link>
        <form className="w-full md:w-1/3 flex items-center flex-grow justify-center py-2 md:py-0">
          {pathName === "/" && (
            <input
              className="h-[60px] border-0 rounded-[15px] w-full p-[10px] my-0 mx-[20px] text-[14px] text-center"
              type="text"
              placeholder="Search"
              id="search"
              ref={text}
              defaultValue={textStore}
              onChange={setText}
            />
          )}
        </form>
        <ul
          className="w-full md:w-1/3 flex items-center flex-grow justify-center pb-2
          md:justify-end md:py-0
        "
        >
          <li id="facebook" className="w-[50px] h-[50px] list-none">
            <a className="w-[50px] h-[50px]" href="https://facebook.com">
              <img
                className="w-[50px] h-[50px] p-[10px]"
                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAAXNSR0IArs4c6QAAA/RJREFUaEPtmVuoVlUQx3//fMjESMkkSyi1XrIgUjSILlCQiBVKFIRgYFAaYWqJogVdoVCLKEXMCkQwhIioECqMMPNF8ckkugndMwpT8qlpj+wT3zlnX2avvT/kgPN2zl5z+a2Zvfas+cQIF43w+DkLcKYz2FkGzGwyMAe4GbgF8L975Yfs/59mz/cAuyX91AV8KwAzuwxYAcwFrmgY0FfAh8AGSQ6XJEkAZjYGWAesSfI6XOkJSc+m2GoMYGZ3AZuBSSkOK3SOAoslfdLEbhgg3/U3gHubOEhYu0XSQ1G9EICZTQA+Aq6NGm65zl/2eZJO1tmpBTCz84C9wHV1xjp+7hs2R9K/VXYjALuAuzsKzo/ObwAPajxwDnB1he31WRYeTwYws0eBl1oG7zv5NHBI0omhtszsSsCP1DK5Q9L7ZQ9LM2Bmfsr4bnkJpYgH+4Ckt6uUzexi4OeKNf5sqqRTRWuqALYDC1Miz3VuixyJAQA3t07Sc2GAPK1H8hpNYXhPkn8vaiUI8CdwqaR/hhoszICZvQYsrfWeWLe9akEAV3lY0qZagPzY/A0Y2wJgbNkZbmZP5aU5taH9g5JmRAA89e82NN67/Jiki4r0zcx7p+db2PYyGtTFDishM9sILG/h5Kiky0sADrT8IC6UtKPXdhHAZ8CNfQL4DiiEC/rbKGllHcDvgPc+qVKVge8Bv0OkygeS5tUBWKr1XK+fAIclTR/JAMclXVAH8HeDI/RA1qfMbJMxM/Pe3y9IETkpadDxXvQSe/8TPaO7AHgZWBaJ3nszSYPu3kUAX2RTg+uDBrsA2A3cHvS3T9INdSX0DjA/aLALgG+BKUF/uyTdUwfgY5INQYOtAMzsXKCwTS7xv0zSK3UAdReMXn2/iDw4xNkpSfuLAjAzL83RPc/8m/BWcLN82RRJ/i35X8q60a+BaQ0M9y7t13fgS0lXDY2pDGAtkDRoAvoF8JikYaVdBnA+8GvidbIfAH8Bl4QvNJ4mM1sPDGqcgiXVD4BnsvHKk0X+q+7EE4HDwIXBwAeWdQ3wI3CNJL9WDpPKuZCZ3Qp8fAYBfH50k6TPy2KIDLZeAFY1gOgyA6XTiIF4IgCjgJ0NpnNdAfgg2edKle19LUD+QjuEtxh3BjLRBUAoeI8lBDAQdPaLzJvA/TUQbQFelfRIYKNOL2kEkGdjAbANGFfiJBXARzmLJHl3GpbGADmEzzP9q3hfgacUgNezpm51tvN/hCPPFyYB9JSUt8GrfecA7yxdogA+/N0KvJj9IvNL08DDp1DEcD7NmwXMzjvGJUV6ZuajQR+t+MWk9GyP+OwUoInDrte2KqGug0mxdxYgZde61PkPoFiDQMAu40AAAAAASUVORK5CYII="
              />
            </a>
          </li>
          <li id="instagram" className="w-[50px] h-[50px] list-none">
            <a className="w-[50px] h-[50px]" href="https://instagram.com">
              <img
                className="w-[50px] h-[50px] p-[10px]"
                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAAXNSR0IArs4c6QAABJdJREFUaEPtmWmolkUUx3//VtoLsj2zpLCiD+20SLRQtEB9iII+tECIVGYbBaIVpQQtJmG0QLRQEEEUpBDRIhUSCvZBW2xTW6gwK0zLD9ppzmVeee69z/PMzH3ve28X7oH3yztnzsx/zn/OMo8Y46Ixvn/GAYy2B8c9MOY8YGaHANcAlwFHAYd3CeJ74DtgMfCypF9K7GVTyMx2A+YCM4EdSxYp0N0GPA7cK+mfnHlZAMzsQuBZ4Igco8Ogsw64QdIHKVtJAGZ2NvBRylCPxs+R9GGb7VYAkTZfjODJD9zrWuC4NjqlADwBzOjR6eaanS/pziblRgBm5nz3E+i1PA28A5wOTAP2q1lwoqQf6jbSBuAm4Mke736xJA/HfWJm84BZNWtOl/RMKYDngweu7wLAZuBrYC9gcoOdfvQwsyuAN2p0n5N0YykAv/1TCwH8GL3mJ7uycrL7BJqcCZwH3FWx6UnsBEkbowfeDRHv/Jo1l0g6txSAx+KJBQDmSpqT0jez40MGfwk4Keq6p14BzgJ8rE7WSjqyFMDvDReqzs4tkvrdFzPboRJ+10n6tzrRzBbErJ7C7OMbJO1fCsByLAMPSLqvQhfnu9+dq4Bj4v9fhnj+GvCCpDUV3WWhBjo1Y52NkpyGg6Q2CpmZ1zpbMww7hydL6tM1s8sjxz1718mScKkfk7Qo6jvYz4FdEmttkuTBIA9ANJ7jgRnBtQujvnP0xYyL7/XNdZ24bmavAlcnAPwlae9sAGa2O+CXq00c4ARJGyKA+4MTtlMpMXe2JI/57rXpwFPD6gEz2yNQYVPC6GpJUyp8XtUSRQaaWiHp5Ajg6NBffJVYa7OkPUs8sCuwJWF0qSQPfX6Kh8WyI7dP+FuSH1KfmNnPwEEt622TtFMJAA+B3ly0yXJJp1UAfJtxGTv2+nHazHyud3eNIqk24LTVQqlL/Kuk7admZiuAExOgO8OfSDojgvfw+GdqXhGAmIRSHvA1p0haHTfiRVjfxcyQuwOFHonzvER4PzFna7j0O2dTKBpOecDVZkl6KOofHDKvF4AXJTbjzbu3i+vjvDs8NyTmbJHkPfkg6YZCbmy9pAM6VmPvfBtwccOGPIEtkPRe3Py+wKchQ09KACjLAwUecNWHQ8t3TwWEA7oW8NL4WA8yMdu+6YmukzfiGu6NSzIo91uotSb0wgMdm7dL8uIsW8zMaeP0yZEhVaNe2x+aYz3qzAs10eyUfigdPPl5OZ1TxHXMrZFUG2bb7sBy4JTUhgaM/wR4bfSWpM8GzjUzb84fLbTp6sskec88SNoAOGe9uhyqeCnyTUyIBwKerYcqr0u6shRATngb6oZK582U5E88RR5wznmK/z/IJEne4uYDcE0zcz7fPMoIFobQ2/i4lnqZ8xLWnxa74W83+D0oeLnSWNrnPO56afB2N7voYu4FnazdZCMJIFLp0lCv+xPgSHnC+T5Nkj85tkoWgAjCG5AHgVt7/IHDM/qcYf3AUT2Cyicm94q/KnT7iclfAJfG38eS/kidenU82wMlRkdSdxzASJ52cSIb7c3lrD9OoZxT6qXOfxP4g0B5AWE+AAAAAElFTkSuQmCC"
              />
            </a>
          </li>
          <li id="cart" className="w-[50px] h-[50px] list-none">
            <Link className="w-[50px] h-[50px]" to="/cart">
              <img
                className="w-[50px] h-[50px] p-[10px]"
                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADwAAAA8CAYAAAA6/NlyAAAAAXNSR0IArs4c6QAAA81JREFUaEPtml2ITVEUx/9/UsjDiDFJHpQ8iAfNNCFfSV4YKUUzJOHVw0QKTT4ilDJ58UBpkq/yIIM3GV9NE0Z58aCRfGZGyseDByx3ZV/dtn3vuedjnzNz792vZ++11m//V3vts84hqmywynhRA650xWsK1xSusB2opXSFCfofTk1h3RIRkRGu9ACAXSSv2RxOhSsAWDl/A6gj+a0QupKBlXMayffVAjxEcko1pfQFkpvKAnYdWCJSD+ADgNHW8+Uk72R1yImIxvMVwHgrho0kL0YGNqf3DQCrLCPnSG7NEHgZAHvDtcpMJPklLvAGAJctI98B1JP8kQW0iBwHsNvy3UdyviueUBcPERkLYAjABMtYK0l7I1LhF5FnAOZazvaTPBQb2KT1WQDbLGO3SNqp7h3YnCuDDkfNuXgeJQW8FECPZewXgKkkVf3UhojoxqsAhUNjaCDpvC2GSmmjsK55o0XdctROsjM12r9X4KsA1lk+z5PcXCyO0MAG+giAvZbRfpKNaQGXKEdtJC8lDTwDwEuH0dkkn6cBLSKLAdyzfBUtR/l5kRQ2Kuuh0GQ5PEZyT0rArizrJbmwlP84wDsAnLKMvwMwvdiBkeRGiEg/gHmWzQ6Sh30B1wH4lMVVs0Q5aiL5xAuwSetuAKstBw8A3E5STYetWQBa7XLkejuy10ZOaQO8HsAVz3Dlmu8iuSVoclzgMQA+O66aQX59PF9BMjCzYgEblc8A2O6DIITN+ySXlDM/CWB1dLccZ57maMNuQbnX2tjARuXXWo4soMcAbnqCzJv9SPJ0GB9JAWvt22c5HiA5M0wwacxNCrjYVTOwLqYBWegjEWCT1n0Ami2AzlybpT1tKG8Xj0LDIuK6av4E0EhSuxLDYiSp8KRceXoLQNtA9tDu4QsPxD0k7WZESTeJAZu0PgFgpwewYiYPkjwQxl/SwJMBaIkaFyaIGHOzBTYqrwSgX+3SgM4e2EBr2/Soo2kfQ0zn0uEBnA8t12SbY3rG2vCze9lJwGd7aCVB4NtGooeW72CTsO8dWEROAmgDoCd4b65Oa6NPP8oFjjhrixn3Ciwi1wG0OJy3BEHHWVtqJ70Bi4j2urTn5RoPSS4qFlictUFp4xO4A4DzC57+cELS/rD+L1YRibw2S2DXy0Q+nsHci3tDCYUjr80SWDsgr3Iqj3IEUfK1UUQir80M2Ny49KeSLgu6m+SaoMBEJPLaTA6tgtuWqrVWfxID8DTodC4M1igdaW0mZSlIxSyeezuls4Apx2cNuJxdGslzagqPZPXKib3qFP4DPc5DTOx+iUAAAAAASUVORK5CYII="
              />
            </Link>
          </li>
        </ul>
      </div>
      <nav
        className="w-full lg:w-[1024px] py-[15px] px-[20px] bg-[#ff3b3c] flex justify-between text-[14px]"
        id="navbar"
      >
        <NavButton title="Ofertas" link="/onSale" />
        <NavButton title="Cómo comprar" link="/" />
        <NavButton title="Costos y tarifas" link="/" />
        <NavButton title="Mis pedidos" link="/" />
        <NavButton title="Garantía" link="/" />
      </nav>
    </header>
  );
}

export default NavBar;
