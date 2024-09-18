public class GenNumAleatorio {

    public static void main(String[] args){

        //MOSTRAR POR CONSOLA
        System.out.println("El numero que se genero aleatoriamente es: " + numeroAleatorio());
    }

    /* METODO */
    public static int numeroAleatorio(){
        return (int) Math.floor(Math.random() * 355) + 1;
    }

}
