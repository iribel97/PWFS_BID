import java.util.Scanner;

public class CadenIguale {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String cad1, cad2;

        System.out.print("Ingrese una palabra o frase: ");
        cad1 = scan.nextLine();

        System.out.print("Ingrese otra o la misma palabra o frase: ");
        cad2 = scan.nextLine();

        scan.close();

        if (cad1.equals(cad2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }
    }

}
