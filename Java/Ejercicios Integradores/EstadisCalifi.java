import java.util.Arrays;

public class EstadisCalifi {
    
    /*
     * Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. 
     * Estas calificaciones se almacenarán en un arreglo de Strings.
     * Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, 
     * separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). 
     * Necesitarás convertir los String a double para lograrlo.
     * Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.
     * Por último, imprimiré los resultados en consola.
     */

    public static void main(String[] args) {
        /*
         * VARIABLES
         */
        //Array para guardar las calificaciones
        String[] calificaciones = new String[10];
        //3 arreglos nuevos
        double[] desaprobados = new double[calificaciones.length];
        double[] aprobados = new double[calificaciones.length];
        double[] excelentes = new double[calificaciones.length];
        //Promedio General
        double promedioCalificaciones = 0;
        //Promedios de las 3 clasificaciones de calificaciones
        double promedioDesaprobados = 0;
        double promedioAprobados = 0;
        double promedioExcelentes = 0;

        //Generar calificaciones aleatorias
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = String.valueOf((int) (Math.random() * 11));
        }


        //Clasificar las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            double calificacion = Double.parseDouble(calificaciones[i]);
            promedioCalificaciones += calificacion;
            if (calificacion < 4) {
                desaprobados[i] = calificacion;
                promedioDesaprobados += calificacion;
            } else if (calificacion < 10) {
                aprobados[i] = calificacion;
                promedioAprobados += calificacion;
            } else {
                excelentes[i] = calificacion;
                promedioExcelentes += calificacion;
            }
        }
        //Sacar promedio
        promedioCalificaciones /= calificaciones.length;
        promedioDesaprobados /= calificaciones.length;
        promedioAprobados /= calificaciones.length;
        promedioExcelentes /= calificaciones.length;

        System.out.println("Calificaciones: " + String.join(", ", calificaciones));
        System.out.println("Promedio de calificaciones: " + promedioCalificaciones);
        System.out.println("Desaprobados: " + Arrays.toString(desaprobados));
        System.out.println("Promedio de desaprobados: " + promedioDesaprobados);
        System.out.println("Aprobados: " + Arrays.toString(aprobados));
        System.out.println("Promedio de aprobados: " + promedioAprobados);
        System.out.println("Excelentes: " + Arrays.toString(excelentes));
        System.out.println("Promedio de excelentes: " + promedioExcelentes);
    }

}
