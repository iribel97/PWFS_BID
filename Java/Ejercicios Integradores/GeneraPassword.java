public class GeneraPassword {

    public static void main(String[] args) {
        int longitud = 8;
        char[] password = new char[longitud];
        int i = 0;
        while (i < longitud) {
            char caracter = (char) (Math.random() * 127);
            if (Character.isUpperCase(caracter) || Character.isLowerCase(caracter) || Character.isDigit(caracter)) {
                password[i] = caracter;
                i++;
            }
        }
        String passwordString = "";
        for (int j = 0; j < longitud; j++) {
            passwordString += password[j];
        }
        System.out.println(passwordString);
    }
}
