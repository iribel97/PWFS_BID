import java.util.Scanner;

public class ValidaPassword {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        scanner.close();

        if(esSegura(password)){
            System.out.println("Contraseña segura");
        } else {
            System.out.println("Contraseña incorrecta");
        }

    }

    
    public static boolean esSegura(String password){
        if(tieneLongitudCorrecta(password) && tieneMayuscula(password) && tieneMinuscula(password) 
        && tieneNumero(password) && tieneCaracterEspecial(password) ){
            return true;
        }
        return false;
    }
    

    public static boolean tieneLongitudCorrecta(String password){
        if(password.length()<8){
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return false;
        }

        return true;
    }
    
    public static boolean tieneMayuscula(String password){
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula.");
            return false;
        }
        return true;
    }

    public static boolean tieneMinuscula(String password){
        if (!password.matches(".*[a-z].*")) {
            System.out.println("La contraseña debe contener al menos una letra minúscula.");
            return false;
        }
        return true;
    }

    public static boolean tieneNumero(String password){
        if (!password.matches(".*\\d.*")) {
            System.out.println("La contraseña debe contener al menos un número.");
            return false;
        }
        return true;
    }

    public static boolean tieneCaracterEspecial(String password){

        if (!password.matches(".*[!@#$%^&*].*")) {
            System.out.println("La contraseña debe contener al menos un carácter especial.");
            return false;
        }

        return true;

    }

}
